package com.dingmao.platformsdk.coderulemanagement;

/**
 * Create by atu on 2020/8/17
 */
public class RuleAddReq {
    private String rule_name;//规则名称
    private String sources_data;//数据来源 标准码 dataSources（例常量,内置对象,vo对象,流水段）
    private String para_value;//参数值
    private String start_num;//开始位
    private String end_num;//截至位
    private String rule_code_resolve_id;//编码分类id
    private String fill_style;//填充方式 标准码 fillStyle（例前置,后置）
    private String fill_style_value;//填充值

    public String getRule_name() {
        return rule_name;
    }

    public void setRule_name(String rule_name) {
        this.rule_name = rule_name;
    }

    public String getSources_data() {
        return sources_data;
    }

    public void setSources_data(String sources_data) {
        this.sources_data = sources_data;
    }

    public String getPara_value() {
        return para_value;
    }

    public void setPara_value(String para_value) {
        this.para_value = para_value;
    }

    public String getStart_num() {
        return start_num;
    }

    public void setStart_num(String start_num) {
        this.start_num = start_num;
    }

    public String getEnd_num() {
        return end_num;
    }

    public void setEnd_num(String end_num) {
        this.end_num = end_num;
    }

    public String getRule_code_resolve_id() {
        return rule_code_resolve_id;
    }

    public void setRule_code_resolve_id(String rule_code_resolve_id) {
        this.rule_code_resolve_id = rule_code_resolve_id;
    }

    public String getFill_style() {
        return fill_style;
    }

    public void setFill_style(String fill_style) {
        this.fill_style = fill_style;
    }

    public String getFill_style_value() {
        return fill_style_value;
    }

    public void setFill_style_value(String fill_style_value) {
        this.fill_style_value = fill_style_value;
    }
}
