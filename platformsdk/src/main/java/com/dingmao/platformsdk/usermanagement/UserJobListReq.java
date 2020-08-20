package com.dingmao.platformsdk.usermanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Getter
@Setter
public class UserJobListReq {

    @NotNull(fileName = "用户id")
    private String user_id;//用户id，多个用逗号隔开

}
