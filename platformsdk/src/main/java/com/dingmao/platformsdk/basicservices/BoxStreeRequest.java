package com.dingmao.platformsdk.basicservices;

/**
 * Create by atu on 2020/8/17
 */
public class BoxStreeRequest {
    /**
     * 区域类型（1：省，2：市，3：区/县，4：街道/乡镇），此时值为4
     */
    private String area_type;
    /**
     * 区编码
     */
    private String area_no;

    public String getArea_type() {
        return area_type;
    }

    public void setArea_type(String area_type) {
        this.area_type = area_type;
    }

    public String getArea_no() {
        return area_no;
    }

    public void setArea_no(String area_no) {
        this.area_no = area_no;
    }
}
