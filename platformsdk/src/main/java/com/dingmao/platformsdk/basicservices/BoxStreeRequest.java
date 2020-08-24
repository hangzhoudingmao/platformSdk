package com.dingmao.platformsdk.basicservices;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/17
 */
@Setter
@Getter
public class BoxStreeRequest {
    /**
     * 区域类型（1：省，2：市，3：区/县，4：街道/乡镇），此时值为4
     */
    @NotNull(fileName = "区域类型")
    private String area_type;
    /**
     * 区编码
     */
    @NotNull(fileName = "区编码")
    private String area_no;

}
