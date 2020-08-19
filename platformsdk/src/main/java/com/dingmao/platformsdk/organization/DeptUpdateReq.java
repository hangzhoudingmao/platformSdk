package com.dingmao.platformsdk.organization;

/**
 * Create by atu on 2020/8/19
 */
public class DeptUpdateReq {
    private String dept_id;//部门id 必填
    private String org_no;//组织编码
    private String p_dept_no;//上级部门编码
    private String dept_name;//部门名称
    private String remark;//备注

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getOrg_no() {
        return org_no;
    }

    public void setOrg_no(String org_no) {
        this.org_no = org_no;
    }

    public String getP_dept_no() {
        return p_dept_no;
    }

    public void setP_dept_no(String p_dept_no) {
        this.p_dept_no = p_dept_no;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
