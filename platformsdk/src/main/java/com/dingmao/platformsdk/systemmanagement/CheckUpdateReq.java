package com.dingmao.platformsdk.systemmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/26
 */
@Getter
@Setter
public class CheckUpdateReq {
    private String system_type;//
    @NotNull(fileName = "当前版本号")
    private String ver;//
}
