package com.dingmao.platformsdk.basicservices;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/17
 * 上传日志
 */
@Getter
@Setter
public class UploadLogRequest {
    @NotNull(fileName = "日志类型")
    private String log_type;
    private String message;
    private String content;
    private String create_date;

}
