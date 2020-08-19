package com.dingmao.platformsdk.organization;

import java.util.List;

/**
 * Create by atu on 2020/8/19
 */
public class OrgCompDeptReq {
    private String company_id;//单位ID,不传入表示取登录人对应单位ID
    private List<OrgDeptReq> querys;

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public List<OrgDeptReq> getQuerys() {
        return querys;
    }

    public void setQuerys(List<OrgDeptReq> querys) {
        this.querys = querys;
    }

    public static class OrgDeptReq{
        private String org_name;//子单位名称,非模糊匹配
        private String dept_name;//部门名称,非模糊匹配

        public String getOrg_name() {
            return org_name;
        }

        public void setOrg_name(String org_name) {
            this.org_name = org_name;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }
    }
}
