package com.dingmao.platformsdk.registrationrelated;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/24
 */
@Getter
@Setter
public class UserAuditReq {

    @NotNull(fileName = "手机号码")
    private String phone;//手机号码

    @NotNull(fileName = "审核注册用户id")
    private String user_reg_id;//审核注册用户id

    @NotNull(fileName = "真实姓名")
    private String user_name;//真实姓名
    @NotNull(fileName = "岗位")
    private String job;//岗位 (传字符串  例1,2,3)
    @NotNull(fileName = "审核状态")
    private String status;//审核状态 2审核成功 3.审核失败
    private String reason;//审核原因 审核失败时必传

}
