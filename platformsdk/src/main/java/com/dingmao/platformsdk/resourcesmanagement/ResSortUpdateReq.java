package com.dingmao.platformsdk.resourcesmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Getter
@Setter
public class ResSortUpdateReq {
    private String object_name;//分类名称
    private String p_object_no;//上级分类编号
    @NotNull(fileName = "分类ID")
    private String object_id;//分类ID
}
