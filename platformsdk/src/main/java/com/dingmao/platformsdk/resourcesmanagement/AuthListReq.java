package com.dingmao.platformsdk.resourcesmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Getter
@Setter
public class AuthListReq {
    @NotNull(fileName = "权限项分类编号")
    private String object_no;//权限项分类编号
    @NotNull(fileName = "是否分页")
    private String is_page;//是否分页（0：否，1：是）
    private String page;//页码，默认第一页
    private String pag_size;//每页数量，默认每页10条
    private String object_name;//权限项名称
}
