package com.dingmao.platformsdkdemo;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

/**
 * Create by atu on 2020/8/25
 */
public class TempUtils {

    private Context mContext;
    public TempUtils() {

    }

    public void create(String path) throws Exception {
        Map<String, Object> beanMap = new HashMap<String, Object>();
        beanMap.put("beanName", "User");// 实体类名
        beanMap.put("interfaceName", "User");// 接口名
        List<Map<String, String>> paramsList = new ArrayList<Map<String, String>>();
        for (int i = 0; i < fieldName.size(); i++) {
            Map<String, String> tmpParamMap = new HashMap<String, String>();
            tmpParamMap.put("fieldNote",  fieldNote.get(i));
            tmpParamMap.put("fieldType", "String");
            tmpParamMap.put("fieldName", fieldName.get(i));
            paramsList.add(tmpParamMap);
        }
        beanMap.put("params", paramsList);

        Configuration config = new Configuration();
        config.setObjectWrapper(new DefaultObjectWrapper());
        config.setDirectoryForTemplateLoading(new File(path));
        Template template = config.getTemplate("main.ftl");
        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/main/resources/User.java"), "UTF-8"));
        template.process(beanMap, out);
        out.flush();
        out.close();
    }

    private String json = "{\"type\":\"object\",\"title\":\"empty object\",\"properties\":{\"rela_id\":{\"type\":\"string\",\"description\":\"业务关联id\"},\"module\":{\"type\":\"string\",\"description\":\"模块\"},\"file_path\":{\"type\":\"string\",\"description\":\"文件路径\"},\"file_id\":{\"type\":\"string\",\"description\":\"文件Id\"},\"is_delete\":{\"type\":\"string\",\"description\":\"是否被删除，使用标准码yn\"},\"start_time\":{\"type\":\"string\"},\"end_time\":{\"type\":\"string\"},\"create_id\":{\"type\":\"string\",\"description\":\"上传人Id\"},\"is_page\":{\"type\":\"string\",\"description\":\"是否分页（0：否，1：是）\"},\"page\":{\"type\":\"string\",\"description\":\"页码\"},\"page_size\":{\"type\":\"string\",\"description\":\"每页数量\"}},\"required\":[\"is_page\"]}";

    private List<String> fieldName = new ArrayList<>();
    private List<String> fieldNote = new ArrayList<>();
    public void parseJson(){
        Gson gson = new Gson();
        Map map = new Gson().fromJson(json, Map.class);
        for (Object m : map.entrySet()) {
            if ("properties".equals(((Map.Entry) m).getKey().toString())) {
                String json1 = gson.toJson(((Map.Entry) m).getValue());
                Map map1 = gson.fromJson(json1, Map.class);
                for (Object m1 : map1.entrySet()) {
                    fieldName.add(((Map.Entry) m1).getKey().toString());
                    String json2 = gson.toJson(((Map.Entry) m1).getValue());
                    Map map2 = gson.fromJson(json2, Map.class);
                    Set set2 = map2.keySet();
                    Iterator<Map.Entry<String,String>> iterator = map2.entrySet().iterator();
                    if (set2.contains("description")){
                        while (iterator.hasNext()){
                            Map.Entry<String, String> entry =  iterator.next();
                            if (entry.getKey().equals("description")){
                                fieldNote.add(entry.getValue());
                            }
                        }
                    }
                    else {
                        fieldNote.add("未知");
                    }
                }
            }
        }
        System.out.println(" fieldName= " + fieldName.size());
    }
}
