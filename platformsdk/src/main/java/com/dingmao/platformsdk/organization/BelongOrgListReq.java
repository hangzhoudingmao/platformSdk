package com.dingmao.platformsdk.organization;

/**
 * Create by atu on 2020/8/19
 */
public class BelongOrgListReq {
    private String dept_nos;//部门编号，多个用英文逗号拼接
    private String dept_ids;//部门id，多个用英文逗号拼接

    public String getDept_nos() {
        return dept_nos;
    }

    public void setDept_nos(String dept_nos) {
        this.dept_nos = dept_nos;
    }

    public String getDept_ids() {
        return dept_ids;
    }

    public void setDept_ids(String dept_ids) {
        this.dept_ids = dept_ids;
    }
}
