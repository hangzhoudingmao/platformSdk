package com.dingmao.platformsdk.systemmanagement;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/26
 */
@Getter
@Setter
public class BasicConfigRsp {

    /**
     * site_config_id : minim aliqua
     * logo : laborum reprehenderit
     * bg_picture : amet
     * icon : laborum veniam anim est elit
     * icp_no : id et pariatur consectetur labore
     * copyright : anim pariatur
     * system_no : Ut eu elit ipsum culpa
     * create_date : ut pariatur
     * company_id : Duis laborum
     * title : ad culpa Duis
     * domain : dolore velit officia Lorem minim
     * theme_id : Duis sit dolore velit
     * color : irure consectetur officia Ut
     * style : velit magna sunt
     * style_name : consequat sed ad do
     * relative_logo : Ut
     * relative_bg_picture : occaecat et
     * relative_icon : adipisicing
     * theme_list : [{"theme_id":"labore anim","name":"anim exercitation cupidatat","icon":"esse","system_no":"exercitation Duis esse anim consectetur","create_date":"enim in reprehenderit","relative_icon":"in quis"},{"theme_id":"reprehenderit","name":"deserunt qui Lorem","icon":"esse","system_no":"occaecat consequat elit non consectetur","create_date":"","relative_icon":"Excepteur in"},{"theme_id":"ut in Excepteur minim exercitation","name":"ad nisi","icon":"labore in quis","system_no":"et exercitation","create_date":"nostrud ipsum deserunt","relative_icon":"Lorem reprehenderit"},{"theme_id":"tempor adipisicing ex","name":"in ","icon":"in","system_no":"cupidatat aute laborum amet","create_date":"Duis eu veniam nulla","relative_icon":"proident voluptate incididunt ad ipsum"}]
     */

    private String site_config_id;
    private String logo;
    private String bg_picture;
    private String icon;
    private String icp_no;
    private String copyright;
    private String system_no;
    private String create_date;
    private String company_id;
    private String title;
    private String domain;
    private String theme_id;
    private String color;
    private String style;
    private String style_name;
    private String relative_logo;
    private String relative_bg_picture;
    private String relative_icon;
    private List<ThemeListBean> theme_list;


    @Setter
    @Getter
    public static class ThemeListBean {
        /**
         * theme_id : labore anim
         * name : anim exercitation cupidatat
         * icon : esse
         * system_no : exercitation Duis esse anim consectetur
         * create_date : enim in reprehenderit
         * relative_icon : in quis
         */

        private String theme_id;
        private String name;
        private String icon;
        private String system_no;
        private String create_date;
        private String relative_icon;


    }
}
