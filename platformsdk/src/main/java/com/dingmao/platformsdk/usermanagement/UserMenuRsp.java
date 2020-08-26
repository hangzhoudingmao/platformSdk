package com.dingmao.platformsdk.usermanagement;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Setter
@Getter
public class UserMenuRsp {
    private List<ListBean> list;


    @Setter
    @Getter
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
        private List<ObjectInfoBean> object_info;
        private List<ChildrenListBean> children_list;


        @Getter
        @Setter
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

        }

        @Getter
        @Setter
        public static class ChildrenListBean {
            /**
             * menu_id : 399
             * menu_no : homePendding
             * menu_name : 待办信息
             * is_dir : 0
             * order_no : 1
             * menu_css : fa-home
             * outer_url : /
             * menu_type : 1
             * object_id : 528
             * p_menu_no : WarehouseManagement
             * route_url : homePendd
             * object_info : {"object_id":"528","object_name":"待办信息","object_module":"","object_method":"","object_para":"","object_no":"homePendding","object_sort":"1"}
             */

            private String menu_id;
            private String menu_no;
            private String menu_name;
            private String is_dir;
            private String order_no;
            private String menu_css;
            private String outer_url;
            private String menu_type;
            private String object_id;
            private String p_menu_no;
            private String route_url;
//            private ObjectInfoBean object_info;


            @Getter
            @Setter
            public static class ObjectInfoBean {
                /**
                 * object_id : 528
                 * object_name : 待办信息
                 * object_module :
                 * object_method :
                 * object_para :
                 * object_no : homePendding
                 * object_sort : 1
                 */

                private String object_id;
                private String object_name;
                private String object_module;
                private String object_method;
                private String object_para;
                private String object_no;
                private String object_sort;


            }
        }
    }
}
