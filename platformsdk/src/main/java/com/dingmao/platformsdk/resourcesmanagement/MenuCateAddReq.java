package com.dingmao.platformsdk.resourcesmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class MenuCateAddReq {
    @NotNull(fileName = "菜单分类编号")
    private String menu_no;//菜单分类编号
    @NotNull(fileName = "菜单分类名称")
    private String menu_name;//菜单分类名称
    private String p_menu_no;//上级菜单分类编号
    private String menu_css;//分类样式
    private String route_url;//前端路由
}
