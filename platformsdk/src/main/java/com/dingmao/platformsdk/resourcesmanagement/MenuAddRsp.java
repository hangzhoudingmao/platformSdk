package com.dingmao.platformsdk.resourcesmanagement;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Getter
@Setter
public class MenuAddRsp {
    /**
     * menu_no : exercitation deserunt in aute proident
     * menu_name : sunt
     * order_no : ad est voluptate
     * menu_css : reprehenderit culpa deserunt
     * outer_url : irure laborum minim
     * menu_type : laborum est officia culpa commodo
     * object_info : {"object_id":"cillum","object_name":"dolore dolore et irure","object_module":"aute","object_method":"ex occaecat dolor dolore","object_para":"quis","object_no":"s","object_sort":"Excepteur adipisicing consequat"}
     * menu_id : adipisicing laboris non
     */

    private String menu_no;
    private String menu_name;
    private String order_no;
    private String menu_css;
    private String outer_url;
    private String menu_type;
    private ObjectInfoBean object_info;
    private String menu_id;


    @Getter
    @Setter
    public static class ObjectInfoBean {
        /**
         * object_id : cillum
         * object_name : dolore dolore et irure
         * object_module : aute
         * object_method : ex occaecat dolor dolore
         * object_para : quis
         * object_no : s
         * object_sort : Excepteur adipisicing consequat
         */

        private String object_id;
        private String object_name;
        private String object_module;
        private String object_method;
        private String object_para;
        private String object_no;
        private String object_sort;


    }
}
