package com.dingmao.platformsdk.login;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/14
 * 验证密钥
 */
@Getter
@Setter
public class ValidKeyReq {
    @NotNull(fileName = "秘钥")
    private String key;
    @NotNull(fileName = "授权码")
    private String auth_code;

}
