package com.dingmao.platformsdk.resourcesmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class MenuAddReq {
    @NotNull(fileName = "对应权限项")
    private String object_id;//对应权限项
    @NotNull(fileName = "菜单编号")
    private String menu_no;//
    @NotNull(fileName = "菜单名称")
    private String menu_name;//菜单名称
    @NotNull(fileName = "上级菜单编号")
    private String p_menu_no;//上级菜单编号
    private String order_no;//排序号
    private String menu_css;//样式
    private String ouer_url;//外部链接
    @NotNull(fileName = "菜单样式")
    private String menu_type;//菜单样式，分为内部菜单和外部链接
    @NotNull(fileName = "前端路由")
    private String route_url;//前端路由
}
