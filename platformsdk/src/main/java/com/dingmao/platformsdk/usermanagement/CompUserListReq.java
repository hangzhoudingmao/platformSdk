package com.dingmao.platformsdk.usermanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Getter
@Setter
public class CompUserListReq {
    private String content;//搜索内容
    private String status;//状态

    @NotNull(fileName = "是否分页")
    private String is_page;//是否分页，1：分页，0：不分页
    private String page;//页码，默认第1页
    private String page_size;//每页数量，默认10
    private String comp_id;//单位id

}
