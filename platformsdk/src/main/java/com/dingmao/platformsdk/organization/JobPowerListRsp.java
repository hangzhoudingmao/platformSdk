package com.dingmao.platformsdk.organization;

import java.util.List;

/**
 * Create by atu on 2020/8/19
 */
public class JobPowerListRsp {
    private List<ListBean> list;

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * object_id : pariatur quis anim Excepteur est
         * object_name : sit ea nulla laborum
         * object_module : in sint elit anim
         * object_method : consequat
         * object_para : nulla tempor non
         * object_no : fugiat
         * object_sort : Duis velit occaecat proident officia
         * order_no : qui
         * is_menu : officia exercitation magna
         * is_priv : voluptate
         * is_flow : id ex
         * is_samp : eu ex esse
         * children_list : [{},{},{},{}]
         */

        private String object_id;
        private String object_name;
        private String object_module;
        private String object_method;
        private String object_para;
        private String object_no;
        private String object_sort;
        private String order_no;
        private String is_menu;
        private String is_priv;
        private String is_flow;
        private String is_samp;
        private List<ChildrenListBean> children_list;

        public String getObject_id() {
            return object_id;
        }

        public void setObject_id(String object_id) {
            this.object_id = object_id;
        }

        public String getObject_name() {
            return object_name;
        }

        public void setObject_name(String object_name) {
            this.object_name = object_name;
        }

        public String getObject_module() {
            return object_module;
        }

        public void setObject_module(String object_module) {
            this.object_module = object_module;
        }

        public String getObject_method() {
            return object_method;
        }

        public void setObject_method(String object_method) {
            this.object_method = object_method;
        }

        public String getObject_para() {
            return object_para;
        }

        public void setObject_para(String object_para) {
            this.object_para = object_para;
        }

        public String getObject_no() {
            return object_no;
        }

        public void setObject_no(String object_no) {
            this.object_no = object_no;
        }

        public String getObject_sort() {
            return object_sort;
        }

        public void setObject_sort(String object_sort) {
            this.object_sort = object_sort;
        }

        public String getOrder_no() {
            return order_no;
        }

        public void setOrder_no(String order_no) {
            this.order_no = order_no;
        }

        public String getIs_menu() {
            return is_menu;
        }

        public void setIs_menu(String is_menu) {
            this.is_menu = is_menu;
        }

        public String getIs_priv() {
            return is_priv;
        }

        public void setIs_priv(String is_priv) {
            this.is_priv = is_priv;
        }

        public String getIs_flow() {
            return is_flow;
        }

        public void setIs_flow(String is_flow) {
            this.is_flow = is_flow;
        }

        public String getIs_samp() {
            return is_samp;
        }

        public void setIs_samp(String is_samp) {
            this.is_samp = is_samp;
        }

        public List<ChildrenListBean> getChildren_list() {
            return children_list;
        }

        public void setChildren_list(List<ChildrenListBean> children_list) {
            this.children_list = children_list;
        }

        public static class ChildrenListBean {
        }
    }
}
