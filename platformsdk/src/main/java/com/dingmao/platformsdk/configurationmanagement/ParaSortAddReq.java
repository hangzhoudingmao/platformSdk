package com.dingmao.platformsdk.configurationmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class ParaSortAddReq {
    @NotNull(fileName = "参数分类名称")
    private String para_sort_name;//参数分类名称
    @NotNull(fileName = "是否生效")
    private String is_valud;//是否生效
    @NotNull(fileName = "上级分类")
    private String p_para_type;//上级分类
    @NotNull(fileName = "参数分类")
    private String para_type;//参数分类
}
