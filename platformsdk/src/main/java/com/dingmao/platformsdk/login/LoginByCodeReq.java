package com.dingmao.platformsdk.login;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/18
 */
@Setter
@Getter
public class LoginByCodeReq {

    @NotNull(fileName = "手机号")
    private String phone;//

    @NotNull(fileName = "验证码")
    private String code;//验证码
    private String login_type;//登录类型（1：密码登录，2：验证码登录），此处值为2
    private String system_no;//系统编码

}
