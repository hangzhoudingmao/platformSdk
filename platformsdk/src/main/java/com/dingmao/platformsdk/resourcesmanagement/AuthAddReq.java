package com.dingmao.platformsdk.resourcesmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Getter
@Setter
public class AuthAddReq {
    @NotNull(fileName = "权限项名称")
    private String object_name;//
    @NotNull(fileName = "权限项路径")
    private String object_module;//权限项路径
    @NotNull(fileName = "权限项方法")
    private String object_method;//权限项方法
    private String object_para;//权限项参数
    @NotNull(fileName = "权限项编码")
    private String object_no;//权限项编码
    @NotNull(fileName = "权限项类别")
    private String object_sort;//权限项类别
    @NotNull(fileName = "上级权限项编码")
    private String p_object_no;//上级权限项编码
    @NotNull(fileName = "是否菜单项")
    private String is_menu;//是否菜单项
    private String order_no;//排序字段
    @NotNull(fileName = "是否权限项")
    private String is_priv;//是否权限项
    @NotNull(fileName = "是否流程项")
    private String is_flow;//是否流程项
    @NotNull(fileName = "是否普通项")
    private String is_samp;//
}
