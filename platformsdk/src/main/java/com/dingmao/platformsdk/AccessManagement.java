package com.dingmao.platformsdk;

import android.text.TextUtils;
import android.util.Log;

import com.dingmao.platformsdk.callback.PlatformStringCallback;
import com.dingmao.platformsdk.internal.util.SPUtils;
import com.dingmao.platformsdk.internal.util.StringUtils;
import com.dingmao.platformsdk.login.LoginByCodeReq;
import com.dingmao.platformsdk.login.LoginKeyRequest;
import com.dingmao.platformsdk.login.LoginKeyResponse;
import com.dingmao.platformsdk.login.LoginByPwdReq;
import com.dingmao.platformsdk.login.LoginResponse;
import com.dingmao.platformsdk.usermanagement.ResetPwdReq;
import com.dingmao.platformsdk.verifynull.VerifyAnnotation;
import com.dingmao.platformsdk.verifynull.VerifyResult;
import com.google.gson.Gson;

import java.util.List;

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
        LoginKeyRequest loginKeyRequest = prepareKey();
        OkHttpUtils.getInstance().doPost(loginKeyUrl,new Gson().toJson(loginKeyRequest),callback,StringUtils.ObjNotNull(loginKeyRequest));
    }

    /**
     * 账号密码登录
     * @param request
     * @param callback
     */
    static void doLoginByPwd(final LoginByPwdReq request, final PlatformCallback callback) {
        doLoginKey(new PlatformCallback<LoginKeyResponse>() {
            @Override
            public void onSuccess(LoginKeyResponse loginKeyResponse) {
                SPUtils.put(ApiConstant.KEY_SECRET,loginKeyResponse.getKey());
                String loginUrl = ApiConstant.LOGIN_PWD;
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
                },StringUtils.ObjNotNull(request));
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

    /**
     * 验证码登录
     * @param request
     * @param callback
     */
    public static void doLoginByCode(LoginByCodeReq request, PlatformCallback callback) {
        doLoginKey(new PlatformCallback<LoginKeyResponse>() {
            @Override
            public void onSuccess(LoginKeyResponse loginKeyResponse) {
                SPUtils.put(ApiConstant.KEY_SECRET,loginKeyResponse.getKey());
                String loginUrl = ApiConstant.LOGIN_CODE;
                request.setLogin_type("2");
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
                },StringUtils.ObjNotNull(request));
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

    /**
     * 登出
     * @param callback
     */
    public static void doLogout(String url, PlatformStringCallback callback) {
        OkHttpUtils.getInstance().doPost(url,"",new PlatformStringCallback(){
            @Override
            public void onSuccess(String msg) {
                SPUtils.clear(PlatformSDK.getContext());
                callback.onSuccess(msg);
            }

            @Override
            public void onFailed(String msg) {
                callback.onFailed(msg);
            }

        });
    }

    /**
     * 重置密码-旧密码
     * @param request
     * @param callback
     */
    public static void doResetPwdByPwd(ResetPwdReq request, PlatformStringCallback callback) {

    }
}
