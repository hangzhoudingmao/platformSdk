package com.dingmao.platformsdk.coderulemanagement;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/17
 * 编码规则分解-树
 */
@Setter
@Getter
public class CodeRuleResolveReq {
    /**
     * 查询用途类型
     * : 1=》编码分类
     * : 2=》流水段分类
     *
     */
    private String type;

    /**
     * 单位id
     */
    private String company_id;

}
