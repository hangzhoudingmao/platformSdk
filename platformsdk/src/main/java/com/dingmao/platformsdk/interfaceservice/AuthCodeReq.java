package com.dingmao.platformsdk.interfaceservice;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Getter
@Setter
public class AuthCodeReq {
    @NotNull(fileName = "原授权码")
    private String auth_code;//原授权码
    @NotNull(fileName = "手机验证码")
    private String code;//手机验证码

}
