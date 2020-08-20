package com.dingmao.platformsdk.usermanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Getter
@Setter
public class UserImprtReq {

    @NotNull(fileName = "真实姓名")
    private String user_name;//真实姓名

    @NotNull(fileName = "手机号")
    private String phone;//手机号

    private String user_no;//不填写默认采用手机号

}
