package com.dingmao.platformsdk.login;

/**
 * Create by atu on 2020/8/13
 */
public class LoginKeyResponse {
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "LoginKeyResponse{" +
                "key='" + key + '\'' +
                '}';
    }
}
