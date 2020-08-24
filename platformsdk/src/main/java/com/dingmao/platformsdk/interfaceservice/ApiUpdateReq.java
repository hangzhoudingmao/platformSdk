package com.dingmao.platformsdk.interfaceservice;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Setter
@Getter
public class ApiUpdateReq {
    @NotNull(fileName = "分类编号")
    private String api_id;//分类编号
    private String api_name;//接口名称
    private String api_url;//地址
    private String remark;//说明

}
