package com.dingmao.platformsdk.configurationmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Setter
@Getter
public class CategTreeReq {
    @NotNull(fileName = "用途分类")
    private String useage;//用途分类，不可重复，使用使用的分类实体，比如b_page_templete，使用的时候客户端传入确定
}
