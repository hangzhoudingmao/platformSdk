package com.dingmao.platformsdk.resourcesmanagement;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Getter
@Setter
public class AuthTempListRsp {
    /**
     * total_page : -8.6725143589485E7
     * total_count : 1.3108302779024988E7
     * list : [{"auth_template_id":"ut eiusmod exercitation","auth_template_name":"dolor","org_no":"ullamco sint sit aliquip","company_id":"ut ut","auth_numbers":"est ex"}]
     * cur_page : deserunt consequat eu aliquip magna
     * page_size : culpa sed
     */

    private double total_page;
    private double total_count;
    private String cur_page;
    private String page_size;
    private List<ListBean> list;


    @Getter
    @Setter
    public static class ListBean {
        /**
         * auth_template_id : ut eiusmod exercitation
         * auth_template_name : dolor
         * org_no : ullamco sint sit aliquip
         * company_id : ut ut
         * auth_numbers : est ex
         */

        private String auth_template_id;
        private String auth_template_name;
        private String org_no;
        private String company_id;
        private String auth_numbers;


    }
}
