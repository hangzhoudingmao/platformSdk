package com.dingmao.platformsdk.usermanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Getter
@Setter
public class UserListReq {

    private String user_id;//用户ID，多个用逗号隔开
    private String user_no;//账户
    private String user_name;//用户名
    private String status;//状态使用标准码user_status
    private String org_no;//单位编码
    private String dept_no;//部门编号
    private String job_id;//岗位ID
    private String phone;//电话
    private String mail;//邮箱
    private String start_create_date;//注册开始日期
    private String end_create_date;//注册结束日期
    @NotNull(fileName = "是否分页")
    private String is_page;//是否分页，1：分页，0：不分页
    private String page;//页码，默认第1页
    private String page_size;//每页数量，默认10
    private String comp_id;//单位id


}
