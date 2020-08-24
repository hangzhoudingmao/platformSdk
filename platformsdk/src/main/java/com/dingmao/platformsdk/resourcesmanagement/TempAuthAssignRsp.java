package com.dingmao.platformsdk.resourcesmanagement;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Getter
@Setter
public class TempAuthAssignRsp {
    /**
     * object_id : dolore
     * object_name : Excepteur dolor culpa dolore in
     * object_no : do consectetur pariatur proident ipsum
     * p_object_no : dolor anim eni
     * object_sort : elit et
     * object_module : q
     * object_method : dolore
     * object_para : cillum ullamco
     * is_menu : id dolore Lorem dolor
     * is_priv : eiusmod aliquip in adipisicing
     * is_flow : consect
     * is_samp : dolor
     * children_list : [{"object_id":"sit","object_name":"magna","object_no":"reprehender","p_object_no":"quis","object_sort":"sint","object_module":"nisi esse","object_method":"qui ut","object_para":"in consequat","is_menu":"id labore occaecat","is_priv":"cillum enim","is_flow":"esse eu","is_samp":"Ut exercitation minim eiusmod tempor"}]
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

    @Getter
    @Setter
    public static class ChildrenListBean {
        /**
         * object_id : sit
         * object_name : magna
         * object_no : reprehender
         * p_object_no : quis
         * object_sort : sint
         * object_module : nisi esse
         * object_method : qui ut
         * object_para : in consequat
         * is_menu : id labore occaecat
         * is_priv : cillum enim
         * is_flow : esse eu
         * is_samp : Ut exercitation minim eiusmod tempor
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
