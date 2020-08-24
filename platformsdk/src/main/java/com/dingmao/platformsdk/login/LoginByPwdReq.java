package com.dingmao.platformsdk.login;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/13
 */
@Setter
@Getter
public class LoginByPwdReq {

    @NotNull(fileName = "用户名")
    private String user_no;

    @NotNull(fileName = "密码")
    private String password;

    private String login_type;
    private String system_no;

    public LoginByPwdReq(String user_no, String password) {
        this.user_no = user_no;
        this.password = password;
    }

}
