package com.dingmao.platformsdk.basicservices;

/**
 * Create by atu on 2020/8/17
 */
public class TableDataRequest {
    private String system_no;

    public TableDataRequest(String system_no) {
        this.system_no = system_no;
    }

    public String getSystem_no() {
        return system_no;
    }

    public void setSystem_no(String system_no) {
        this.system_no = system_no;
    }
}
