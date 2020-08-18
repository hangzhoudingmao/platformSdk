package com.dingmao.platformsdk.basicservices;

/**
 * Create by atu on 2020/8/17
 * 区域-下拉框-省列表
 */
public class BoxProvinceRequest {
    /**
     * 区域类型（1：省，2：市，3：区/县，4：街道/乡镇），此时值为1
     */
    private String area_type;

    public String getArea_type() {
        return area_type;
    }

    public void setArea_type(String area_type) {
        this.area_type = area_type;
    }
}
