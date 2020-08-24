package com.dingmao.platformsdk.basicservices;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/17
 * 获取短信发送记录
 */
@Getter
@Setter
public class SmsListRequest {
    private String template_no;
    @NotNull(fileName = "手机号")
    private String phone;
    private String rela_id;
    private String usage;
    private String content;
    private String start_time;
    private String end_time;
    private String sms_id;
    @NotNull(fileName = "是否分页")
    private String is_page;//是否分页（0：否，1：是）
    private String page;
    private String pag_size;

}
