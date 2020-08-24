package com.dingmao.platformsdk.coderulemanagement;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/17
 * 规则分类-规则段-添加
 */
@Setter
@Getter
public class RuleAddReq {
    private String rule_name;//规则名称
    private String sources_data;//数据来源 标准码 dataSources（例常量,内置对象,vo对象,流水段）
    private String para_value;//参数值
    private String start_num;//开始位
    private String end_num;//截至位
    private String rule_code_resolve_id;//编码分类id
    private String fill_style;//填充方式 标准码 fillStyle（例前置,后置）
    private String fill_style_value;//填充值

}
