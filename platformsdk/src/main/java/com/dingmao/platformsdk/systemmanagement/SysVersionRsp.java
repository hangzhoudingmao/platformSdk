package com.dingmao.platformsdk.systemmanagement;

import java.util.List;

/**
 * Create by atu on 2020/8/20
 */
public class SysVersionRsp {
    /**
     * total_count : -5.89256098439773E7
     * total_page : 6.806862031259513E7
     * page_size : -4134324.8835059106
     * cur_page : 7.98395726803216E7
     * list : [{"sys_ver_id":"in dolore Excepteur","src_ver":"ipsum ad Lorem","ver":"ipsum","ver_content":"aliquip Exce","ver_date":"amet irure dolor","ver_user_id":"aute ","is_force":"sit sed est sint","url":"exercitation ea","create_date":"esse sint"},{"sys_ver_id":"commodo voluptate ut in magna","src_ver":"sint consectetur labore enim","ver":"minim laborum","ver_content":"aliqua deserunt Excepteur veniam velit","ver_date":"est","ver_user_id":"reprehenderit esse exercitation occaecat est","is_force":"non sint","url":"Lorem pariatur ","create_date":"fugiat voluptate pariatur nulla"},{"sys_ver_id":"ea magna Lorem","src_ver":"laborum est pariatur","ver":"laborum labore velit commodo","ver_content":"labore consectetur ir","ver_date":"Duis sit","ver_user_id":"Lorem non velit sint do","is_force":"laboris in in eiusmod ipsum","url":"ex","create_date":"voluptate officia fugiat consectetur aliquip"},{"sys_ver_id":"est minim","src_ver":"minim","ver":"mollit enim et","ver_content":"dolore in","ver_date":"minim eu","ver_user_id":"elit enim exercitation nisi ","is_force":"laboris reprehenderit ex eiusmod","url":"culpa incididunt","create_date":"dolor"}]
     */

    private double total_count;
    private double total_page;
    private double page_size;
    private double cur_page;
    private List<ListBean> list;

    public double getTotal_count() {
        return total_count;
    }

    public void setTotal_count(double total_count) {
        this.total_count = total_count;
    }

    public double getTotal_page() {
        return total_page;
    }

    public void setTotal_page(double total_page) {
        this.total_page = total_page;
    }

    public double getPage_size() {
        return page_size;
    }

    public void setPage_size(double page_size) {
        this.page_size = page_size;
    }

    public double getCur_page() {
        return cur_page;
    }

    public void setCur_page(double cur_page) {
        this.cur_page = cur_page;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * sys_ver_id : in dolore Excepteur
         * src_ver : ipsum ad Lorem
         * ver : ipsum
         * ver_content : aliquip Exce
         * ver_date : amet irure dolor
         * ver_user_id : aute
         * is_force : sit sed est sint
         * url : exercitation ea
         * create_date : esse sint
         */

        private String sys_ver_id;
        private String src_ver;
        private String ver;
        private String ver_content;
        private String ver_date;
        private String ver_user_id;
        private String is_force;
        private String url;
        private String create_date;

        public String getSys_ver_id() {
            return sys_ver_id;
        }

        public void setSys_ver_id(String sys_ver_id) {
            this.sys_ver_id = sys_ver_id;
        }

        public String getSrc_ver() {
            return src_ver;
        }

        public void setSrc_ver(String src_ver) {
            this.src_ver = src_ver;
        }

        public String getVer() {
            return ver;
        }

        public void setVer(String ver) {
            this.ver = ver;
        }

        public String getVer_content() {
            return ver_content;
        }

        public void setVer_content(String ver_content) {
            this.ver_content = ver_content;
        }

        public String getVer_date() {
            return ver_date;
        }

        public void setVer_date(String ver_date) {
            this.ver_date = ver_date;
        }

        public String getVer_user_id() {
            return ver_user_id;
        }

        public void setVer_user_id(String ver_user_id) {
            this.ver_user_id = ver_user_id;
        }

        public String getIs_force() {
            return is_force;
        }

        public void setIs_force(String is_force) {
            this.is_force = is_force;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getCreate_date() {
            return create_date;
        }

        public void setCreate_date(String create_date) {
            this.create_date = create_date;
        }
    }
}
