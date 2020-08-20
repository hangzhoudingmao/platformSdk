package com.dingmao.platformsdk.login;

import com.dingmao.platformsdk.verifynull.NotNull;

/**
 * Create by atu on 2020/8/18
 */
public class LoginByCodeReq {

    @NotNull(fileName = "手机号")
    private String phone;//

    @NotNull(fileName = "验证码")
    private String code;//验证码
    private String login_type;//登录类型（1：密码登录，2：验证码登录），此处值为2
    private String system_no;//系统编码

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLogin_type() {
        return login_type;
    }

    public void setLogin_type(String login_type) {
        this.login_type = login_type;
    }

    public String getSystem_no() {
        return system_no;
    }

    public void setSystem_no(String system_no) {
        this.system_no = system_no;
    }
}
