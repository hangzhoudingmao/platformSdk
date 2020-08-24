package com.dingmao.platformsdk.configurationmanagement;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Getter
@Setter
public class CodeListRsp {
    private List<ListBean> list;
    @Getter
    @Setter
    public static class ListBean {
        /**
         * code_id : 7.542540382160392E7
         * code_type : ut
         * value : officia
         * name : dolor
         * content1 : aliquip dolor consequat
         * content2 : consequat anim
         * content3 : amet nulla proident adipisicing sunt
         * content4 : fugiat eiusmod deserunt
         * content5 : in
         * order_no : -3.744006217456058E7
         */

        private double code_id;
        private String code_type;
        private String value;
        private String name;
        private String content1;
        private String content2;
        private String content3;
        private String content4;
        private String content5;
        private double order_no;


    }
}
