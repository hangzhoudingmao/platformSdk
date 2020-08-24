package com.dingmao.platformsdk.configurationmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class CodeSortUpdateReq {
    @NotNull(fileName = "分类名称")
    private String sort_name;//分类名称
    @NotNull(fileName = "分类ID")
    private String code_sort_id;//分类ID
    @NotNull(fileName = "代码类型")
    private String code_type;//代码类型
    private String is_valid;//是否生效
    private String p_code_type;//上级分类id
}
