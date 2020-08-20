package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Getter
@Setter
public class OrgJobAddReq {
    @NotNull(fileName = "岗位id")
    private String job_id;//岗位id
    @NotNull(fileName = "模版id")
    private String auth_template_ids;//权限模板id集合，多个用英文逗号拼接，如：1,2,3

}
