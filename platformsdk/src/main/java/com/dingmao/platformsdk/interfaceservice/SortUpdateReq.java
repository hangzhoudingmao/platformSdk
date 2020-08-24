package com.dingmao.platformsdk.interfaceservice;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Setter
@Getter
public class SortUpdateReq {
    @NotNull(fileName = "分类ID")
    private String api_sort_id;//分分类ID
    @NotNull(fileName = "分类名称")
    private String sort_name;//分类名称

}
