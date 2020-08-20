package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Getter
@Setter
public class DeptDelReq {
    @NotNull(fileName = "部门id")
    private String dept_id;//部门id 必填
    @NotNull(fileName = "部门编号")
    private String dept_no;//部门编码 必填

}
