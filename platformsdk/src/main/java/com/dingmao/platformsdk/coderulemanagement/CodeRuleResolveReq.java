package com.dingmao.platformsdk.coderulemanagement;

/**
 * Create by atu on 2020/8/17
 */
public class CodeRuleResolveReq {
    /**
     * 查询用途类型
     * : 1=》编码分类
     * : 2=》流水段分类
     *
     */
    private String type;

    /**
     * 单位id
     */
    private String company_id;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }
}
