package com.dingmao.platformsdk.registrationrelated;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/24
 */
@Getter
@Setter
public class CompDetailReq {
    @NotNull(fileName = "单位入驻单位名称")
    private String company_name;//单位入驻单位名称
}
