package com.dingmao.platformsdk.basicservices;

/**
 * Create by atu on 2020/8/17
 * 验证码校验
 */
public class CheckCodeRequest {
    /**
     * 待验证验证码
     */
    private String code;
    /**
     * 用途
     */
    private String usage_code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUsage_code() {
        return usage_code;
    }

    public void setUsage_code(String usage_code) {
        this.usage_code = usage_code;
    }
}
