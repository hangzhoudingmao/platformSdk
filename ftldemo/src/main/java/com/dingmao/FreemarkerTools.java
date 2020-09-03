package com.dingmao;

import com.google.gson.Gson;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Create by atu on 2020/9/2
 * 主要处理json数据
 */
public class FreemarkerTools {

    private static final String TYPE_INT = "Int";
    private static final String TYPE_STRING = "String";
    private static final String TYPE_LIST = "List";
    private AtomicBoolean atomicBoolean = new AtomicBoolean(true);
    /**
     * 读取本地json文件
     *
     * @return
     * @throws IOException
     */
    public String readJsonFile() throws IOException {
        File file = new File("src/main/resources/api.json");
        FileReader fr = new FileReader(file);
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
        int s = 0;
        StringBuffer sb = new StringBuffer();
        while ((s = isr.read()) != -1) {
            sb.append((char) s);
        }
        fr.close();
        isr.close();
        return sb.toString();
    }

    /**********返回对象包含一个对象********************************************/
    //一个对象
    private String responseJson = "{\"$schema\":\"http://json-schema.org/draft-04/schema#\",\"type\":\"object\",\"properties\":{\"code\":{\"type\":\"number\"},\"msg\":{\"type\":\"string\"},\"action\":{\"type\":\"string\"},\"data\":{\"type\":\"object\",\"properties\":{\"file_id\":{\"type\":\"string\",\"description\":\"文件id\"},\"system_no\":{\"type\":\"string\",\"description\":\"系统编码\"},\"content_type\":{\"type\":\"string\",\"description\":\"文件类型\"},\"file_ext\":{\"type\":\"string\",\"description\":\"文件后缀\"},\"file_size\":{\"type\":\"number\",\"description\":\"文件大小\"},\"uploader\":{\"type\":\"string\",\"description\":\"上传人id\"},\"uploader_type\":{\"type\":\"string\",\"description\":\"上传人类型\"},\"upload_date\":{\"type\":\"string\",\"description\":\"上传日期\"},\"file_name\":{\"type\":\"string\",\"description\":\"文件名（相对路径）\"},\"store_type\":{\"type\":\"string\",\"description\":\"存储类型\"},\"file_path\":{\"type\":\"string\",\"description\":\"文件路径（绝对路径）\"},\"img_w\":{\"type\":\"string\",\"description\":\"文件（图片）宽\"},\"img_h\":{\"type\":\"string\",\"description\":\"文件（图片）高\"},\"module\":{\"type\":\"string\",\"description\":\"模块\"},\"is_delete\":{\"type\":\"string\",\"description\":\"是否删除\"},\"rela_id\":{\"type\":\"string\",\"description\":\"业务关联id\"},\"content_type_name\":{\"type\":\"string\",\"description\":\"文件类型名称\"},\"create_name\":{\"type\":\"string\",\"description\":\"上传人名称\"}},\"required\":[\"file_id\",\"system_no\",\"file_path\"]}}}";
    //对象包含list
    private String rspJson2 = "{\"$schema\":\"http://json-schema.org/draft-04/schema#\",\"type\":\"object\",\"properties\":{\"code\":{\"type\":\"number\",\"description\":\"响应码\"},\"msg\":{\"type\":\"string\",\"description\":\"响应消息\"},\"data\":{\"type\":\"object\",\"properties\":{\"total_count\":{\"type\":\"number\",\"description\":\"总数据量\"},\"total_page\":{\"type\":\"number\",\"description\":\"总页数\"},\"page_size\":{\"type\":\"number\",\"description\":\"每页数\"},\"cur_page\":{\"type\":\"number\",\"description\":\"当前页\"},\"list\":{\"type\":\"array\",\"items\":{\"type\":\"object\",\"properties\":{\"file_id\":{\"type\":\"string\",\"description\":\"文件Id\"},\"content_type\":{\"type\":\"string\",\"description\":\"文件类型\"},\"file_name\":{\"type\":\"string\",\"description\":\"文件名\"},\"file_size\":{\"type\":\"string\",\"description\":\"文件大小(K)\"},\"store_type\":{\"type\":\"string\",\"description\":\"存储方案\"},\"file_path\":{\"type\":\"string\",\"description\":\"文件路径，相对路径\"},\"absolute path\":{\"type\":\"string\",\"description\":\"文件路径，绝对路径\"},\"module\":{\"type\":\"string\",\"description\":\"所属模块\"},\"rela_id\":{\"type\":\"string\",\"description\":\"业务关联ID\"},\"create_date\":{\"type\":\"string\",\"description\":\"创建时间\"},\"create_id\":{\"type\":\"string\",\"description\":\"创建人Id\"},\"create_name\":{\"type\":\"string\",\"description\":\"创建人名称\"},\"is_delete\":{\"type\":\"string\",\"description\":\"是否被删除\"}},\"required\":[]}}},\"description\":\"数据集\"}},\"required\":[\"code\",\"msg\",\"data\"]}";
    //根就是一个集合
    private String rspJson3 = "{\"$schema\":\"http://json-schema.org/draft-04/schema#\",\"type\":\"object\",\"properties\":{\"code\":{\"type\":\"number\"},\"msg\":{\"type\":\"string\"},\"action\":{\"type\":\"string\"},\"data\":{\"type\":\"array\",\"items\":{\"type\":\"object\",\"properties\":{\"area_id\":{\"type\":\"string\"},\"province\":{\"type\":\"string\"},\"province_no\":{\"type\":\"string\"},\"city\":{\"type\":\"string\"},\"city_no\":{\"type\":\"string\"},\"area\":{\"type\":\"string\"},\"area_no\":{\"type\":\"string\"},\"street\":{\"type\":\"string\"},\"street_no\":{\"type\":\"string\"},\"cur_area_no\":{\"type\":\"string\"},\"cur_area_name\":{\"type\":\"string\"},\"cur_area_abbr\":{\"type\":\"string\"},\"p_area_no\":{\"type\":\"string\"},\"area_type\":{\"type\":\"string\"},\"not_area\":{\"type\":\"string\"},\"f_key\":{\"type\":\"string\"},\"f_py\":{\"type\":\"string\"},\"lng\":{\"type\":\"string\"},\"lat\":{\"type\":\"string\"},\"zipcode\":{\"type\":\"string\"},\"position\":{\"type\":\"string\"},\"area_order\":{\"type\":\"string\"},\"city_level\":{\"type\":\"string\"}},\"required\":[\"area_id\",\"province\",\"province_no\",\"city\",\"city_no\",\"area\",\"area_no\",\"street\",\"street_no\",\"cur_area_no\",\"cur_area_name\",\"cur_area_abbr\",\"p_area_no\",\"area_type\",\"not_area\",\"f_key\",\"f_py\",\"lng\",\"lat\",\"zipcode\",\"position\",\"area_order\",\"city_level\"]}}}}";

