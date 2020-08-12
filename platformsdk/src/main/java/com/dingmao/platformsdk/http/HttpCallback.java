package com.dingmao.platformsdk.http;

/**
 * Author : Wang_ke
 * Description :
 * Date : 2020-08-06
 */
public interface HttpCallback {

    //网络请求失败，没连网
    void onHttpFailure();

    //网络请求成功
    void onSuccess(String result);

    //网络请求成功，后台服务器有误
    void onError(String result);
}
