package com.dingmao.platformsdk.coderulemanagement;

/**
 * Create by atu on 2020/8/17
 */
public class SectionAddReq {
    private String section_name;//流水段名称
    private String pipeline_start;//流水开始
    private String pipeline_end;//流水结束
    private String rule_code_resolve_id;//流水段分类id

    public String getSection_name() {
        return section_name;
    }

    public void setSection_name(String section_name) {
        this.section_name = section_name;
    }

    public String getPipeline_start() {
        return pipeline_start;
    }

    public void setPipeline_start(String pipeline_start) {
        this.pipeline_start = pipeline_start;
    }

    public String getPipeline_end() {
        return pipeline_end;
    }

    public void setPipeline_end(String pipeline_end) {
        this.pipeline_end = pipeline_end;
    }

    public String getRule_code_resolve_id() {
        return rule_code_resolve_id;
    }

    public void setRule_code_resolve_id(String rule_code_resolve_id) {
        this.rule_code_resolve_id = rule_code_resolve_id;
    }
}
