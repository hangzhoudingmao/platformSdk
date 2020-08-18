package com.dingmao.platformsdk.basicservices;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Create by atu on 2020/8/17
 */
public class FileListResponse {

    /**
     * total_count : -7.497717813855433E7
     * total_page : 6.311596117017949E7
     * page_size : 3.782628827501014E7
     * cur_page : -1.6873900972181752E7
     * list : [{"file_id":"non officia","content_type":"exercitation cupidatat voluptate","file_name":"mollit","file_size":"ut Excepteur nostrud","store_type":"irure ","file_path":"ullamco","absolute path":"do","module":"aute ex culpa dolore","rela_id":"nostrud dolore culpa Lorem in","create_date":"Lorem Ut anim ad aliquip","create_id":"incididunt ea laboris cillum","create_name":"nisi dolore cillum ","is_delete":"incididun"},{"file_id":"dolor","content_type":"veniam","file_name":"esse","file_size":"aute fugiat eiusmod ","store_type":"elit","file_path":"sed ullamco","absolute path":"anim in ut","module":"in","rela_id":"Lorem aute","create_date":"eiusmod dolore qui est","create_id":"consequat","create_name":"minim qui fugiat quis","is_delete":"laboris an"},{"file_id":"id dolore reprehenderit ullamc","content_type":"irure reprehenderit","file_name":"velit dolor","file_size":"qui esse tempor id nostrud","store_type":"esse aliqua irure","file_path":"proident","absolute path":"consectetur","module":"elit velit laboris","rela_id":"ex sit dolor tempor","create_date":"id sint sit","create_id":"dolore esse ad reprehenderit occ","create_name":"deserunt fugiat occaecat id aute","is_delete":"sit sed do aliquip nulla"},{"file_id":"quis laboris eu","content_type":"sunt culpa ex magna proident","file_name":"Duis","file_size":"quis et ","store_type":"eiusmod reprehenderit do nostrud minim","file_path":"veniam sed","absolute path":"Excepteur elit veniam pariatur","module":"sed velit commodo","rela_id":"non esse","create_date":"","create_id":"consectetur","create_name":"sed","is_delete":"et Excepteur in consequat"}]
     */

    private double total_count;
    private double total_page;
    private double page_size;
    private double cur_page;
    private List<FileListBean> list;

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

    public List<FileListBean> getList() {
        return list;
    }

    public void setList(List<FileListBean> list) {
        this.list = list;
    }

    public class FileListBean {
        /**
         * file_id : non officia
         * content_type : exercitation cupidatat voluptate
         * file_name : mollit
         * file_size : ut Excepteur nostrud
         * store_type : irure
         * file_path : ullamco
         * absolute path : do
         * module : aute ex culpa dolore
         * rela_id : nostrud dolore culpa Lorem in
         * create_date : Lorem Ut anim ad aliquip
         * create_id : incididunt ea laboris cillum
         * create_name : nisi dolore cillum
         * is_delete : incididun
         */

        private String file_id;
        private String content_type;
        private String file_name;
        private String file_size;
        private String store_type;
        private String file_path;
        @SerializedName("absolute path")
        private String _$AbsolutePath121; // FIXME check this code
        private String module;
        private String rela_id;
        private String create_date;
        private String create_id;
        private String create_name;
        private String is_delete;

        public String getFile_id() {
            return file_id;
        }

        public void setFile_id(String file_id) {
            this.file_id = file_id;
        }

        public String getContent_type() {
            return content_type;
        }

        public void setContent_type(String content_type) {
            this.content_type = content_type;
        }

        public String getFile_name() {
            return file_name;
        }

        public void setFile_name(String file_name) {
            this.file_name = file_name;
        }

        public String getFile_size() {
            return file_size;
        }

        public void setFile_size(String file_size) {
            this.file_size = file_size;
        }

        public String getStore_type() {
            return store_type;
        }

        public void setStore_type(String store_type) {
            this.store_type = store_type;
        }

        public String getFile_path() {
            return file_path;
        }

        public void setFile_path(String file_path) {
            this.file_path = file_path;
        }

        public String get_$AbsolutePath121() {
            return _$AbsolutePath121;
        }

        public void set_$AbsolutePath121(String _$AbsolutePath121) {
            this._$AbsolutePath121 = _$AbsolutePath121;
        }

        public String getModule() {
            return module;
        }

        public void setModule(String module) {
            this.module = module;
        }

        public String getRela_id() {
            return rela_id;
        }

        public void setRela_id(String rela_id) {
            this.rela_id = rela_id;
        }

        public String getCreate_date() {
            return create_date;
        }

        public void setCreate_date(String create_date) {
            this.create_date = create_date;
        }

        public String getCreate_id() {
            return create_id;
        }

        public void setCreate_id(String create_id) {
            this.create_id = create_id;
        }

        public String getCreate_name() {
            return create_name;
        }

        public void setCreate_name(String create_name) {
            this.create_name = create_name;
        }

        public String getIs_delete() {
            return is_delete;
        }

        public void setIs_delete(String is_delete) {
            this.is_delete = is_delete;
        }
    }
}
