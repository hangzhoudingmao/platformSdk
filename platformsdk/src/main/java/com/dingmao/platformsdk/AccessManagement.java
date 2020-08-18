package com.dingmao.platformsdk;

import android.util.Log;

import com.dingmao.platformsdk.internal.util.SPUtils;
import com.dingmao.platformsdk.login.LoginKeyRequest;
import com.dingmao.platformsdk.login.LoginKeyResponse;
import com.dingmao.platformsdk.login.LoginRequest;
import com.dingmao.platformsdk.login.LoginResponse;
import com.google.gson.Gson;

/**
 * Create by atu on 2020/8/14
 * 登录
 */
class AccessManagement {

    private static final String TAG = AccessManagement.class.getSimpleName();

    private static LoginKeyRequest prepareKey() {
        return new LoginKeyRequest(ApiConstant.SYSTEM_NO, ApiConstant.AUTH_CODE);
    }

    private static void doLoginKey(PlatformCallback callback){
        String loginKeyUrl = ApiConstant.LOGIN_KEY;
        OkHttpUtils.getInstance().doPost(loginKeyUrl,new Gson().toJson(prepareKey()),callback);
    }

    static void doLogin(final LoginRequest request, final PlatformCallback callback) {
        doLoginKey(new PlatformCallback<LoginKeyResponse>() {
            @Override
            public void onSuccess(LoginKeyResponse loginKeyResponse) {
                SPUtils.put(ApiConstant.KEY_SECRET,loginKeyResponse.getKey());
                String loginUrl = ApiConstant.LOGIN;
                request.setLogin_type("1");
                String json = new Gson().toJson(request);
                Log.e(TAG,json);
                OkHttpUtils.getInstance().doPost(loginUrl, json, new PlatformCallback<LoginResponse>() {
                    @Override
                    public void onSuccess(LoginResponse loginResponse) {
                        SPUtils.put(ApiConstant.KEY_TOKEN,loginResponse.getAccess_token());
                        SPUtils.put(ApiConstant.KEY_REFRESH_TOKEN,loginResponse.getRefresh_token());
                        SPUtils.put(ApiConstant.KEY_PHONE, loginResponse.getPhone());
                        callback.onSuccess(loginResponse);
                    }

                    @Override
                    public void onFailed(String msg) {
                        callback.onFailed(msg);
                    }

                    @Override
                    public void onTokenInvalid(String msg) {
                        callback.onTokenInvalid(msg);
                    }
                });
            }

            @Override
            public void onFailed(String msg) {
                callback.onFailed(msg);
            }

            @Override
            public void onTokenInvalid(String msg) {
                callback.onTokenInvalid(msg);
            }
        });
    }
}
