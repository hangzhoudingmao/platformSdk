package com.dingmao.platformsdk.registrationrelated;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/24
 */
@Getter
@Setter
public class RegListReq {
    private String search_word;//搜索关键字
    private String status;//审核状态（0：全部，1：待审核，2：审核通过，3：审核拒绝）
    @NotNull(fileName = "是否分页")
    private String is_page;//是否分页（0：否， 1：是），此处值为1
    private String page;//页码，默认第一页
    private String page_size;//每页数量，默认每页10条
    @NotNull(fileName = "账户类型")
    private String user_type;//账户类型（3：单位管理员，4：普通用户），此处值为3， 普通用户审核时传值为4
}
