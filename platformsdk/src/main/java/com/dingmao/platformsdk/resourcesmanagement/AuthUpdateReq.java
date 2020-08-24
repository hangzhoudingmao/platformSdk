package com.dingmao.platformsdk.resourcesmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Getter
@Setter
public class AuthUpdateReq {
    @NotNull(fileName = "权限标识")
    private String object_id;//权限标识
    private String object_name;//
    private String object_module;//权限项路径
    private String object_method;//权限项方法
    private String object_para;//权限项参数
    private String object_sort;//权限项类别
    private String p_object_no;//上级权限项编码
    private String is_menu;//是否菜单项
    private String order_no;//排序字段
    private String is_priv;//是否权限项
    private String is_flow;//是否流程项
    private String is_samp;//
}
