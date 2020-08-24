package com.dingmao.platformsdk.configurationmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Getter
@Setter
public class ParaSortDelReq {
    @NotNull(fileName = "参数分类标识id")
    private String para_sort_id;//参数分类标识id
}
