package com.dingmao.platformsdk.usermanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Getter
@Setter
public class ResetPwdReq {

    @NotNull(fileName = "用户ID")
    private String user_id;//用户ID
    private String old_password;//旧密码

    @NotNull(fileName = "新密码")
    private String new_password;//新密码

}
