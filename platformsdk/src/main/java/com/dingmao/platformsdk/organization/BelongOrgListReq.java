package com.dingmao.platformsdk.organization;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Getter
@Setter
public class BelongOrgListReq {
    private String dept_nos;//部门编号，多个用英文逗号拼接
    private String dept_ids;//部门id，多个用英文逗号拼接

}
