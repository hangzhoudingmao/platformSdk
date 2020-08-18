package com.dingmao.platformsdk.coderulemanagement;

/**
 * Create by atu on 2020/8/17
 */
public class CodeRecordReq {
    private String rule_code_value;
    private String page;
    private String is_page;
    private String page_size;

    public String getRule_code_value() {
        return rule_code_value;
    }

    public void setRule_code_value(String rule_code_value) {
        this.rule_code_value = rule_code_value;
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
