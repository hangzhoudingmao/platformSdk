package com.dingmao.platformsdk.organization;

import java.util.List;

/**
 * Create by atu on 2020/8/19
 */
public class ObsRelaListRsp {
    /**
     * total_page : 7195907.421890974
     * total_count : 1.906530617181641E7
     * list : [{"role_job_rela_id":"commodo officia minim exercitation irure","auth_template_id":"enim consequat id","auth_template_name":"cillum","object_num":"deserunt Lorem Duis"},{"role_job_rela_id":"aliquip occaecat cupidatat","auth_template_id":"amet eu qui","auth_template_name":"Excepteur incididunt pariatur reprehenderit","object_num":"aute"},{"role_job_rela_id":"non ut sit est","auth_template_id":"nostrud ut tempor ipsum","auth_template_name":"in","object_num":"ullamco fugiat"},{"role_job_rela_id":"dolore","auth_template_id":"exercitation ex quis deserunt","auth_template_name":"fugiat aliquip","object_num":"ipsum sint"}]
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
         * role_job_rela_id : commodo officia minim exercitation irure
         * auth_template_id : enim consequat id
         * auth_template_name : cillum
         * object_num : deserunt Lorem Duis
         */

        private String role_job_rela_id;
        private String auth_template_id;
        private String auth_template_name;
        private String object_num;

        public String getRole_job_rela_id() {
            return role_job_rela_id;
        }

        public void setRole_job_rela_id(String role_job_rela_id) {
            this.role_job_rela_id = role_job_rela_id;
        }

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

        public String getObject_num() {
            return object_num;
        }

        public void setObject_num(String object_num) {
            this.object_num = object_num;
        }
    }
}
