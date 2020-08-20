package com.dingmao.platformsdk.usermanagement;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Getter
@Setter
public class UserMultiListReq {

    private String ids;//部门/岗位/用户id集合字符串，多个用英文逗号拼接
    private String type;//类型（1：部门，2：岗位，3：用户），默认3，取决于ids数据来源类型
    private String is_page;//是否分页，1：分页，0：不分页
    private String page;//页码，默认第1页
    private String page_size;//每页数量，默认10


}
