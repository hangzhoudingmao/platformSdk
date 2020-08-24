package com.dingmao.platformsdk.systemresources;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/18
 */
@Getter
@Setter
public class SourceDataReq {
    private String source_no;//资源编号，多个","分开。若不传递，返回整个系统内资源编码
    private String page;//
    private String is_page;//是否分页1=》分页，0=》不分
    private String page_size;//
}
