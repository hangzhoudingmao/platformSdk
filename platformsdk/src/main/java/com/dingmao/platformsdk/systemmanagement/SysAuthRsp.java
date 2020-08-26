package com.dingmao.platformsdk.systemmanagement;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Setter
@Getter
public class SysAuthRsp {
    private List<ListBean> list;


    @Setter
    @Getter
    public static class ListBean {
        /**
         * sid : ullamco dolor
         * system_no : aute
         * system_name : id sed deserunt tempor commodo
         * system_alias : dolor ut
         */

        private String sid;
        private String system_no;
        private String system_name;
        private String system_alias;

    }
}
