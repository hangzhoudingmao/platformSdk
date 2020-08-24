package com.dingmao.platformsdk.configurationmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class CodeAddReq {
    @NotNull(fileName = "必传项")
    private List<CodeObjReq> data;

    @Getter
    @Setter
    public static class CodeObjReq{
        @NotNull(fileName = "分类id")
        private String code_sort_id;//分类id,
        @NotNull(fileName = "代码分类")
        private String code_type;//代码分类,
        @NotNull(fileName = "代码名称")
        private String name;//名称
        @NotNull(fileName = "代码值")
        private String value;//包含值的列表，多个","分开
        private String content1;//扩展1
        private String content2;//扩展2
        private String content3;//扩展3
        private String content4;//扩展4
        private String content5;//扩展5
    }
}
