package com.dingmao.platformsdk.interfaceservice;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Setter
@Getter
public class ApiLogReq {
    @NotNull(fileName = "分类编号")
    private String api_id;//分类编号
    private String start_time;//调用开始日期
    private String end_time;//调用截止日期
    @NotNull(fileName = "是否分页")
    private String is_page;//是否分页（0：否，1：是），此处值为1
    private String page;//页码，默认第一页
    private String page_size;//每页数量，默认每页10条

}
