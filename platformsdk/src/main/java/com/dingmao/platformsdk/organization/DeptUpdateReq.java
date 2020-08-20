package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Getter
@Setter
public class DeptUpdateReq {
    @NotNull(fileName = "部门id")
    private String dept_id;//部门id 必填
    @NotNull(fileName = "组织编码")
    private String org_no;//组织编码
    private String p_dept_no;//上级部门编码
    private String dept_name;//部门名称
    private String remark;//备注

}