    //类中包含多层级
    private String rspJson4 = "{\"$schema\":\"http://json-schema.org/draft-04/schema#\",\"type\":\"object\",\"properties\":{\"code\":{\"type\":\"number\"},\"msg\":{\"type\":\"string\"},\"action\":{\"type\":\"string\"},\"data\":{\"type\":\"array\",\"items\":{\"type\":\"object\",\"properties\":{\"system_no\":{\"type\":\"string\",\"description\":\"系统编号\"},\"system_name\":{\"type\":\"string\",\"description\":\"系统名称\"},\"children\":{\"type\":\"array\",\"items\":{\"type\":\"object\",\"properties\":{\"source_sort_id\":{\"type\":\"string\",\"description\":\"系统资源分类标识\"},\"parent_id\":{\"type\":\"string\",\"description\":\"上级系统资源分类id\"},\"source_sort_name\":{\"type\":\"string\",\"description\":\"系统资源分类名称\"},\"source_sort_no\":{\"type\":\"string\",\"description\":\"系统资源分类编号\"},\"system_no\":{\"type\":\"string\",\"description\":\"系统编码\"},\"children\":{\"type\":\"array\",\"items\":{\"type\":\"object\",\"properties\":{},\"required\":[]},\"description\":\"子集同上\"}},\"required\":[]},\"description\":\"数据\"}},\"required\":[]}}}}";
    private String rspJson5 = "{\"$schema\":\"http://json-schema.org/draft-04/schema#\",\"type\":\"object\",\"properties\":{\"code\":{\"type\":\"number\"},\"msg\":{\"type\":\"string\"},\"action\":{\"type\":\"string\"},\"data\":{\"type\":\"object\",\"properties\":{}}}}";

    //顶级
    private List<String> rspPFieldName;
    private List<String> rspPFieldNote;
    private List<String> rspPType;

    //二级
    private List<String> rspCFieldName;
    private List<String> rspCFieldNote;
    private List<String> rspCType;

