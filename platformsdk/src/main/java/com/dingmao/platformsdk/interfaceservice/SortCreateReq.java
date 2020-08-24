package com.dingmao.platformsdk.interfaceservice;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Getter
@Setter
public class SortCreateReq {
    private String p_sort_id;//上级分类，不传入表示根目录
    @NotNull(fileName = "分类名称")
    private String sort_name;//分类名称
    @NotNull(fileName = "分类编号")
    private String sort_no;//分类编号

}
