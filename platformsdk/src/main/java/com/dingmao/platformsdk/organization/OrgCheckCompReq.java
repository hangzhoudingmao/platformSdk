package com.dingmao.platformsdk.organization;

/**
 * Create by atu on 2020/8/19
 */
public class OrgCheckCompReq {
    private String company_id;//单位id（多个英文逗号拼接）

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }
}
