package com.dingmao.platformsdk.basicservices;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/17
 */
@Getter
@Setter
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

    @Getter
    @Setter
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

    }
}
