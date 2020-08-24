package com.dingmao.platformsdk.resourcesmanagement;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class AuthListRsp {
    private List<ListBean> list;

    @Setter
    @Getter
    public static class ListBean {
        /**
         * object_id : 5.244316502418354E7
         * object_name : fugiat
         * object_module : commodo
         * object_method : ipsum
         * object_para : officia laboris sunt mollit id
         * object_no : voluptate
         * object_sort : nostrud dolor in
         * p_object_no : ullamco deserunt proident pariatur ut
         * is_menu : reprehenderit veniam in deserunt nisi
         * order_no : 1.4685821825843573E7
         * is_priv : sunt
         * is_flow : c
         * is_samp : ad do laborum sed est
         * children_list : [{"object_id":"aliquip ipsum","object_name":"commodo elit cupidatat sed aliquip","object_module":"ea consequat in est","object_method":"qui laboris do Duis","object_para":"culpa officia","object_no":"exercitatio","object_sort":"aute velit aliquip c","p_object_no":"laborum dolor","order_no":"irure qui commodo nulla","is_samp":"Duis amet Excepteur","is_priv":"cupidatat"}]
         */

        private double object_id;
        private String object_name;
        private String object_module;
        private String object_method;
        private String object_para;
        private String object_no;
        private String object_sort;
        private String p_object_no;
        private String is_menu;
        private double order_no;
        private String is_priv;
        private String is_flow;
        private String is_samp;
        private List<ChildrenListBean> children_list;

       @Setter
       @Getter
        public static class ChildrenListBean {
            /**
             * object_id : aliquip ipsum
             * object_name : commodo elit cupidatat sed aliquip
             * object_module : ea consequat in est
             * object_method : qui laboris do Duis
             * object_para : culpa officia
             * object_no : exercitatio
             * object_sort : aute velit aliquip c
             * p_object_no : laborum dolor
             * order_no : irure qui commodo nulla
             * is_samp : Duis amet Excepteur
             * is_priv : cupidatat
             */

            private String object_id;
            private String object_name;
            private String object_module;
            private String object_method;
            private String object_para;
            private String object_no;
            private String object_sort;
            private String p_object_no;
            private String order_no;
            private String is_samp;
            private String is_priv;


        }
    }
}
