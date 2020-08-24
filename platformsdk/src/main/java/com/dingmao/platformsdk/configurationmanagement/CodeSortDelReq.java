package com.dingmao.platformsdk.configurationmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Getter
@Setter
public class CodeSortDelReq {
    @NotNull(fileName = "分类ID")
    private String code_sort_id;//分类ID
}