    //三级
    private List<String> rspTFieldName;
    private List<String> rspTFieldNote;
    private List<String> rspTType;

    /**
     * 把json 解析成需要的数据格式
     * @param json
     * @param outDirFile
     * @param packageName
     * @param className
     * @throws IOException
     * @throws TemplateException
     */
    public void parseRspJson(String json, File outDirFile, String packageName, String className) throws IOException, TemplateException {
        Gson gson = new Gson();
        Map map = gson.fromJson(json, Map.class);
        for (Object m : map.entrySet()) {
            switch (((Map.Entry) m).getKey().toString()) {
                case "properties":
                    Map map1 = parseJson(gson, ((Map.Entry) m).getValue());
                    for (Object o1 : map1.entrySet()){
                        switch (((Map.Entry) o1).getKey().toString()) {
                            case "data":
                                Map map2 = parseJson(gson, ((Map.Entry) o1).getValue());
                                for (Object o2 : map2.entrySet()) {
                                    switch (((Map.Entry) o2).getKey().toString()) {
                                        case "properties":
                                            operateRspPro(gson,o2,outDirFile,packageName,className);
                                            break;
                                        case "items":
                                            operateRspItems(gson,o2,outDirFile,packageName,className);
                                            break;
                                    }
                                }
                        }
                    }
                    break;
            }
        }
    }

    /**
     * 处理 根数组包含类  实际上就是处理一个单独的类
     * @param gson
     * @param o
     * @param outDirFile
     * @param packageName
     * @param className
     */
    private void operateRspItems(Gson gson, Object o, File outDirFile, String packageName, String className) throws IOException, TemplateException {
        Map map = parseJson(gson, ((Map.Entry) o).getValue());
        for (Object o1: map.entrySet()){
            switch (((Map.Entry)o1).getKey().toString()){
                case "properties":
                    operateRspPro(gson,o1,outDirFile,packageName,className);
                    break;
            }
        }
    }

    /**
     * 处理类
     * @param gson
     * @param o
     * @param outDirFile
     * @param packageName
     * @param className
     * @throws IOException
     * @throws TemplateException
     */
    private void operateRspPro(Gson gson, Object o, File outDirFile, String packageName, String className) throws IOException, TemplateException {
        rspPFieldName = new ArrayList<String>();
        rspPFieldNote = new ArrayList<String>();
        rspPType = new ArrayList<>();
        Map map = parseJson(gson, ((Map.Entry) o).getValue());
        if (map.entrySet().isEmpty()) return;
        for (Object o1 : map.entrySet()) {
            rspPFieldName.add(((Map.Entry) o1).getKey().toString());
            Map map1 = parseJson(gson, ((Map.Entry) o1).getValue());
            Iterator<Map.Entry<String, String>> iterator1 = map1.entrySet().iterator();
            while (iterator1.hasNext()) {
                Map.Entry<String, String> entry1 = iterator1.next();
                switch (entry1.getKey()) {
                    case "description":
                        rspPFieldNote.add(entry1.getValue());
                        break;
                    case "type":
                        switch (entry1.getValue()) {
                            case "string":
                                rspPType.add("String");
                                break;
                            case "array":
                                rspPType.add("List");
                                break;
                            case "number":
                                rspPType.add("Int");
                                break;
                        }
                        break;
                    case "items":
                        operateOneSubRsp(gson,entry1,outDirFile,packageName,className,"OneSub" + className);
                        break;
                    case "children":
                        //,"children":{"type":"array","items":{"type":"object","properties":{"source_sort_id":{"type":"string","description":"系统资源分类标识"}
                        break;

                }
            }
        }
        createContainListRsp(outDirFile, packageName, className,rspPFieldName, rspPFieldNote, rspPType,"OneSub" + className);
    }


