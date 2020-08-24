package com.dingmao.platformsdk.resourcesmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class AuthTempAddReq {
    @NotNull(fileName = "权限模板名称")
    private String auth_template_name;//权限模板名称
}
