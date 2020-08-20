package com.dingmao.platformsdk.usermanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Getter
@Setter
public class UserStateReq {

    @NotNull(fileName = "用户ID")
    private String user_id;//用户ID

    @NotNull(fileName = "用户状态")
    private String type;//1 启用，2 禁用

}