    /**
     * 处理一级子类
     * @param gson
     * @param entry
     * @param outDirFile
     * @param packageName
     * @param className
     * @param childName
     * @throws IOException
     * @throws TemplateException
     */
    private void operateOneSubRsp(Gson gson, Map.Entry<String, String> entry, File outDirFile, String packageName, String className,String childName) throws IOException, TemplateException {
        Map itemMap = parseJson(gson, entry.getValue());
        for (Object itemO: itemMap.entrySet()){
            switch (((Map.Entry)itemO).getKey().toString()){
                case "properties":
                    rspCFieldName = new ArrayList<>();
                    rspCFieldNote = new ArrayList<>();
                    rspCType = new ArrayList<>();
                    Map proMap = parseJson(gson, ((Map.Entry) itemO).getValue());
                    for (Object o1: proMap.entrySet()){
                        rspCFieldName.add(((Map.Entry)o1).getKey().toString());
                        Map map2 = parseJson(gson, ((Map.Entry) o1).getValue());
                        Iterator<Map.Entry<String,String>> iterator2 = map2.entrySet().iterator();
                        while (iterator2.hasNext()){
                            Map.Entry<String,String> entry2 = iterator2.next();
                            switch (entry2.getKey()){
                                case "type":
                                    switch (entry2.getValue()) {
                                        case "string":
                                            rspCType.add("String");
                                            break;
                                        case "array":
                                            rspCType.add("List");
                                            break;
                                        case "number":
                                            rspCType.add("Int");
                                            break;
                                    }
                                    break;
                                case "description":
                                    rspCFieldNote.add(entry2.getValue());
                                    break;
                                case "items":
                                    operateTwoSubRsp(gson,entry2,outDirFile,packageName,className,"TwoSub");
                                    break;
                            }
                        }
                    }
//                    realOperateRsp(outDirFile,packageName,childName + className,rspCFieldName,rspCFieldNote,rspCType);
                    createContainListRsp(outDirFile,packageName,childName,rspCFieldName,rspCFieldNote,rspCType,"TwoSub" + className);
                    break;
            }
        }
    }

    /**
     * 处理二级子类
     * @param gson
     * @param entry
     * @param outDirFile
     * @param packageName
     * @param className
     * @param childName
     * @throws IOException
     * @throws TemplateException
     */
    private void operateTwoSubRsp(Gson gson, Map.Entry<String, String> entry, File outDirFile, String packageName, String className, String childName) throws IOException, TemplateException {
        Map itemMap = parseJson(gson, entry.getValue());
        for (Object itemO: itemMap.entrySet()){
            switch (((Map.Entry)itemO).getKey().toString()){
                case "properties":
                    rspTFieldName = new ArrayList<>();
                    rspTFieldNote = new ArrayList<>();
                    rspTType = new ArrayList<>();
                    Map proMap = parseJson(gson, ((Map.Entry) itemO).getValue());
                    for (Object o1: proMap.entrySet()){
                        rspTFieldName.add(((Map.Entry)o1).getKey().toString());
                        Map map2 = parseJson(gson, ((Map.Entry) o1).getValue());
                        Iterator<Map.Entry<String,String>> iterator2 = map2.entrySet().iterator();
                        while (iterator2.hasNext()){
                            Map.Entry<String,String> entry2 = iterator2.next();
                            switch (entry2.getKey()){
                                case "type":
                                    switch (entry2.getValue()) {
                                        case "string":
                                            rspTType.add("String");
                                            break;
                                        case "array":
                                            rspTType.add("List");
                                            break;
                                        case "number":
                                            rspTType.add("Int");
                                            break;
                                    }
                                    break;
                                case "description":
                                    rspTFieldNote.add(entry2.getValue());
                                    break;
                            }
                        }
                    }
                    realOperateRsp(outDirFile,packageName,childName + className,rspTFieldName,rspTFieldNote,rspTType);
                    break;
            }
        }
    }

    /**
     * 创建的子类  只有不包含对象  不包含list  只有属性
     * @param outDirFile
     * @param packageName
     * @param className
     */
    private void realOperateRsp(File outDirFile, String packageName, String className, List<String> fields, List<String> notes, List<String> types) throws IOException, TemplateException {
        Map<String, Object> beanMap = new HashMap<String, Object>();
        beanMap.put("className", className);// 实体类名
        beanMap.put("packageName", packageName);//包名
        List<Map<String, String>> paramsList = new ArrayList<Map<String, String>>();
        for (int i = 0; i < fields.size(); i++) {
            Map<String, String> tmpParamMap = new HashMap<String, String>();
            try {
                switch (types.get(i)){
                    case TYPE_LIST:
                        tmpParamMap.put("fieldType", "List<" + className + ">");
                        break;
                    default:
                        tmpParamMap.put("fieldType", types.get(i));
                        break;
                }
            } catch (Exception e) {
                continue;
            }
            try {
                tmpParamMap.put("fieldNote", notes.get(i));
            } catch (Exception e) {
                tmpParamMap.put("fieldNote", "");
            }
            tmpParamMap.put("fieldName", fields.get(i));
            paramsList.add(tmpParamMap);
        }
        beanMap.put("params", paramsList);
        outClazz(outDirFile, packageName, className, beanMap);
    }

