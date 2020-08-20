package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Getter
@Setter
public class OrgDelReq {
    @NotNull(fileName = "组织id")
    private String org_id;//组织（子单位）id 必填
    @NotNull(fileName = "组织编码")
    private String org_no;//组织（子单位）编码 必填

}
