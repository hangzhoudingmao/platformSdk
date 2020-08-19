package com.dingmao.platformsdk.organization;

import java.util.List;

/**
 * Create by atu on 2020/8/19
 */
public class ObsPowerListRsp {
    /**
     * total_page : -8.34336724905826E7
     * total_count : 1.1411596482270166E7
     * list : [{"role_priv_id":"cupidatat quis laborum es","object_id":"id fugiat anim","object_name":"consectetur labore ut sed","object_no":"adipisicing ex magna eiusmod commodo","p_object_no":"enim elit sint","object_sort":"Ut et id","object_sort_name":"irure tempor nostrud esse est","object_module":"id deserunt adipisicing laboris do","object_method":"ad in do ut","object_para":"dolore","is_menu":"incididunt occaecat","is_priv":"sed aliquip commodo adipisicing","is_flow":"ullamco do laboris","is_samp":"laboris Excepteur","system_no":"Duis","system_name":"do Duis in commodo","object_cate_no":"pariatur","object_cate_name":"Excepteur"},{"role_priv_id":"fugiat repre","object_id":"ad sint","object_name":"mollit","object_no":"nisi non magna dolore","p_object_no":"non exercitation in cupidatat","object_sort":"laboris in qui anim","object_sort_name":"exercitation in quis nulla ex","object_module":"qui","object_method":"dolor","object_para":"nulla consequat","is_menu":"Duis n","is_priv":"pariatur ad sit quis","is_flow":"aliqua ut elit consectetur","is_samp":"velit veniam","system_no":"quis laboris anim minim","system_name":"eiusmod veniam mollit","object_cate_no":"labo","object_cate_name":"aliquip ullamco dolor"},{"role_priv_id":"ut incididunt ex","object_id":"do","object_name":"nostrud","object_no":"irure id eu do sit","p_object_no":"consequat reprehenderit eiusmod","object_sort":"pa","object_sort_name":"culpa mollit dolor","object_module":"ea incididunt labore consectetur","object_method":"veniam mollit tempor sint in","object_para":"proident Ut","is_menu":"consequat in","is_priv":"Ut fugiat","is_flow":"culpa fugiat quis dolor","is_samp":"amet laborum reprehenderit consectetur ut","system_no":"ull","system_name":"aliqu","object_cate_no":"et Duis pariatur","object_cate_name":"in"},{"role_priv_id":"reprehenderit nulla laborum","object_id":"dolore","object_name":"anim ipsum in aute consectetur","object_no":"ipsum proident","p_object_no":"incididunt Ut","object_sort":"id est voluptate L","object_sort_name":"adipisicing nisi culpa et Ut","object_module":"adipisicing labore","object_method":"ipsum sunt","object_para":"mollit ea","is_menu":"nulla ut ad magna deserunt","is_priv":"sint ex fugiat sunt et","is_flow":"sunt pariatur","is_samp":"commodo dolore aliqua","system_no":"et laborum dolore","system_name":"sint","object_cate_no":"cupidat","object_cate_name":"velit n"},{"role_priv_id":"laboris e","object_id":"eu","object_name":"nisi ipsum esse anim","object_no":"ex anim","p_object_no":"eiusmod veniam dolor eu quis","object_sort":"ad Lorem voluptate nisi of","object_sort_name":"elit ipsum","object_module":"id fugiat aliqua","object_method":"eiusmod","object_para":"ullamco Excepteur veniam","is_menu":"anim mollit veniam in enim","is_priv":"do irure","is_flow":"ipsum Ut Duis cillu","is_samp":"aliqua eiusmod ea cillum","system_no":"ut","system_name":"officia nulla","object_cate_no":"Ut ex anim culpa consectetur","object_cate_name":"nulla anim irure sunt"}]
     * cur_page : commodo veniam velit cupidatat aliquip
     * page_size : magna sit ani
     */

    private double total_page;
    private double total_count;
    private String cur_page;
    private String page_size;
    private List<ListBean> list;

    public double getTotal_page() {
        return total_page;
    }

    public void setTotal_page(double total_page) {
        this.total_page = total_page;
    }

    public double getTotal_count() {
        return total_count;
    }

