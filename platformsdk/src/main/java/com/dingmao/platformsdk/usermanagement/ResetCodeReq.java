package com.dingmao.platformsdk.usermanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Getter
@Setter
public class ResetCodeReq {
    @NotNull(fileName = "用户ID")
    private String user_id;//用户ID

    @NotNull(fileName = "验证码")
    private String code;//验证码

    @NotNull(fileName = "新密码")
    private String new_password;//新密码


}
