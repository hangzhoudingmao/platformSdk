package com.dingmao.platformsdk.coderulemanagement;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/17
 * 编码使用记录
 */
@Getter
@Setter
public class CodeRecordReq {
    private String rule_code_value;
    private String page;
    private String is_page;
    private String page_size;

}
