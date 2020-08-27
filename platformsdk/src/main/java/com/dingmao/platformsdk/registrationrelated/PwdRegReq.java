package com.dingmao.platformsdk.registrationrelated;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/24
 */
@Getter
@Setter
public class PwdRegReq {
    @NotNull(fileName = "账号")
    private String user_no;//账号
    @NotNull(fileName = "密码")
    private String password;//密码
    @NotNull(fileName = "确认密码")
    private String confirm_password;//确认密码
    private String phone;//电话
    private String code;//验证码
    private String useage_code;//用途（1：登录，2：注册，3：修改密码），此处值为2
    @NotNull(fileName = "系统编码")
    private String system_no;//系统编码
    private String company_id;//公司ID
}
