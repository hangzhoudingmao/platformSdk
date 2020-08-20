package com.dingmao.platformsdk.usermanagement;

import java.util.List;

/**
 * Create by atu on 2020/8/20
 */
public class UserMenuRsp {
    private List<ListBean> list;

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * menu_no : quis ea incididunt consectetur
         * menu_name : Excepte
         * is_dir : dolore commodo sunt
         * order_no : officia incididunt
         * menu_css : aliqua velit sun
         * ouer_url : aliqua ipsum voluptate
         * menu_type : dolore
         * object_info : {"object_id":"Lorem aute labore","object_name":"eiusmod","object_module":"in esse enim","object_method":"sit do","object_para":"pariatur in eiusmod sed","object_no":"culpa amet reprehenderit fugiat et","object_sort":"cillum aute ullamco"}
         * children_list : [{},{},{},{}]
         */

        private String menu_no;
        private String menu_name;
        private String is_dir;
        private String order_no;
        private String menu_css;
        private String ouer_url;
        private String menu_type;
        private ObjectInfoBean object_info;
        private List<ChildrenListBean> children_list;

        public String getMenu_no() {
            return menu_no;
        }

        public void setMenu_no(String menu_no) {
            this.menu_no = menu_no;
        }

        public String getMenu_name() {
            return menu_name;
        }

        public void setMenu_name(String menu_name) {
            this.menu_name = menu_name;
        }

        public String getIs_dir() {
            return is_dir;
        }

        public void setIs_dir(String is_dir) {
            this.is_dir = is_dir;
        }

        public String getOrder_no() {
            return order_no;
        }

        public void setOrder_no(String order_no) {
            this.order_no = order_no;
        }

        public String getMenu_css() {
            return menu_css;
        }

        public void setMenu_css(String menu_css) {
            this.menu_css = menu_css;
        }

        public String getOuer_url() {
            return ouer_url;
        }

        public void setOuer_url(String ouer_url) {
            this.ouer_url = ouer_url;
        }

        public String getMenu_type() {
            return menu_type;
        }

        public void setMenu_type(String menu_type) {
            this.menu_type = menu_type;
        }

        public ObjectInfoBean getObject_info() {
            return object_info;
        }

        public void setObject_info(ObjectInfoBean object_info) {
            this.object_info = object_info;
        }

        public List<ChildrenListBean> getChildren_list() {
            return children_list;
        }

        public void setChildren_list(List<ChildrenListBean> children_list) {
            this.children_list = children_list;
        }

        public static class ObjectInfoBean {
            /**
             * object_id : Lorem aute labore
             * object_name : eiusmod
             * object_module : in esse enim
             * object_method : sit do
             * object_para : pariatur in eiusmod sed
             * object_no : culpa amet reprehenderit fugiat et
             * object_sort : cillum aute ullamco
             */

            private String object_id;

            public String getObject_id() {
                return object_id;
            }

            public void setObject_id(String object_id) {
                this.object_id = object_id;
            }
        }

        public static class ChildrenListBean {
        }
    }
}
