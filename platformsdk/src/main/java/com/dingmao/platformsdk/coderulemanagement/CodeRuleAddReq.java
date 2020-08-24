package com.dingmao.platformsdk.coderulemanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/17
 * 编码规则分解-添加
 */
@Getter
@Setter
public class CodeRuleAddReq {
    @NotNull(fileName = "名称")
    private String name;//名称
    @NotNull(fileName = "编码分类")
    private String resolve_type;//编码分类ruleCodeResolveType 标准码 (例1编码规则分类，2流水段分类)
    @NotNull(fileName = "上级编号")
    private String resolve_no;//上级编号，若无传0
    private String company_id;//单位id
    private String system_no;//系统编号

}
