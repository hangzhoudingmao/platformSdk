package com.dingmao.platformsdk.basicservices;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/17
 * 发送验证码 关注用途
 */
@Getter
@Setter
public class SendCodeRequest {
    @NotNull(fileName = "电话号")
    private String phone;
    /**
     * 用途（1：登录，2：注册，3：修改密码）
     */
    @NotNull(fileName = "用途")
    private String usage_code;
    /**
     * 模板编码
     */
    @NotNull(fileName = "模板编码")
    private String template_no;

}
