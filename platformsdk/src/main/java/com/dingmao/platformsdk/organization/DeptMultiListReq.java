package com.dingmao.platformsdk.organization;

/**
 * Create by atu on 2020/8/19
 */
public class DeptMultiListReq {
    private String dept_ids;//部门id集合，多个用英文逗号拼接

    public String getDept_ids() {
        return dept_ids;
    }

    public void setDept_ids(String dept_ids) {
        this.dept_ids = dept_ids;
    }
}
