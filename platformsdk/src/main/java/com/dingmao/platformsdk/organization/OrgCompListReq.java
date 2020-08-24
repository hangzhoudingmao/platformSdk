package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Setter
@Getter
public class OrgCompListReq {
    private String business_type;//业务范围（此下拉框的值来自于标准码表code_type=businessType）
    private String company_name;//单位名称,支持模糊匹配
    @NotNull(fileName = "是否分页")
    private String is_page;//是否分页（0：否，1：是），此处为1
    private String page;//页码，默认第一页
    private String page_size;//每页数量，默认10条
    private String company_ids;//单位id字符串，英文逗号拼接

}
