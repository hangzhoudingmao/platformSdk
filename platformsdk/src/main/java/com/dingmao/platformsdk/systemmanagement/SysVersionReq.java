package com.dingmao.platformsdk.systemmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Getter
@Setter
public class SysVersionReq {

    @NotNull(fileName = "是否分页")
    private String is_page;//是否分页（0：否，1：是）

    private String page;//
    private String page_size;//
    private String ver;//当前版本号,指客户端的当前版本
    @NotNull(fileName = "系统类型")
    private String system_type;//系统类型,web,app等

}
