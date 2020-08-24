package com.dingmao.platformsdk.resourcesmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class TempAuthAssignReq {
    @NotNull(fileName = "模板id")
    private String auth_template_id;//模板id
    @NotNull(fileName = "权限项ID")
    private String object_ids;//权限项ID集合，英文逗号拼接
}
