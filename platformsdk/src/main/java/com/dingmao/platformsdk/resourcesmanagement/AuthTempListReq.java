package com.dingmao.platformsdk.resourcesmanagement;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class AuthTempListReq {
    private String auth_template_name;//权限模板名称
    private String job_id;//岗位id
    private String is_select;//是否去除岗位已关联模板（0：否，1：是），此处值为0，改参数在job_id存在时必传，auth_template_name存在时，不传
    private String is_page;//
    private String page;//
    private String page_size;//
}
