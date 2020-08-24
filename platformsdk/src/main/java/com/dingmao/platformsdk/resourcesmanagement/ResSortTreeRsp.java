package com.dingmao.platformsdk.resourcesmanagement;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class ResSortTreeRsp {
    /**
     * object_id : et sunt adipisicing do commodo
     * object_name : irure et eu dolor laboris
     * object_no : ipsum quis
     * p_object_no : Excepteur voluptate ea
     * system_no : velit tempor enim eu incididunt
     * is_dir : irure
     * children_list : [{"object_id":"eiusmod","object_name":"nisi Duis dolore","object_no":"minim sunt","p_object_no":"elit","system_no":"reprehenderit et ad deserunt dolor","is_dir":"Duis cillum magna","children_list":[{"object_id":"dolore","object_name":"Duis labore dolore incididunt","object_no":"in sed","p_object_no":"sint cupidatat dolor aliquip magna","system_no":"veniam","is_dir":"consequat tempor"},{"object_id":"proident Lorem exe","object_name":"non","object_no":"mollit","p_object_no":"cupida","system_no":"dolore non pariatur et","is_dir":"ut"},{"object_id":"deserunt in","object_name":"quis","object_no":"id cupidatat","p_object_no":"ad fugiat ","system_no":"eu in reprehenderit","is_dir":"laborum adipisicing nisi"},{"object_id":"aliquip nulla","object_name":"esse ad sunt dolor","object_no":"elit est nostrud ad","p_object_no":"exercitation","system_no":"quis","is_dir":"do in esse ea"},{"object_id":"officia cillum","object_name":"sunt dolore aliqua qui mollit","object_no":"culpa","p_object_no":"irure","system_no":"in","is_dir":"consectetur quis magna enim"}]}]
     */

    private String object_id;
    private String object_name;
    private String object_no;
    private String p_object_no;
    private String system_no;
    private String is_dir;
    private List<ChildrenListBeanX> children_list;

    @Setter
    @Getter
    public static class ChildrenListBeanX {
        /**
         * object_id : eiusmod
         * object_name : nisi Duis dolore
         * object_no : minim sunt
         * p_object_no : elit
         * system_no : reprehenderit et ad deserunt dolor
         * is_dir : Duis cillum magna
         * children_list : [{"object_id":"dolore","object_name":"Duis labore dolore incididunt","object_no":"in sed","p_object_no":"sint cupidatat dolor aliquip magna","system_no":"veniam","is_dir":"consequat tempor"},{"object_id":"proident Lorem exe","object_name":"non","object_no":"mollit","p_object_no":"cupida","system_no":"dolore non pariatur et","is_dir":"ut"},{"object_id":"deserunt in","object_name":"quis","object_no":"id cupidatat","p_object_no":"ad fugiat ","system_no":"eu in reprehenderit","is_dir":"laborum adipisicing nisi"},{"object_id":"aliquip nulla","object_name":"esse ad sunt dolor","object_no":"elit est nostrud ad","p_object_no":"exercitation","system_no":"quis","is_dir":"do in esse ea"},{"object_id":"officia cillum","object_name":"sunt dolore aliqua qui mollit","object_no":"culpa","p_object_no":"irure","system_no":"in","is_dir":"consectetur quis magna enim"}]
         */

        private String object_id;
        private String object_name;
        private String object_no;
        private String p_object_no;
        private String system_no;
        private String is_dir;
        private List<ChildrenListBean> children_list;

        @Setter
        @Getter
        public static class ChildrenListBean {
            /**
             * object_id : dolore
             * object_name : Duis labore dolore incididunt
             * object_no : in sed
             * p_object_no : sint cupidatat dolor aliquip magna
             * system_no : veniam
             * is_dir : consequat tempor
             */
            private String object_id;
            private String object_name;
            private String object_no;
            private String p_object_no;
            private String system_no;
            private String is_dir;
        }
    }
}
