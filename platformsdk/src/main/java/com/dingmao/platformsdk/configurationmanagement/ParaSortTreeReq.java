package com.dingmao.platformsdk.configurationmanagement;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class ParaSortTreeReq {
    private String sort_name;//支持模糊
    private String p_para_type;//上级分类
    private String para_type;//参数分类
}
