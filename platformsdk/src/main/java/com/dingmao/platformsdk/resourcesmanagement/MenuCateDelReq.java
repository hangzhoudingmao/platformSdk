package com.dingmao.platformsdk.resourcesmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Getter
@Setter
public class MenuCateDelReq {
    @NotNull(fileName = "分类ID")
    private String menu_id;//分类ID
}
