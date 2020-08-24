package com.dingmao.platformsdk.configurationmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class ParaReq {
    @NotNull(fileName = "参数编码")
    private String para_code;//参数编码，注意不是分类编码
    private String org_no;//管理单位，针对不同级别公司有不同需求的时候使用
}
