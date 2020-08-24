package com.dingmao.platformsdk.basicservices;

import com.dingmao.platformsdk.verifynull.NotNull;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/17
 * 发送短信
 */
@Getter
@Setter
public class SendMsgRequest {
    @NotNull(fileName = "模版编号")
    private String template_no;
    @NotNull(fileName = "手机号")
    private String phone;
    private String rela_id;
    private String usage;
    private List<SendMsgKeys> keys;


    @Getter
    @Setter
    public static class SendMsgKeys{
        private String name;
        private String value;

    }
}
