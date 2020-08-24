package com.dingmao.platformsdk.configurationmanagement;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Getter
@Setter
public class CodeSortTreeRsp {
    private List<ListBean> list;

    @Getter
    @Setter
    public static class ListBean {
        /**
         * code_sort_id : in ea laboris
         * sort_name : laborum
         * code_type : Ut in
         * p_code_type : minim irure consequ
         * is_valid : cupid
         * children_list : [{"code_sort_id":"in ea laboris","sort_name":"laborum","code_type":"Ut in","p_code_type":"minim irure consequ","is_valid":"cupid"}]
         */

        private String code_sort_id;
        private String sort_name;
        private String code_type;
        private String p_code_type;
        private String is_valid;
        private List<ChildrenListBean> children_list;

        @Getter
        @Setter
        public static class ChildrenListBean {
            /**
             * code_sort_id : in ea laboris
             * sort_name : laborum
             * code_type : Ut in
             * p_code_type : minim irure consequ
             * is_valid : cupid
             */

            private String code_sort_id;
            private String sort_name;
            private String code_type;
            private String p_code_type;
            private String is_valid;


        }
    }
}
