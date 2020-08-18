package com.dingmao.platformsdk.coderulemanagement;

/**
 * Create by atu on 2020/8/17
 */
public class RuleListReq {
    private String rule_code_resolve_id;//流水段分类id
    private String page;//页码
    private String is_page;//是否分页1=》分页，0=》不分
    private String page_size;//每页显示的条数

    public String getRule_code_resolve_id() {
        return rule_code_resolve_id;
    }

    public void setRule_code_resolve_id(String rule_code_resolve_id) {
        this.rule_code_resolve_id = rule_code_resolve_id;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getIs_page() {
        return is_page;
    }

    public void setIs_page(String is_page) {
        this.is_page = is_page;
    }

    public String getPage_size() {
        return page_size;
    }

    public void setPage_size(String page_size) {
        this.page_size = page_size;
    }
}
