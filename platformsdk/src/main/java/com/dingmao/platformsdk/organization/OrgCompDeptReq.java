package com.dingmao.platformsdk.organization;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Setter
@Getter
public class OrgCompDeptReq {
    private String company_id;//单位ID,不传入表示取登录人对应单位ID
    private List<OrgDeptReq> querys;

    @Setter
    @Getter
    public static class OrgDeptReq{
        private String org_name;//子单位名称,非模糊匹配
        private String dept_name;//部门名称,非模糊匹配

    }
}
