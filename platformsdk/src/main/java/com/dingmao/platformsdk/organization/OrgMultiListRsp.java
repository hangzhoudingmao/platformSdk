package com.dingmao.platformsdk.organization;

import java.util.List;

/**
 * Create by atu on 2020/8/19
 */
public class OrgMultiListRsp {
    private List<ListBean> list;

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * org_id : nisi eiusmod esse laboris
         * company_id : qui deserunt
         * org_no : enim
         * p_org_no : qui ex consectetur
         * org_type : dolore minim et pariatur magna
         * org_name : sunt qui voluptate amet labo
         */

        private String org_id;
        private String company_id;
        private String org_no;
        private String p_org_no;
        private String org_type;
        private String org_name;

        public String getOrg_id() {
            return org_id;
        }

        public void setOrg_id(String org_id) {
            this.org_id = org_id;
        }

        public String getCompany_id() {
            return company_id;
        }

        public void setCompany_id(String company_id) {
            this.company_id = company_id;
        }

        public String getOrg_no() {
            return org_no;
        }

        public void setOrg_no(String org_no) {
            this.org_no = org_no;
        }

        public String getP_org_no() {
            return p_org_no;
        }

        public void setP_org_no(String p_org_no) {
            this.p_org_no = p_org_no;
        }

        public String getOrg_type() {
            return org_type;
        }

        public void setOrg_type(String org_type) {
            this.org_type = org_type;
        }

        public String getOrg_name() {
            return org_name;
        }

        public void setOrg_name(String org_name) {
            this.org_name = org_name;
        }
    }
}
