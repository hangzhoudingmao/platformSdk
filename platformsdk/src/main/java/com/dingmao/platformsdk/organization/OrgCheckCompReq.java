package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Setter
@Getter
public class OrgCheckCompReq {
    @NotNull(fileName = "单位id")
    private String company_id;//单位id（多个英文逗号拼接）

}
