package com.dingmao.platformsdk.basicservices;


import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/17
 * 文件列表
 */
@Setter
@Getter
public class FileListRequest {

    @NotNull(fileName = "是否分页")
    private String is_page;//是否分页（0：否，1：是）
    private String rela_id;
    private String module;
    private String file_path;
    private String file_id;
    private String is_delete;
    private String start_time;
    private String end_time;
    private String create_id;
    private String page;
    private String page_size;

}
