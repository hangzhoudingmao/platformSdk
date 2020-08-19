package com.dingmao.platformsdk.interfaceservice;

import java.util.List;

/**
 * Create by atu on 2020/8/19
 */
public class ServiceTreeRsp {
    /**
     * id : id pariatur
     * name : sit eu irure esse
     * sort_no : magna ut ad
     * p_id : n
     * system_no : officia in veniam aute pariatur
     * children_list : [{"id":"fugiat reprehenderit et","name":"do","sort_no":"nulla officia ut laborum dolore","system_no":"laboris mollit dolor reprehenderit","p_id":"en","api_url":"Lorem magna officia dolor laborum","remark":"ut dolor culpa eu veniam"}]
     */

    private String id;
    private String name;
    private String sort_no;
    private String p_id;
    private String system_no;
    private List<ChildrenListBean> children_list;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSort_no() {
        return sort_no;
    }

    public void setSort_no(String sort_no) {
        this.sort_no = sort_no;
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getSystem_no() {
        return system_no;
    }

    public void setSystem_no(String system_no) {
        this.system_no = system_no;
    }

    public List<ChildrenListBean> getChildren_list() {
        return children_list;
    }

    public void setChildren_list(List<ChildrenListBean> children_list) {
        this.children_list = children_list;
    }

    public static class ChildrenListBean {
        /**
         * id : fugiat reprehenderit et
         * name : do
         * sort_no : nulla officia ut laborum dolore
         * system_no : laboris mollit dolor reprehenderit
         * p_id : en
         * api_url : Lorem magna officia dolor laborum
         * remark : ut dolor culpa eu veniam
         */

        private String id;
        private String name;
        private String sort_no;
        private String system_no;
        private String p_id;
        private String api_url;
        private String remark;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSort_no() {
            return sort_no;
        }

        public void setSort_no(String sort_no) {
            this.sort_no = sort_no;
        }

        public String getSystem_no() {
            return system_no;
        }

        public void setSystem_no(String system_no) {
            this.system_no = system_no;
        }

        public String getP_id() {
            return p_id;
        }

        public void setP_id(String p_id) {
            this.p_id = p_id;
        }

        public String getApi_url() {
            return api_url;
        }

        public void setApi_url(String api_url) {
            this.api_url = api_url;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }
}
