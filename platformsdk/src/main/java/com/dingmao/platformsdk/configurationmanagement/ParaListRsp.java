package com.dingmao.platformsdk.configurationmanagement;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Getter
@Setter
public class ParaListRsp {
    /**
     * total_count : 2.2463672932557836E7
     * total_page : -4.522427529593678E7
     * page_size : -6.234629230683062E7
     * cur_page : 4.809144109822029E7
     * list : [{"syspara_id":"in Excepteur","syspara_name":"nulla aliqua","syspara_value":"Ut Duis eu ex magna","para_type":"ex ea ipsum","syspara_code":"nostru","org_no":"officia"},{"syspara_id":"mollit Excepteur dolore ut","syspara_name":"in reprehenderit","syspara_value":"consectetur in laborum do id","para_type":"elit ullamco ut","syspara_code":"nisi aute","org_no":"laborum"}]
     */

    private double total_count;
    private double total_page;
    private double page_size;
    private double cur_page;
    private List<ListBean> list;

    @Getter
    @Setter
    public static class ListBean {
        /**
         * syspara_id : in Excepteur
         * syspara_name : nulla aliqua
         * syspara_value : Ut Duis eu ex magna
         * para_type : ex ea ipsum
         * syspara_code : nostru
         * org_no : officia
         */

        private String syspara_id;
        private String syspara_name;
        private String syspara_value;
        private String para_type;
        private String syspara_code;
        private String org_no;


    }
}
