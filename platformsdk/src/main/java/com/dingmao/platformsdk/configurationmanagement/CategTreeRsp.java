package com.dingmao.platformsdk.configurationmanagement;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Getter
@Setter
public class CategTreeRsp {
    private List<ListBean> list;


    @Getter
    @Setter
    public static class ListBean {
        /**
         * categ_id : dolor eiusmod ut
         * categ_name : veniam tempor est ullamco c
         * categ_no : consequat ex laborum aliqua
         * p_categ_no : commodo minim occaecat
         * children : [{"categ_id":"dolor eiusmod ut","categ_name":"veniam tempor est ullamco c","categ_no":"consequat ex laborum aliqua","p_categ_no":"commodo minim occaecat "}]
         */

        private String categ_id;
        private String categ_name;
        private String categ_no;
        private String p_categ_no;
        private List<ChildrenBean> children;


        @Getter
        @Setter
        public static class ChildrenBean {
            /**
             * categ_id : dolor eiusmod ut
             * categ_name : veniam tempor est ullamco c
             * categ_no : consequat ex laborum aliqua
             * p_categ_no : commodo minim occaecat
             */

            private String categ_id;
            private String categ_name;
            private String categ_no;
            private String p_categ_no;


        }
    }
}
