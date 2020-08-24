package com.dingmao.platformsdk.basicservices;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/17
 */
@Setter
@Getter
public class BoxCityRequest {
    /**
     * 区域类型（1：省，2：市，3：区/县，4：街道/乡镇），此时值为2
     */
    @NotNull(fileName = "区域类型")
    private String area_type;
    /**
     * 省编码
     */
    @NotNull(fileName = "省编码")
    private String province_no;

}
