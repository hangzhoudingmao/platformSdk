package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Getter
@Setter
public class ObsRelaDelReq {
    @NotNull(fileName = "ID")
    private String role_job_rela_id;//模板岗位关联表主键id

}
