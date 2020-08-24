package com.dingmao.platformsdk.configurationmanagement;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Getter
@Setter
public class ParaSortTreeRsp {
    private List<ListBean> list;


    @Getter
    @Setter
    public static class ListBean {
        /**
         * syspara_sort_id : ipsum dolor sed anim
         * para_name : officia labore et
         * para_type : ipsum adipisicing
         * p_para_type : ullamco ea elit dolor cillum
         * is_valid : aliquip consequat ex cu
         * children_list : [{"syspara_sort_id":"ipsum dolor sed anim","para_name":"officia labore et","para_type":"ipsum adipisicing","p_para_type":"ullamco ea elit dolor cillum","is_valid":"aliquip consequat ex cu"}]
         */

        private String syspara_sort_id;
        private String para_name;
        private String para_type;
        private String p_para_type;
        private String is_valid;
        private List<ChildrenListBean> children_list;

        @Getter
        @Setter
        public static class ChildrenListBean {
            /**
             * syspara_sort_id : ipsum dolor sed anim
             * para_name : officia labore et
             * para_type : ipsum adipisicing
             * p_para_type : ullamco ea elit dolor cillum
             * is_valid : aliquip consequat ex cu
             */

            private String syspara_sort_id;
            private String para_name;
            private String para_type;
            private String p_para_type;
            private String is_valid;


        }
    }
}
