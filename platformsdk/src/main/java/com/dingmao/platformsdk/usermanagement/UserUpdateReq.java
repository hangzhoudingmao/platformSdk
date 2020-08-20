package com.dingmao.platformsdk.usermanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Getter
@Setter
public class UserUpdateReq {
    @NotNull(fileName = "用户ID")
    private String user_id;//用户ID
    private String job_id;//岗位id，多个用逗号隔开
    private String user_name;//用户名
    private String phone;//手机号id
    private String avatar;//头像
    private String user_no;//账号，默认手机号，不传入默认不修改
    private String company_id;//单位

}
