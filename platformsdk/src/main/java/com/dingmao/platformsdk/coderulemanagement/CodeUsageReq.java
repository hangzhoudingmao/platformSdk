package com.dingmao.platformsdk.coderulemanagement;

/**
 * Create by atu on 2020/8/17
 */
public class CodeUsageReq {
    private String rule_code_value;//编码规则编号
    private String apply_num;//申请数量
    private String sources_data_value;//vo 对象（例：{"manafactory":"构件厂"}
    private String pipeline_section_id;//流水段id

    public String getRule_code_value() {
        return rule_code_value;
    }

    public void setRule_code_value(String rule_code_value) {
        this.rule_code_value = rule_code_value;
    }

    public String getApply_num() {
        return apply_num;
    }

    public void setApply_num(String apply_num) {
        this.apply_num = apply_num;
    }

    public String getSources_data_value() {
        return sources_data_value;
    }

    public void setSources_data_value(String sources_data_value) {
        this.sources_data_value = sources_data_value;
    }

    public String getPipeline_section_id() {
        return pipeline_section_id;
    }

    public void setPipeline_section_id(String pipeline_section_id) {
        this.pipeline_section_id = pipeline_section_id;
    }
}
