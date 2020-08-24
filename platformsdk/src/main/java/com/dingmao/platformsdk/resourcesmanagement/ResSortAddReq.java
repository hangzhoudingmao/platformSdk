package com.dingmao.platformsdk.resourcesmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class ResSortAddReq {

    @NotNull(fileName = "分类编号")
    private String object_no;//分类编号
    @NotNull(fileName = "分类名称")
    private String object_name;//分类名称
    private String p_object_no;//上级分类编号
}
