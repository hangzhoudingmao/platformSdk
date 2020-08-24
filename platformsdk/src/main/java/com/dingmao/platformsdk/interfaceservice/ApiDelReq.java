package com.dingmao.platformsdk.interfaceservice;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Getter
@Setter
public class ApiDelReq {
    @NotNull(fileName = "分类编号")
    private String api_id;//分类编号

}
