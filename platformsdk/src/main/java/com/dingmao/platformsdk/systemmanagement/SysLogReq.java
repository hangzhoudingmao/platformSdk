package com.dingmao.platformsdk.systemmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Getter
@Setter
public class SysLogReq {

    private String user_id;//操作人
    private String key;//搜索挂关键字
    private String start_date;//日志开始日期
    private String end_date;//日志截止日期

    @NotNull(fileName = "是否分页")
    private String is_page;//是否分页（0：否，1：是）

    private String page;//
    private String page_size;//

}
