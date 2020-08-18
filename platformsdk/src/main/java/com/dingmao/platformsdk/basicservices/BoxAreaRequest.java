package com.dingmao.platformsdk.basicservices;

/**
 * Create by atu on 2020/8/17
 */
public class BoxAreaRequest {
    /**
     * 区域类型（1：省，2：市，3：区/县，4：街道/乡镇），此时值为3
     */
    private String area_type;
    /**
     * 市编码
     */
    private String city_no;

    public String getArea_type() {
        return area_type;
    }

    public void setArea_type(String area_type) {
        this.area_type = area_type;
    }

    public String getCity_no() {
        return city_no;
    }

    public void setCity_no(String city_no) {
        this.city_no = city_no;
    }
}
