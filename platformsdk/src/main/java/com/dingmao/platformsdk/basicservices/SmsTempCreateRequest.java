package com.dingmao.platformsdk.basicservices;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/17
 * 申请短信模版
 */
@Setter
@Getter
public class SmsTempCreateRequest {
    /**
     *content 模板内容
     *apply_reason 申请理由
     *template_sort 模板分类（1：短信，2：系统消息）
     */
    @NotNull(fileName = "模板内容")
    private String content;
    @NotNull(fileName = "申请理由")
    private String apply_reason;
    private String template_sort;

}
