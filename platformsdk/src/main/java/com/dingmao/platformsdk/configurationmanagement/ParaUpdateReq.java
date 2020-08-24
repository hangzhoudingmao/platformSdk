package com.dingmao.platformsdk.configurationmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class ParaUpdateReq {
    @NotNull(fileName = "参数名称")
    private String para_name;//参数名称
    @NotNull(fileName = "参数值")
    private String para_value;//参数值
    @NotNull(fileName = "参数ID")
    private String para_id;//参数ID
}
