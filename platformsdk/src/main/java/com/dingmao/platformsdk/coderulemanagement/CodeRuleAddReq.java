package com.dingmao.platformsdk.coderulemanagement;

/**
 * Create by atu on 2020/8/17
 */
public class CodeRuleAddReq {
    private String name;//名称
    private String resolve_type;//编码分类ruleCodeResolveType 标准码 (例1编码规则分类，2流水段分类)
    private String resolve_no;//上级编号，若无传0
    private String company_id;//单位id
    private String system_no;//系统编号

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResolve_type() {
        return resolve_type;
    }

    public void setResolve_type(String resolve_type) {
        this.resolve_type = resolve_type;
    }

    public String getResolve_no() {
        return resolve_no;
    }

    public void setResolve_no(String resolve_no) {
        this.resolve_no = resolve_no;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getSystem_no() {
        return system_no;
    }

    public void setSystem_no(String system_no) {
        this.system_no = system_no;
    }
}
