package com.dingmao.platformsdk.organization;

import java.util.List;

/**
 * Create by atu on 2020/8/19
 */
public class OrgJobListRsp {
    /**
     * total_page : -7.727028403936905E7
     * total_count : 6727264.208578855
     * list : [{"auth_template_id":"laborum nostrud sunt ullamco","auth_template_name":"tempor enim ut","org_no":"","company_id":"sed dolore proident in laboris"},{"auth_template_id":"cupidatat fugiat ex","auth_template_name":"aliqua Excepteur culpa nostrud","org_no":"mollit magna nulla","company_id":"consectetur Ut ea ex"},{"auth_template_id":"cillum","auth_template_name":"fugiat aliquip nulla","org_no":"ad dolore est eiusmod amet","company_id":"mollit ipsum culpa laboris"},{"auth_template_id":"in magna","auth_template_name":"magna laboris sint","org_no":"eiusmod","company_id":"nulla"},{"auth_template_id":"exercitation ipsum","auth_template_name":"esse sit cupidatat","org_no":"sunt sed","company_id":"reprehenderit cillum dolore ex"}]
     */

    private double total_page;
    private double total_count;
    private List<ListBean> list;

    public double getTotal_page() {
        return total_page;
    }

    public void setTotal_page(double total_page) {
        this.total_page = total_page;
    }

    public double getTotal_count() {
        return total_count;
    }

    public void setTotal_count(double total_count) {
        this.total_count = total_count;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * auth_template_id : laborum nostrud sunt ullamco
         * auth_template_name : tempor enim ut
         * org_no :
         * company_id : sed dolore proident in laboris
         */

        private String auth_template_id;
        private String auth_template_name;
        private String org_no;
        private String company_id;

        public String getAuth_template_id() {
            return auth_template_id;
        }

        public void setAuth_template_id(String auth_template_id) {
            this.auth_template_id = auth_template_id;
        }

        public String getAuth_template_name() {
            return auth_template_name;
        }

        public void setAuth_template_name(String auth_template_name) {
            this.auth_template_name = auth_template_name;
        }

        public String getOrg_no() {
            return org_no;
        }

        public void setOrg_no(String org_no) {
            this.org_no = org_no;
        }

        public String getCompany_id() {
            return company_id;
        }

        public void setCompany_id(String company_id) {
            this.company_id = company_id;
        }
    }
}
