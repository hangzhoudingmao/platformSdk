package com.dingmao.platformsdk.registrationrelated;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/24
 * 发送验证码（不关注用途）
 */
@Getter
@Setter
public class SendCodeReq {
    @NotNull(fileName = "电话号码")
    private String phone;//电话
    @NotNull(fileName = "模板编码")
    private String template_no;//模板编码
    @NotNull(fileName = "系统编码")
    private String system_no;//系统编码
}
