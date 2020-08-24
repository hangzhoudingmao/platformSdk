package com.dingmao.platformsdk.resourcesmanagement;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Getter
@Setter
public class MenuTreeRsp {
    /**
     * menu_id :
     * menu_no : dolore i
     * menu_name : consectetur occaec
     * p_menu_no : tempor irure ex commodo
     * is_dir : ullamco culpa
     * menu_css : cillum amet ullamco adipisicing culpa
     * route_url : Duis non amet dolor
     * menu_type : ad
     * system_no : sit Duis est amet et
     * children_list : [{"menu_id":"deserunt anim proident ea eiusmod","menu_no":"ullamco ut dolor","menu_name":"id et quis","p_menu_no":"cupida","is_dir":"aute","menu_css":"cupidatat ullamco in culpa adipisicing","route_url":"repr","menu_type":"nisi","system_no":"proident occaecat commodo","children_list":[{"menu_id":"Ut et velit","menu_no":"laboris","menu_name":"velit","p_menu_no":"voluptate fu","is_dir":"ipsum id cill","menu_css":"elit","route_url":"do non exercitation est sint","menu_type":"magna","system_no":"e"},{"menu_id":"culpa Ut exercitation","menu_no":"minim dolore exercitation","menu_name":"labore dolore aliquip","p_menu_no":"eiusmod ullamco dolor sed laboris","is_dir":"Ut aliqua ","menu_css":"proident elit dolor culpa consectetur","route_url":"labore","menu_type":"ad veniam voluptate velit","system_no":"q"},{"menu_id":"","menu_no":"consectetur","menu_name":"s","p_menu_no":"commodo pariatur non ullamco","is_dir":"consectetur non veniam anim pariatur","menu_css":"nulla aute","route_url":"dolore enim quis","menu_type":"dolor dolore","system_no":"aliquip elit commodo culpa"}]},{"menu_id":"Lorem nisi amet ea velit","menu_no":"ea dolore eu","menu_name":"nisi eiusmod do id Lorem","p_menu_no":"eiusmod","is_dir":"Excepteur pariatur ","menu_css":"sunt exercitation magna","route_url":"deserunt do","menu_type":"in cupidatat","system_no":"quis et dolore occaecat ex","children_list":[{"menu_id":"sunt aliquip","menu_no":"commodo in","menu_name":"in id culpa non dolore","p_menu_no":"consectetur adipisicing aliquip aute","is_dir":"incididunt proident reprehenderit exercitation cupidatat","menu_css":"nostrud non eu","route_url":"deserunt Duis","menu_type":"ut laboris occaecat Duis dolore","system_no":"qui et do enim"}]}]
     */

    private String menu_id;
    private String menu_no;
    private String menu_name;
    private String p_menu_no;
    private String is_dir;
    private String menu_css;
    private String route_url;
    private String menu_type;
    private String system_no;
    private List<ChildrenListBeanX> children_list;

    @Getter
    @Setter
    public static class ChildrenListBeanX {
        /**
         * menu_id : deserunt anim proident ea eiusmod
         * menu_no : ullamco ut dolor
         * menu_name : id et quis
         * p_menu_no : cupida
         * is_dir : aute
         * menu_css : cupidatat ullamco in culpa adipisicing
         * route_url : repr
         * menu_type : nisi
         * system_no : proident occaecat commodo
         * children_list : [{"menu_id":"Ut et velit","menu_no":"laboris","menu_name":"velit","p_menu_no":"voluptate fu","is_dir":"ipsum id cill","menu_css":"elit","route_url":"do non exercitation est sint","menu_type":"magna","system_no":"e"},{"menu_id":"culpa Ut exercitation","menu_no":"minim dolore exercitation","menu_name":"labore dolore aliquip","p_menu_no":"eiusmod ullamco dolor sed laboris","is_dir":"Ut aliqua ","menu_css":"proident elit dolor culpa consectetur","route_url":"labore","menu_type":"ad veniam voluptate velit","system_no":"q"},{"menu_id":"","menu_no":"consectetur","menu_name":"s","p_menu_no":"commodo pariatur non ullamco","is_dir":"consectetur non veniam anim pariatur","menu_css":"nulla aute","route_url":"dolore enim quis","menu_type":"dolor dolore","system_no":"aliquip elit commodo culpa"}]
         */

        private String menu_id;
        private String menu_no;
        private String menu_name;
        private String p_menu_no;
        private String is_dir;
        private String menu_css;
        private String route_url;
        private String menu_type;
        private String system_no;
        private List<ChildrenListBean> children_list;


        @Getter
        @Setter
        public static class ChildrenListBean {
            /**
             * menu_id : Ut et velit
             * menu_no : laboris
             * menu_name : velit
             * p_menu_no : voluptate fu
             * is_dir : ipsum id cill
             * menu_css : elit
             * route_url : do non exercitation est sint
             * menu_type : magna
             * system_no : e
             */

            private String menu_id;
            private String menu_no;
            private String menu_name;
            private String p_menu_no;
            private String is_dir;
            private String menu_css;
            private String route_url;
            private String menu_type;
            private String system_no;


        }
    }
}
