package com.dingmao.platformsdk.registrationrelated;

import com.dingmao.platformsdk.verifynull.NotNull;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/24
 */
@Getter
@Setter
public class ScreenDataReq {
    @NotNull(fileName = "指标编号")
    private String index_no;//指标编号
    private String orders;//排序字段，遵从sql语法,举例 index1 desc
    private String is_page;//是否分页，默认不分页
    private String page;//当前页码
    private String page_size;//每页条数
    private String project_id;//项目ID
    private String company_id;//单位ID,
    private String org_no;//分公司编号,
    private String is_mock;//是否模拟数据，1模拟数据，0 真实数据，若不传入，默认模拟数据
    private List<Conditions> conditions;
    private List<Indexs> indexs;
    private List<Dims> dims;


    @Setter
    @Getter
    public static class Conditions{
        private String cond_field;//条件字段名，一般都是dim1到dim5
        private String cond_operation;//运算类型，分为=，>，<,like 等
        private String cond_value;//条件值
    }

    @Getter
    @Setter
    public static class Indexs{
        private String index_field;//指标字段名，一般是index1到5,下边两个参数为空可以传其他 dim[1-5]必传一个
        private String index_operation;//运算类型，有count(?),sum(?),avg(?),max(?).min(?)等，遵从sql语法
        private String ais;//别名，返回得时候映射 legend
    }

    @Setter
    @Getter
    public static class Dims{
        private String dim_field;//字段名
        private String dim_operation;//操作函数u，比如date_format(?,'%Y-%m-%d'）
    }
}
