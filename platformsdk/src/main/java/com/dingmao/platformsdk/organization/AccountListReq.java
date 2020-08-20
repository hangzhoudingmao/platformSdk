package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Getter
@Setter
public class AccountListReq {
    @NotNull(fileName = "岗位id")
    private String job_id;//岗位id
    private String user_no;//账号
    private String user_name;//用户名
    private String phone;//电话
    private String is_page;//是否分页（0：否，1：是），此处值为1
    private String page;//页码，默认第一页
    private String page_size;//每页数量，默认每页10条

}
