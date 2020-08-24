package com.dingmao.platformsdk.resourcesmanagement;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class TempAuthListRsp {
    /**
     * object_id : laborum in cupidatat
     * object_name : voluptate dolore
     * object_no : veniam
     * p_object_no : exercitation laboris
     * object_sort : dolor
     * object_module : id fugiat dolor
     * object_method : tempor ea
     * object_para : non ut enim cillum
     * is_menu : do sit
     * is_priv : aute
     * is_flow : eu aliquip Dui
     * is_samp : sed quis culpa veniam adipisicing
     * children_list : [{"object_id":"amet","object_name":"occaecat nulla veniam aliquip tempor","object_no":"enim fugiat adipisicing","p_object_no":"ut Duis anim dolor dolore","object_sort":"ut in","object_module":"in ex laborum aliquip","object_method":"dolor et","object_para":"reprehenderit veniam","is_menu":"culpa cillum ut do ipsum","is_priv":"nulla incididunt","is_flow":"reprehenderit molli","is_samp":"nulla do"}]
     */

    private String object_id;
    private String object_name;
    private String object_no;
    private String p_object_no;
    private String object_sort;
    private String object_module;
    private String object_method;
    private String object_para;
    private String is_menu;
    private String is_priv;
    private String is_flow;
    private String is_samp;
    private List<ChildrenListBean> children_list;

    @Setter
    @Getter
    public static class ChildrenListBean {
        /**
         * object_id : amet
         * object_name : occaecat nulla veniam aliquip tempor
         * object_no : enim fugiat adipisicing
         * p_object_no : ut Duis anim dolor dolore
         * object_sort : ut in
         * object_module : in ex laborum aliquip
         * object_method : dolor et
         * object_para : reprehenderit veniam
         * is_menu : culpa cillum ut do ipsum
         * is_priv : nulla incididunt
         * is_flow : reprehenderit molli
         * is_samp : nulla do
         */

        private String object_id;
        private String object_name;
        private String object_no;
        private String p_object_no;
        private String object_sort;
        private String object_module;
        private String object_method;
        private String object_para;
        private String is_menu;
        private String is_priv;
        private String is_flow;
        private String is_samp;

    }
}
