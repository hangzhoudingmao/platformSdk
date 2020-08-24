package com.dingmao.platformsdk.basicservices;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/17
 * 验证码校验
 */
@Setter
@Getter
public class CheckCodeRequest {
    /**
     * 待验证验证码
     */
    @NotNull(fileName = "验证码")
    private String code;
    /**
     * 用途
     */
    @NotNull(fileName = "用途")
    private String usage_code;

}
