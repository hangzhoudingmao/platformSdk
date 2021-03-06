package com.dingmao.platformsdk.configurationmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class CodeListReq {
    @NotNull(fileName = "代码分类")
    private String code_type;//代码分类,
    private String name;//名称
    private String values;//包含值的列表，多个","分开
    private String extendValues;//用于排除不需要显示的值,多个","分开
    private String content1;//扩展1
    private String content2;//扩展2
    private String content3;//扩展3
    private String content4;//扩展4
    private String content5;//扩展5
}