    public void setTotal_count(double total_count) {
        this.total_count = total_count;
    }

    public String getCur_page() {
        return cur_page;
    }

    public void setCur_page(String cur_page) {
        this.cur_page = cur_page;
    }

    public String getPage_size() {
        return page_size;
    }

    public void setPage_size(String page_size) {
        this.page_size = page_size;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * role_priv_id : cupidatat quis laborum es
         * object_id : id fugiat anim
         * object_name : consectetur labore ut sed
         * object_no : adipisicing ex magna eiusmod commodo
         * p_object_no : enim elit sint
         * object_sort : Ut et id
         * object_sort_name : irure tempor nostrud esse est
         * object_module : id deserunt adipisicing laboris do
         * object_method : ad in do ut
         * object_para : dolore
         * is_menu : incididunt occaecat
         * is_priv : sed aliquip commodo adipisicing
         * is_flow : ullamco do laboris
         * is_samp : laboris Excepteur
         * system_no : Duis
         * system_name : do Duis in commodo
         * object_cate_no : pariatur
         * object_cate_name : Excepteur
         */

        private String role_priv_id;
        private String object_id;
        private String object_name;
        private String object_no;
        private String p_object_no;
        private String object_sort;
        private String object_sort_name;
        private String object_module;
        private String object_method;
        private String object_para;
        private String is_menu;
        private String is_priv;
        private String is_flow;
        private String is_samp;
        private String system_no;
        private String system_name;
        private String object_cate_no;
        private String object_cate_name;

        public String getRole_priv_id() {
            return role_priv_id;
        }

        public void setRole_priv_id(String role_priv_id) {
            this.role_priv_id = role_priv_id;
        }

        public String getObject_id() {
            return object_id;
        }

        public void setObject_id(String object_id) {
            this.object_id = object_id;
        }

        public String getObject_name() {
            return object_name;
        }

        public void setObject_name(String object_name) {
            this.object_name = object_name;
        }

        public String getObject_no() {
            return object_no;
        }

        public void setObject_no(String object_no) {
            this.object_no = object_no;
        }

        public String getP_object_no() {
            return p_object_no;
        }

        public void setP_object_no(String p_object_no) {
            this.p_object_no = p_object_no;
        }

        public String getObject_sort() {
            return object_sort;
        }

        public void setObject_sort(String object_sort) {
            this.object_sort = object_sort;
        }

        public String getObject_sort_name() {
            return object_sort_name;
        }

        public void setObject_sort_name(String object_sort_name) {
            this.object_sort_name = object_sort_name;
        }

        public String getObject_module() {
            return object_module;
        }

        public void setObject_module(String object_module) {
            this.object_module = object_module;
        }

        public String getObject_method() {
            return object_method;
        }

        public void setObject_method(String object_method) {
            this.object_method = object_method;
        }

        public String getObject_para() {
            return object_para;
        }

        public void setObject_para(String object_para) {
            this.object_para = object_para;
        }

        public String getIs_menu() {
            return is_menu;
        }

        public void setIs_menu(String is_menu) {
            this.is_menu = is_menu;
        }

        public String getIs_priv() {
            return is_priv;
        }

        public void setIs_priv(String is_priv) {
            this.is_priv = is_priv;
        }

        public String getIs_flow() {
            return is_flow;
        }

        public void setIs_flow(String is_flow) {
            this.is_flow = is_flow;
        }

        public String getIs_samp() {
            return is_samp;
        }

        public void setIs_samp(String is_samp) {
            this.is_samp = is_samp;
        }

        public String getSystem_no() {
            return system_no;
        }

        public void setSystem_no(String system_no) {
            this.system_no = system_no;
        }

        public String getSystem_name() {
            return system_name;
        }

        public void setSystem_name(String system_name) {
            this.system_name = system_name;
        }

        public String getObject_cate_no() {
            return object_cate_no;
        }

        public void setObject_cate_no(String object_cate_no) {
            this.object_cate_no = object_cate_no;
        }

        public String getObject_cate_name() {
            return object_cate_name;
        }

        public void setObject_cate_name(String object_cate_name) {
            this.object_cate_name = object_cate_name;
        }
    }
}
