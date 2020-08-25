package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Getter
@Setter
public class DeptSubListReq {
    @NotNull(fileName = "部门编码")
    private String dept_no;//部门编码

}
