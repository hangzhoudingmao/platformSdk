package com.dingmao.platformsdk.registrationrelated;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/24
 */
@Setter
@Getter
public class RegListRsp {
    /**
     * total_page : 4.758901914507398E7
     * total_count : -8.81376568510742E7
     * list : [{"user_reg_id":"voluptate","user_type":"nulla non enim deserunt","user_no":"et eu ea magna","user_name":"sed commodo","phone":"nulla nostrud irure","job_name":"elit Ut cillum","company_name":"nulla","reg_date":"ullamco voluptate pariatur Duis aute","status":"adipisicing elit deserunt"},{"user_reg_id":"eiusmod aute","user_type":"sint laborum exercitation","user_no":"est consectetur enim","user_name":"in ut id et aliqua","phone":"dolore","job_name":"nulla ipsum ad","company_name":"deserunt ipsum velit","reg_date":"et in elit Lorem Excepteur","status":"esse sed minim dolore"},{"user_reg_id":"qui proident nisi","user_type":"","user_no":"amet ex dolor reprehenderit ullamco","user_name":"Lorem","phone":"aute proident sunt","job_name":"ex non aute","company_name":"","reg_date":"occaecat","status":"tempor"}]
     * cur_page : exercitation
     * page_size : do deserunt eiusmod proident
     */

    private double total_page;
    private double total_count;
    private String cur_page;
    private String page_size;
    private List<ListBean> list;

    @Setter
    @Getter
    public static class ListBean {
        /**
         * user_reg_id : voluptate
         * user_type : nulla non enim deserunt
         * user_no : et eu ea magna
         * user_name : sed commodo
         * phone : nulla nostrud irure
         * job_name : elit Ut cillum
         * company_name : nulla
         * reg_date : ullamco voluptate pariatur Duis aute
         * status : adipisicing elit deserunt
         */

        private String user_reg_id;
        private String user_type;
        private String user_no;
        private String user_name;
        private String phone;
        private String job_name;
        private String company_name;
        private String reg_date;
        private String status;


    }
}
