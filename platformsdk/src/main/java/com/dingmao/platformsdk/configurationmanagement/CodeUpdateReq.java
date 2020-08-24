package com.dingmao.platformsdk.configurationmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Getter
@Setter
public class CodeUpdateReq {

    @NotNull(fileName = "必传项")
    private List<CodeObjReq> data;
    @Getter
    @Setter
    public static class CodeObjReq{
        private String code_sort_id;//代码分类,
        @NotNull(fileName = "代码名称")
        private String name;//名称
        @NotNull(fileName = "标准码id")
        private String code_id;//标准码id
        @NotNull(fileName = "代码值")
        private String value;//包含值的列表，多个","分开
        private String content1;//扩展1
        private String content2;//扩展2
        private String content3;//扩展3
        private String content4;//扩展4
        private String content5;//扩展5
        private String order_no;//排序字段,如果为-1.那么默认是不展示
    }
}
