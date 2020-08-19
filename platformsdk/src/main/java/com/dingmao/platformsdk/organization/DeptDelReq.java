package com.dingmao.platformsdk.organization;

/**
 * Create by atu on 2020/8/19
 */
public class DeptDelReq {
    private String dept_id;//部门id 必填
    private String dept_no;//部门编码 必填

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_no() {
        return dept_no;
    }

    public void setDept_no(String dept_no) {
        this.dept_no = dept_no;
    }
}