    /**
     * 创建包含list的类
     * @param outDirFile
     * @param packageName
     * @param className
     * @param fields
     * @param notes
     * @param types
     * @throws IOException
     * @throws TemplateException
     */
    public void createContainListRsp(File outDirFile, String packageName, String className, List<String> fields, List<String> notes, List<String> types,String childName) throws IOException, TemplateException {
        Map<String, Object> beanMap = new HashMap<String, Object>();
        beanMap.put("className", className);// 实体类名
        beanMap.put("packageName", packageName);//包名
        List<Map<String, String>> paramsList = new ArrayList<Map<String, String>>();
        for (int i = 0; i < fields.size(); i++) {
            Map<String, String> tmpParamMap = new HashMap<String, String>();
            try {
                switch (types.get(i)){
                    case TYPE_LIST:
                        tmpParamMap.put("fieldType", "List<" + childName + ">");
                        break;
                    default:
                        tmpParamMap.put("fieldType", types.get(i));
                        break;
                }
            } catch (Exception e) {
                continue;
            }
            try {
                tmpParamMap.put("fieldNote", notes.get(i));
            } catch (Exception e) {
                tmpParamMap.put("fieldNote", "");
            }
            tmpParamMap.put("fieldName", fields.get(i));
            paramsList.add(tmpParamMap);
        }
        beanMap.put("params", paramsList);
        outClazz(outDirFile, packageName, className, beanMap);
    }


    /***********请求类*******************************************************************/

    /***请求类包含一个集合  List<A> A对象里面有一个数组对象 *****************************************************************/

    //一个对象 A{}
    private String json1 = "{\"$schema\":\"http://json-schema.org/draft-04/schema#\",\"type\":\"object\",\"title\":\"empty object\",\"properties\":{\"rela_id\":{\"type\":\"string\",\"description\":\"业务关联id\"},\"module\":{\"type\":\"string\",\"description\":\"模块\"},\"file_path\":{\"type\":\"string\",\"description\":\"文件路径\"},\"file_id\":{\"type\":\"string\",\"description\":\"文件Id\"},\"is_delete\":{\"type\":\"string\",\"description\":\"是否被删除，使用标准码yn\"},\"start_time\":{\"type\":\"string\"},\"end_time\":{\"type\":\"string\"},\"create_id\":{\"type\":\"string\",\"description\":\"上传人Id\"},\"is_page\":{\"type\":\"string\",\"description\":\"是否分页（0：否，1：是）\"},\"page\":{\"type\":\"string\",\"description\":\"页码\"},\"page_size\":{\"type\":\"string\",\"description\":\"每页数量\"}},\"required\":[\"is_page\"]}";
    //数组对象 包含对象 List<A> A{ B b }
    private String json2 = "{\"type\":\"array\",\"items\":{\"type\":\"object\",\"properties\":{\"log_type\":{\"type\":\"string\",\"description\":\"日志分类，使用标准码logType\"},\"message\":{\"type\":\"string\",\"description\":\"日志消息\"},\"content\":{\"type\":\"string\",\"description\":\"日志内容\"},\"create_date\":{\"type\":\"string\",\"description\":\"日志时间\"},\"parameters\":{\"type\":\"object\",\"properties\":{},\"description\":\"JSON格式参数，根据实际情况传递来约定\"}},\"required\":[\"log_type\",\"message\",\"content\",\"create_date\"]}}";
    //对象里面包含数组对象 A{ List<B> }
    private String json3 = "{\"properties\":{\"template_no\":{\"type\":\"string\",\"description\":\"模板编号\"},\"phone\":{\"type\":\"string\",\"description\":\"手机号\"},\"rela_id\":{\"type\":\"string\",\"description\":\"业务关联Id\"},\"usage\":{\"type\":\"string\",\"description\":\"用途\"},\"keys\":{\"type\":\"array\",\"items\":{\"type\":\"object\",\"properties\":{\"name\":{\"type\":\"string\"},\"value\":{\"type\":\"string\"}},\"required\":[]},\"description\":\"模板替换关键字\"}},\"required\":[\"phone\",\"template_no\",\"keys\"]}";
    //对象里面
    private String json4 = "{\"$schema\":\"http://json-schema.org/draft-04/schema#\",\"type\":\"object\",\"properties\":{\"data\":{\"type\":\"array\",\"items\":{\"type\":\"object\",\"properties\":{\"mac\":{\"type\":\"string\",\"description\":\"mac地址\"},\"equip_no\":{\"type\":\"string\",\"description\":\"设备编号\"},\"equip_type\":{\"type\":\"string\",\"description\":\"设备类型\"},\"equip_name\":{\"type\":\"string\",\"description\":\"设备名称\"}},\"required\":[\"mac\"]}}},\"required\":[\"data\"]}";

