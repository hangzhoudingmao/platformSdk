package com.dingmao.platformsdk.basicservices;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/17
 *
 * 删除文件
 */
@Setter
@Getter
public class FileDeleteRequest {
    @NotNull(fileName = "文件id")
    private String file_id;

}
