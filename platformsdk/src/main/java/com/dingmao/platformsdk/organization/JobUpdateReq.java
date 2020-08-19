package com.dingmao.platformsdk.organization;

/**
 * Create by atu on 2020/8/19
 */
public class JobUpdateReq {
    private String job_id;//岗位id
    private String dept_id;//部门id
    private String job_name;//岗位名称
    private String remark;//备注

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
