package com.dingmao.platformsdk.configurationmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class ParaListReq {
    @NotNull(fileName = "参数编码")
    private String para_code;//参数编码
    private String para_id;//参数ID
    private String para_name;//参数名称，支持模糊
    @NotNull(fileName = "参数分类")
    private String para_type;//参数分类
    private String org_no;//参数分类标识id
    @NotNull(fileName = "是否分页")
    private String is_page;//
    private String page;//
    private String page_size;//
}
