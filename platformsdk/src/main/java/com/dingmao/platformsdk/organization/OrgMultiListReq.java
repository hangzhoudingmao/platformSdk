package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Getter
@Setter
public class OrgMultiListReq {
    @NotNull(fileName = "组织编码")
    private String org_nos;//组织编码集合，多个用英文逗号拼接

}
