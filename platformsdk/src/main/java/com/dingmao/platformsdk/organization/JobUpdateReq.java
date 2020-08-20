package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Getter
@Setter
public class JobUpdateReq {
    @NotNull(fileName = "岗位id")
    private String job_id;//岗位id
    @NotNull(fileName = "部门id")
    private String dept_id;//部门id
    private String job_name;//岗位名称
    private String remark;//备注

}
