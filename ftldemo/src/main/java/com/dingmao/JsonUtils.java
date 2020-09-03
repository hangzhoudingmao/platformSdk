package com.dingmao;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Create by atu on 2020/9/2
 * 把 json（api.json文件里面的json数据）解析成需要类
 */
public class JsonUtils {

    public static <T> ArrayList<T> json2List(String json,Class<T> clz){
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<JsonObject>>() {
        }.getType();
        ArrayList<JsonObject> jsonObjects = gson.fromJson(json,type);
        ArrayList<T> data = new ArrayList<T>();
        for (JsonObject jsonObject: jsonObjects){
            data.add(gson.fromJson(jsonObject,clz));
        }
        return data;
    }
}
