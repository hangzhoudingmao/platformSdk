package com.dingmao.platformsdk;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Create by atu on 2020/8/13
 * 数据回调
 * 处理返回 {"system_no":"warehouse","system_name":"钢结构仓储管理系统","company_id":"34","children":[]} 对象的数据
 */
public abstract class PlatformCallback<T> implements Callback {
    private Handler mHandler = PlatformClient.getMainHandler();
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    //在主线程回调
    public abstract void onSuccess(T t);
    public void onSuccess(String msg){};

    public abstract void onFailed(String msg);

    public abstract void onTokenInvalid(String msg);

    @Override
    public void onResponse(Call call, Response response) throws IOException {
        String json = response.body().string();
        Gson gson = new Gson();
        try {
            JSONObject jsonObject = new JSONObject(json);
            if (jsonObject.has("code") && jsonObject.has("msg") && jsonObject.has("data")) {
                if (jsonObject.getInt("code") == 0) {
                    PlatformBaseResponse platformBaseResponse = gson.fromJson(json, PlatformBaseResponse.class);
                    json = gson.toJson(platformBaseResponse.getData());
                    Class clz = this.getClass();
                    ParameterizedType type = (ParameterizedType) clz.getGenericSuperclass();
                    //获取泛型参数的实际类型
                    Type[] types = type.getActualTypeArguments();
                    Class<T> cls = (Class<T>) types[0];
                    T t = gson.fromJson(json, cls);
                    mHandler.post(() -> {
                        onSuccess(t);
                    });
                } else {
                    mHandler.post(() -> {
                        try {
                            String msg = jsonObject.getString("msg");
                            int code = jsonObject.getInt("code");
                            onFailed(msg);
                        } catch (JSONException e) {
                            onFailed(e.getMessage());
                        }
                    });
                }
            }
        } catch (JSONException e) {
            sendMsg(ApiConstant.TYPE_FAILUER,this,null, e.getMessage());
        }
    }

    @Override
    public void onFailure(Call call, IOException e) {
        mHandler.post(() -> onFailed(e.getMessage()));
    }

    private void sendMsg(int type, PlatformCallback<T> callback, T t, String msg){
        Message message = null;
        switch (type){
            case ApiConstant.TYPE_SUCCESS:
                message = mHandler.obtainMessage(PlatformClient.MESSAGE_SUCCESS);
                break;
            case ApiConstant.TYPE_FAILUER:
                message = mHandler.obtainMessage(PlatformClient.MESSAGE_FAILURE);
                break;
        }
        if (message == null) return;
        message.obj = new PlatformClient.DataResult<T>(t,callback,msg,type);
        message.sendToTarget();
    }
}
