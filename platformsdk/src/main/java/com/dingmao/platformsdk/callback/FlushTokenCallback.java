package com.dingmao.platformsdk.callback;

import android.os.Handler;
import android.util.Log;

import com.dingmao.platformsdk.PlatformBaseResponse;
import com.dingmao.platformsdk.PlatformClient;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Create by atu on 2020/8/18
 */
public abstract class FlushTokenCallback<T> implements Callback {

    private Handler mHandler = PlatformClient.getMainHandler();

    //在主线程回调
    public abstract void onSuccess(T t);

    public abstract void onFailed(String msg);

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
                    Log.e("json=======",json);
                    Class clz = this.getClass();
                    ParameterizedType type = (ParameterizedType) clz.getGenericSuperclass();
                    //获取泛型参数的实际类型
                    Type[] types = type.getActualTypeArguments();
                    Log.e("getSuperclass======",types[0] + "");
                    Class<T> cls = (Class<T>) types[0];
                    T t = gson.fromJson(json, cls);
                    mHandler.post(() -> {
                        onSuccess(t);
                    });
                } else {
                    mHandler.post(() -> {
                        try {
                            String msg = jsonObject.getString("msg");
                            onFailed(msg);
                        } catch (JSONException e) {
                            onFailed(e.getMessage());
                        }
                    });
                }
            }
        } catch (JSONException e) {
            mHandler.post(() -> {
                onFailed(e.getMessage());
            });
        }
    }

    @Override
    public void onFailure(Call call, IOException e) {
        mHandler.post(() -> onFailed(e.getMessage()));
    }
}
