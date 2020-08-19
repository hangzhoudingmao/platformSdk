package com.dingmao.platformsdk.insertmanagement;

/**
 * Create by atu on 2020/8/18
 */
public class CheckPowerReq {
    private String object_no;//权限项编码
    private String object_module;//权限项模块（路由，例：company/index）
    private String object_method;//权限项方法
    private String object_para;//权限项参数（?tag=company&name=aaa&...）

    public String getObject_no() {
        return object_no;
    }

    public void setObject_no(String object_no) {
        this.object_no = object_no;
    }

    public String getObject_module() {
        return object_module;
    }

    public void setObject_module(String object_module) {
        this.object_module = object_module;
    }

    public String getObject_method() {
        return object_method;
    }

    public void setObject_method(String object_method) {
        this.object_method = object_method;
    }

    public String getObject_para() {
        return object_para;
    }

    public void setObject_para(String object_para) {
        this.object_para = object_para;
    }
}
