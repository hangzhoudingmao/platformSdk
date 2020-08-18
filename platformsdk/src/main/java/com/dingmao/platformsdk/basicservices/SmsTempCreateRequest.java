package com.dingmao.platformsdk.basicservices;

/**
 * Create by atu on 2020/8/17
 */
public class SmsTempCreateRequest {
    /**
     *content 模板内容
     *apply_reason 申请理由
     *template_sort 模板分类（1：短信，2：系统消息）
     */
    private String content;
    private String apply_reason;
    private String template_sort;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getApply_reason() {
        return apply_reason;
    }

    public void setApply_reason(String apply_reason) {
        this.apply_reason = apply_reason;
    }

    public String getTemplate_sort() {
        return template_sort;
    }

    public void setTemplate_sort(String template_sort) {
        this.template_sort = template_sort;
    }
}
