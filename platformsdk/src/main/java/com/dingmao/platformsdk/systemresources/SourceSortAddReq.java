package com.dingmao.platformsdk.systemresources;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/18
 * 系统资源--分类添加
 */
@Setter
@Getter
public class SourceSortAddReq {
    private String p_id;//上级分类id（上一级主键id）若无传0
    private String source_sort_name;//名称
    private String source_sort_no;//系统资源分类编号

}
