package com.dingmao.platformsdk.callback;

import android.os.Handler;

import com.dingmao.platformsdk.PlatformBaseResponse;
import com.dingmao.platformsdk.PlatformClient;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Create by atu on 2020/8/18
 * 不需要返回数据时  比如 更新一条数据  只需要一个提示的时候
 */
public abstract class PlatformStringCallback implements Callback {
    private Handler mHandler = PlatformClient.getMainHandler();

    //在主线程回调
    public abstract void onSuccess(String msg);

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
                    mHandler.post(() -> {
                        onSuccess(platformBaseResponse.getMsg());
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
