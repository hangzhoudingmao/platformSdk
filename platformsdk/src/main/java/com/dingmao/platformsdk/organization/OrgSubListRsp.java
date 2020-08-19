package com.dingmao.platformsdk.organization;

import java.util.List;

/**
 * Create by atu on 2020/8/19
 */
public class OrgSubListRsp {
    private List<ListBean> list;

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * org_id : occaecat voluptate est
         * no : exercitation in
         * org_name : eu
         * p_org_no : minim aliquip exercitation do ea
         * org_type : ea enim laboris
         */

        private String org_id;
        private String no;
        private String org_name;
        private String p_org_no;
        private String org_type;

        public String getOrg_id() {
            return org_id;
        }

        public void setOrg_id(String org_id) {
            this.org_id = org_id;
        }

        public String getNo() {
            return no;
        }

        public void setNo(String no) {
            this.no = no;
        }

        public String getOrg_name() {
            return org_name;
        }

        public void setOrg_name(String org_name) {
            this.org_name = org_name;
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
    }
}
