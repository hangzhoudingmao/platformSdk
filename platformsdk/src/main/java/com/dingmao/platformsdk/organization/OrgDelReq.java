package com.dingmao.platformsdk.organization;

/**
 * Create by atu on 2020/8/19
 */
public class OrgDelReq {
    private String org_id;//组织（子单位）id 必填
    private String org_no;//组织（子单位）编码 必填

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getOrg_no() {
        return org_no;
    }

    public void setOrg_no(String org_no) {
        this.org_no = org_no;
    }
}
