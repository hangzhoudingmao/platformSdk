package com.dingmao.platformsdk.screendata;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/24
 */
@Setter
@Getter
public class ScreenWriteDataReq {
    private String index_no;//统计编码
    private String project_id;//项目ID
    private String company_id;//单位ID,未传入默认取登录人单位ID,若登录信息为空，则不包含本条件
    private String org_no;//分公司编号
    private String is_mock;//是否模拟数据，1模拟数据，0 真实数据，若不传入，默认模拟数据
    private List<Indexs> indexs;//对应的指标项信息

    @Getter
    @Setter
    public static class Indexs{
        private String dim1;//x1
        private String dim2;//x2
        private String dim3;//x3
        private String dim4;//x4
        private String dim5;//x5
        private String index1;//y1
        private String index2;//y2
        private String index3;//y3
        private String index4;//y4
        private String index5;//
        private String index6;//
        private String org_no;//管理单位，直接区分数据单位，特殊的dim

    }
}
