package com.dingmao.platformsdk.callback;

import android.os.Handler;
import android.util.Log;

import com.dingmao.platformsdk.PlatformBaseResponse;
import com.dingmao.platformsdk.PlatformClient;
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
 * Create by atu on 2020/8/17
 * 处理解析 返回数组格式[{"system_no":"warehouse","system_name":"钢结构仓储管理系统","company_id":"34","children":[]}]
 */
public abstract class PlatformListCallback<T> implements Callback {
    private Handler mHandler = PlatformClient.getMainHandler();
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    //在主线程回调
    public abstract void onSuccess(List<T> t);

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
                    Log.e("getSuperclass======", types[0] + "");
                    Class<T> cls = (Class<T>) types[0];

                    JsonArray asJsonArray = new JsonParser().parse(json).getAsJsonArray();
                    Log.e("asJsonArray==========", asJsonArray.toString());
                    Iterator<JsonElement> iterator = asJsonArray.iterator();
                    ArrayList<T> list = new ArrayList();
                    while (iterator.hasNext()) {
                        JsonElement next = iterator.next();
                        Log.e("JsonElement==========", next.toString());
                        T t = gson.fromJson(next, cls);
                        list.add(t);
                    }
                    Log.e("t==========", list.toString());
                    mHandler.post(() -> {
                        onSuccess(list);
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
            mHandler.post(() ->{
                onFailed(e.getMessage());
            });
        }
    }

    @Override
    public void onFailure(Call call, IOException e) {
        mHandler.post(() -> onFailed(e.getMessage()));
    }

}
