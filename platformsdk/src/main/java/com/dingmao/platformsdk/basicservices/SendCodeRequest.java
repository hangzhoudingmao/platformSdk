package com.dingmao.platformsdk.basicservices;

/**
 * Create by atu on 2020/8/17
 * 发送验证码
 */
public class SendCodeRequest {
    private String phone;
    /**
     * 用途（1：登录，2：注册，3：修改密码）
     */
    private String usage_code;
    /**
     * 模板编码
     */
    private String template_no;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsage_code() {
        return usage_code;
    }

    public void setUsage_code(String usage_code) {
        this.usage_code = usage_code;
    }

    public String getTemplate_no() {
        return template_no;
    }

    public void setTemplate_no(String template_no) {
        this.template_no = template_no;
    }
}
