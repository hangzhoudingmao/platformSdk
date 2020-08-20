package com.dingmao.platformsdk.usermanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Getter
@Setter
public class UserAuthReq {

    @NotNull(fileName = "用户ID")
    private String user_id;//用户ID
    private String object_no;//主权限项编号，一般在获取页面权限的时候用到
    private String system_no;//系统编号，若不传入则取token中系统编码


}
