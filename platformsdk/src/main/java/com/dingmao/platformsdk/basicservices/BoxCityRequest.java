package com.dingmao.platformsdk.basicservices;

/**
 * Create by atu on 2020/8/17
 */
public class BoxCityRequest {
    /**
     * 区域类型（1：省，2：市，3：区/县，4：街道/乡镇），此时值为2
     */
    private String area_type;
    /**
     * 省编码
     */
    private String province_no;

    public String getArea_type() {
        return area_type;
    }

    public void setArea_type(String area_type) {
        this.area_type = area_type;
    }

    public String getProvince_no() {
        return province_no;
    }

    public void setProvince_no(String province_no) {
        this.province_no = province_no;
    }
}
