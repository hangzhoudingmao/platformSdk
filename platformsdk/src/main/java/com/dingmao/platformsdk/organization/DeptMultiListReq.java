package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Getter
@Setter
public class DeptMultiListReq {
    @NotNull(fileName = "部门id")
    private String dept_ids;//部门id集合，多个用英文逗号拼接

}
