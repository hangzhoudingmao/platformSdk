package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Getter
@Setter
public class OrgUpdateReq {
    @NotNull(fileName = "组织id")
    private String org_id;//组织（子单位）id  必须
    private String p_org_no;//上级组织（子单位）编码
    private String org_name;//组织（子单位）名称
    private String remark;//备注

}
