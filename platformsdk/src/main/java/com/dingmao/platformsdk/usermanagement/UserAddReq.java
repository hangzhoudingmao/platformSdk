package com.dingmao.platformsdk.usermanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Getter
@Setter
public class UserAddReq {
    private String job_id;//岗位id 多个用逗号隔开

    @NotNull(fileName = "真实姓名")
    private String user_name;//真实姓名

    @NotNull(fileName = "手机号")
    private String phone;//手机号
    private String user_no;//账号默认为手机号

}