    //对象里面包含多个数组对象
    private String json5 = "{\"type\":\"object\",\"title\":\"empty object\",\"properties\":{\"index_no\":{\"type\":\"string\",\"description\":\"指标编号\"},\"conditions\":{\"type\":\"array\",\"items\":{\"type\":\"object\",\"properties\":{\"cond_field\":{\"type\":\"string\",\"description\":\"条件字段名，一般都是dim1到dim5\"},\"cond_operation\":{\"type\":\"string\",\"description\":\"运算类型，分为=，>，<,like 等\"},\"cond_value\":{\"type\":\"string\",\"description\":\"条件值\"}},\"required\":[\"cond_field\",\"cond_operation\",\"cond_value\"]},\"description\":\"查询条件集合,取dim1-5\"},\"orders\":{\"type\":\"string\",\"description\":\"排序字段，遵从sql语法,举例 index1 desc\"},\"indexs\":{\"type\":\"array\",\"items\":{\"type\":\"object\",\"properties\":{\"index_field\":{\"type\":\"string\",\"description\":\"指标字段名，一般是index1到5,下边两个参数为空可以传其他 dim[1-5]必传一个\"},\"index_operation\":{\"type\":\"string\",\"description\":\"运算类型，有count(?),sum(?),avg(?),max(?).min(?)等，遵从sql语法\"},\"ais\":{\"type\":\"string\",\"description\":\"别名，返回得时候映射 legend\"}},\"required\":[\"index_field\"]},\"description\":\"指标集合，对应返回结果的y\"},\"dims\":{\"type\":\"object\",\"properties\":{\"dim_field\":{\"type\":\"string\",\"description\":\"字段名\"},\" dim_operation\":{\"type\":\"string\",\"description\":\"操作函数u，比如date_format(?,'%Y-%m-%d'）\"}},\"description\":\"对应x轴\",\"required\":[\"dim_field\"]},\"is_page\":{\"type\":\"number\",\"description\":\"是否分页，默认不分页\"},\"page\":{\"type\":\"number\",\"description\":\"当前页码\"},\"page_size\":{\"type\":\"number\",\"description\":\"每页条数\"},\"project_id\":{\"type\":\"string\",\"description\":\"项目ID\"},\"company_id\":{\"type\":\"string\",\"description\":\"单位ID,\"},\"org_no\":{\"type\":\"string\",\"description\":\"分公司编号\"},\"is_mock\":{\"type\":\"string\",\"description\":\"是否模拟数据，1模拟数据，0 真实数据，若不传入，默认模拟数据\"}},\"required\":[\"index_no\",\"is_page\",\"page\",\"page_size\",\"indexs\",\"dims\"]}";

    private List<String> reqParentFieldName;
    private List<String> reqParentFieldNote;
    private List<String> reqParentType;
    private List<String> reqChildType;
    private List<String> reqChildFieldName;
    private List<String> reqChildFieldNote;

    public void parseOneSubContainsKeyReq(String json, File outDirFile, String packageName, String className) throws IOException, TemplateException {
        Gson gson = new Gson();
        Map map = gson.fromJson(json, Map.class);
        for (Object m : map.entrySet()) {
            switch (((Map.Entry) m).getKey().toString()) {
                case "properties":
                    operateReqPro(gson, m, outDirFile, packageName, className);
                    break;
                case "items":
                    operateReqItems(gson, m, outDirFile, packageName, className);
                    break;
            }
        }
    }

