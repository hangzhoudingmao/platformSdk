package com.dingmao.platformsdk.organization;

/**
 * Create by atu on 2020/8/19
 */
public class OrgUpdateReq {
    private String org_id;//组织（子单位）id  必须
    private String p_org_no;//上级组织（子单位）编码
    private String org_name;//组织（子单位）名称
    private String remark;//备注

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getP_org_no() {
        return p_org_no;
    }

    public void setP_org_no(String p_org_no) {
        this.p_org_no = p_org_no;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
