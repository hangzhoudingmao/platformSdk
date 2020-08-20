package com.dingmao.platformsdk.usermanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Getter
@Setter
public class JobAddReq {

    @NotNull(fileName = "用户ID")
    private String user_id;//用户ID

    @NotNull(fileName = "岗位ID")
    private String job_id;//岗位ID

}