    /**
     * 处理 集合数据
     *
     * @param gson
     * @param m
     * @param outDirFile
     * @param packageName
     * @param className
     * @throws IOException
     * @throws TemplateException
     */
    private void operateReqItems(Gson gson, Object m, File outDirFile, String packageName, String className) throws IOException, TemplateException {
        Map map1 = parseJson(gson, ((Map.Entry) m).getValue());
        Iterator<Map.Entry<String, Object>> iterator1 = map1.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Object> entry1 = iterator1.next();
            switch (entry1.getKey()) {
                case "properties":
                    operateReqPro(gson, entry1, outDirFile, packageName, className);
                    break;
            }
        }
    }

    /**
     * 处理 properties作为key的值  一般是我们需要的  如果有改动 可以再做处理
     *
     * @param gson
     * @param m
     * @param outDirFile
     * @param packageName
     * @param className
     * @throws IOException
     * @throws TemplateException
     */
    private void operateReqPro(Gson gson, Object m, File outDirFile, String packageName, String className) throws IOException, TemplateException {
        reqParentFieldName = new ArrayList<>();
        reqParentFieldNote = new ArrayList<>();
        reqParentType = new ArrayList<>();
        String childName = "Sub";
        Map map1 = parseJson(gson, ((Map.Entry) m).getValue());
        for (Object m1 : map1.entrySet()) {
            childName = StringUtils.line2Hump(((Map.Entry) m1).getKey().toString());
            reqParentFieldName.add(((Map.Entry) m1).getKey().toString());
            Map map2 = parseJson(gson, ((Map.Entry) m1).getValue());
            Iterator<Map.Entry<String, Object>> iterator = map2.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Object> entry = iterator.next();
                switch (entry.getKey()) {
                    case "description":
                        reqParentFieldNote.add((String) entry.getValue());
                        break;
                    case "type":
                        if ("string".equals(entry.getValue())) {
                            reqParentType.add("String");
                        } else if ("array".equals(entry.getValue())) {
                            reqParentType.add("List");
                        } else if ("object".equals(entry.getValue())) {
                            reqParentType.add("object");
                        } else if ("number".equals(entry.getValue())) {
                            reqParentType.add("Int");
                        }
                        break;
                    case "items":
                        reqChildType = new ArrayList<>();
                        reqChildFieldName = new ArrayList<>();
                        reqChildFieldNote = new ArrayList<>();
                        Map map3 = parseJson(gson, entry.getValue());
                        for (Object o3 : map3.entrySet()) {
                            if ("properties".equals(((Map.Entry) o3).getKey().toString())) {
                                Map map4 = parseJson(gson, ((Map.Entry) o3).getValue());
                                for (Object o4 : map4.entrySet()) {
                                    reqChildFieldName.add(((Map.Entry) o4).getKey().toString());
                                    Map map5 = parseJson(gson, ((Map.Entry) o4).getValue());
                                    Iterator<Map.Entry<String, Object>> iterator5 = map5.entrySet().iterator();
                                    while (iterator5.hasNext()) {
                                        Map.Entry<String, Object> entry5 = iterator5.next();
                                        switch (entry5.getKey()) {
                                            case "description":
                                                reqChildFieldNote.add((String) entry5.getValue());
                                                break;
                                            case "type":
                                                if ("string".equals(entry5.getValue())) {
                                                    reqChildType.add("String");
                                                }
                                                break;
                                            default:
                                                reqChildFieldNote.add("");
                                                reqChildType.add("String");
                                                break;
                                        }
                                    }
                                }

                            }
                        }
                        outClazzOneSub(outDirFile, packageName, childName + className, reqChildFieldName, reqChildFieldNote, reqChildType);
                        break;
                    case "properties":
                        reqChildType = new ArrayList<>();
                        reqChildFieldName = new ArrayList<>();
                        reqChildFieldNote = new ArrayList<>();
                        Map proMap1 = parseJson(gson, entry.getValue());
                        for (Object proO1 : proMap1.entrySet()) {
                            reqChildFieldName.add(((Map.Entry) proO1).getKey().toString());
                            Map proMap2 = parseJson(gson, ((Map.Entry) proO1).getValue());
                            Iterator<Map.Entry<String, Object>> proTterator = proMap2.entrySet().iterator();
                            while (proTterator.hasNext()) {
                                Map.Entry<String, Object> proEntry = proTterator.next();
                                switch (proEntry.getKey()) {
                                    case "description":
                                        reqChildFieldNote.add((String) proEntry.getValue());
                                        break;
                                    case "type":
                                        if ("string".equals(proEntry.getValue())) {
                                            reqChildType.add("String");
                                        }
                                        break;
                                    default:
                                        reqChildFieldNote.add("");
                                        reqChildType.add("String");
                                        break;
                                }
                            }
                        }
                        outClazzOneSub(outDirFile, packageName, childName + className, reqChildFieldName, reqChildFieldNote, reqChildType);
                        break;
                    default:
                        break;
                }

            }
        }
        outClazzContainList(outDirFile, packageName, className, reqParentFieldName, reqParentFieldNote, reqParentType);

    }

    /**
     * 输出包含 数组对象/对象 的类
     *
     * @param outDirFile
     * @param packageName
     * @param className
     * @param fields
     * @param notes
     * @param types
     * @throws IOException
     * @throws TemplateException
     */
    private void outClazzContainList(File outDirFile, String packageName, String className, List<String> fields, List<String> notes, List<String> types) throws IOException, TemplateException {
        Map<String, Object> beanMap = new HashMap<String, Object>();
        beanMap.put("className", className);// 实体类名
        beanMap.put("packageName", packageName);//包名
        List<Map<String, Object>> paramsList = new ArrayList<>();
        for (int i = 0; i < fields.size(); i++) {
            Map<String, Object> tmpParamMap = new HashMap<String, Object>();
            try {
                if (types.get(i).equals("List")) {
                    tmpParamMap.put("fieldType", "List<" + StringUtils.line2Hump(fields.get(i)) + className + ">");
                } else if (types.get(i).equals("object")) {
                    tmpParamMap.put("fieldType", StringUtils.line2Hump(fields.get(i)) + className);
                } else {
                    tmpParamMap.put("fieldType", types.get(i));
                }
            } catch (Exception e) {
                continue;
            }
            try {
                tmpParamMap.put("fieldNote", notes.get(i));
            } catch (Exception e) {
                tmpParamMap.put("fieldNote", "");
            }
            tmpParamMap.put("fieldName", fields.get(i));
            paramsList.add(tmpParamMap);
        }
        beanMap.put("params", paramsList);
        outClazz(outDirFile, packageName, className, beanMap);
    }

    /**
     * 创建请求子类
     *
     * @param outDirFile
     * @param packageName
     * @param className
     * @param fields
     * @param notes
     * @param types
     * @throws IOException
     * @throws TemplateException
     */
    private void outClazzOneSub(File outDirFile, String packageName, String className, List<String> fields, List<String> notes, List<String> types) throws IOException, TemplateException {
        Map<String, Object> beanMap = new HashMap<String, Object>();
        beanMap.put("className", className);// 实体类名
        beanMap.put("packageName", packageName);//包名
        List<Map<String, Object>> fieldList = new ArrayList<>();
        for (int i = 0; i < fields.size(); i++) {
            Map<String, Object> fieldMap = new HashMap<String, Object>();
            try {
                fieldMap.put("fieldType", types.get(i));
            } catch (Exception e) {
                continue;
            }
            try {
                fieldMap.put("fieldNote", notes.get(i));
            } catch (Exception e) {
                fieldMap.put("fieldNote", "");
            }
            fieldMap.put("fieldName", fields.get(i));
            fieldList.add(fieldMap);
        }
        beanMap.put("params", fieldList);
        outClazz(outDirFile, packageName, className, beanMap);
    }

    /**
     * 真正输出需要的类
     *
     * @param outDirFile
     * @param packageName
     * @param className
     * @param map
     * @throws IOException
     * @throws TemplateException
     */
    public synchronized void outClazz(final File outDirFile, final String packageName, final String className, final Map map) throws IOException, TemplateException {
        if (atomicBoolean.compareAndSet(true,false)){
            System.out.println(className + "进来了");
            Template template = FreemarkerConfig.configuration.getTemplate("temp.ftl");
            File file = toJavaFile(outDirFile, packageName, className);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            FileWriter fileWriter = new FileWriter(file);
            template.process(map, fileWriter);
            fileWriter.flush();
            fileWriter.close();
            atomicBoolean.compareAndSet(false,true);
            System.out.println(className + "出去了");
        }
    }

    /**
     * 创建 指定路径  指定文件名  的文件
     *
     * @param outDirFile  文件夹名称
     * @param packageName 文件路径
     * @param className   文件名
     * @return
     */
    public File toJavaFile(File outDirFile, String packageName, String className) {
        String packageSubPath = packageName.replace('.', '/');
        File packagePath = new File(outDirFile, packageSubPath);
        return new File(packagePath, className + ".java");
    }

    /**
     * 吧对象解析成map
     *
     * @param gson
     * @param value
     * @return
     */
    private Map parseJson(Gson gson, Object value) {
        String json = gson.toJson(value);
        Map map = gson.fromJson(json, Map.class);
        return map;
    }
}
