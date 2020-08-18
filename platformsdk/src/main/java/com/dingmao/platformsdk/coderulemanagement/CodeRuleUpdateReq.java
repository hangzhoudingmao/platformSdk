package com.dingmao.platformsdk.coderulemanagement;

/**
 * Create by atu on 2020/8/17
 */
public class CodeRuleUpdateReq {
    private String name;
    private String rule_code_resolve_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRule_code_resolve_id() {
        return rule_code_resolve_id;
    }

    public void setRule_code_resolve_id(String rule_code_resolve_id) {
        this.rule_code_resolve_id = rule_code_resolve_id;
    }
}
