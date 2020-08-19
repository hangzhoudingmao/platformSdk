package com.dingmao.platformsdk.login;

/**
 * Create by atu on 2020/8/14
 */
public class ValidKeyReq {
    private String key;
    private String auth_code;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getAuth_code() {
        return auth_code;
    }

    public void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
    }
}
