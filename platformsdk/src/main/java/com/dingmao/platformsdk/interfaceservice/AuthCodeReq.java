package com.dingmao.platformsdk.interfaceservice;

/**
 * Create by atu on 2020/8/19
 */
public class AuthCodeReq {
    private String auth_code;//原授权码
    private String code;//手机验证码

    public String getAuth_code() {
        return auth_code;
    }

    public void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
