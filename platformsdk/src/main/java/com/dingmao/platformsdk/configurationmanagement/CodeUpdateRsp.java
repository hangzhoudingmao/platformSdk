package com.dingmao.platformsdk.configurationmanagement;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class CodeUpdateRsp {
    private List<ListBean> list;


    @Setter
    @Getter
    public static class ListBean {
        /**
         * code_id : aliqua ea cillum est exercitation
         * value : mollit enim
         * name : laboris Duis fugiat non
         * content1 : magna aliquip
         * content2 : labore laboris nostrud ullamco amet
         * content3 : ut consequat dolore veniam
         * content4 : Duis dolor mollit
         * content5 : nostrud non laboris
         * order_no : Excepteur dolor do co
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
