package com.dingmao.platformsdk.systemmanagement;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/26
 */
@Setter
@Getter
public class CheckUpdateRsp {
    private List<ListBean> list;

    @Getter
    @Setter
    public static class ListBean {
        /**
         * sys_ver_id : Excepteur aliquip fugiat ut
         * src_ver : ullamco proident occaecat aliqua laborum
         * ver : voluptate
         * ver_content : nisi incididunt ullamco sint Excepteur
         * ver_date : mollit ut officia
         * ver_user_id : amet id laboris ut
         * ver_user_name : ea
         * ver_user_no : in fugiat adipisicing exercitation occaecat
         * system_type : eiusmod incididunt
         * is_force : eiusmod amet esse exercitation dolor
         * url : labore eiusmod reprehenderit ea ut
         * create_date : id
         */

        private String sys_ver_id;
        private String src_ver;
        private String ver;
        private String ver_content;
        private String ver_date;
        private String ver_user_id;
        private String ver_user_name;
        private String ver_user_no;
        private String system_type;
        private String is_force;
        private String url;
        private String create_date;

    }
}
