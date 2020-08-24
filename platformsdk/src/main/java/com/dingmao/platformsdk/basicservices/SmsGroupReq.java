package com.dingmao.platformsdk.basicservices;

import com.dingmao.platformsdk.verifynull.NotNull;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Create by atu on 2020/8/24
 * 短信群发
 */
@Setter
@Getter
@ToString
public class SmsGroupReq {
    @NotNull(fileName = "模版编号")
    private String template_no;//
    private String phone;//
    private String rela_id;//
    private String usage;//
    private List<SmsGroupKeyReq> keys;

    @Setter
    @Getter
    public static class SmsGroupKeyReq{
        private String key1;//参数1
        private String key2;//参数2
        private String key3;//参数3
    }
}
