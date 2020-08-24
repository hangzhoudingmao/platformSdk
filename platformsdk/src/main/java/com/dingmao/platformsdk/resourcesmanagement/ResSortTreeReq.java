package com.dingmao.platformsdk.resourcesmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class ResSortTreeReq {
    private String object_no;//权限项（分类）编码

    /**
     * 系统权限项（分类）树查询类型（
     * type=menu 只获取目录项      type=process 只获取流程项目
     * type=grant  只获取授权项      type=normal 只获取普通项
     * type=all 获取以上4类      type=dir 则只需要列出分类 ），
     * 通用选择项的时候只传type，查询左侧分类树的时候type必须为dir
     */
    @NotNull(fileName = "系统权限项类型")
    private String type;
    private String is_assign;//是否分配权限（权限模板分配权限时该参数必传且值为1），此处该参数不传
    private String assign_id;//权限模板id（权限模板分配权限时该参数必传），此处该参数不传
}
