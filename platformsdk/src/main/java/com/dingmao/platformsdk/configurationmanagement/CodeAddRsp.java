package com.dingmao.platformsdk.configurationmanagement;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class CodeAddRsp {
    private List<ListBean> list;

    @Setter
    @Getter
    public static class ListBean {
        /**
         * code_id : dolore in ipsum
         * value : dolore
         * name : sed
         * content1 : incididunt consequat ex exercitation
         * content2 : voluptate consectetur esse
         * content3 :
         * content4 : deserunt reprehenderit
         * content5 : cons
         * order_no : cillum
         */

        private String code_id;
        private String value;
        private String name;
        private String content1;
        private String content2;
        private String content3;
        private String content4;
        private String content5;
        private String order_no;


    }
}
