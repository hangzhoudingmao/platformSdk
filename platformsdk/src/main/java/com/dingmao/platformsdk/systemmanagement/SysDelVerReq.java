package com.dingmao.platformsdk.systemmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Setter @Getter
public class SysDelVerReq {
    @NotNull(fileName = "系统版本id")
    private String sys_ver_id;//系统版本id
}
