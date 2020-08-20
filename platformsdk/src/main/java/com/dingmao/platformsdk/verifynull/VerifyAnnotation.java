package com.dingmao.platformsdk.verifynull;

import android.text.TextUtils;
import android.util.Log;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by atu on 2020/8/20
 */
public class VerifyAnnotation {

    public static <T> List<VerifyResult> verify(T t){
        List<VerifyResult> verifyResults = new ArrayList<>();
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field:fields){
            if (field.isAnnotationPresent(NotNull.class)){//是否使用MyAnno注解
                field.setAccessible(true);
                Log.e("=field===",field.toString());
                Object obj = null;
                try {
                    obj = field.get(t);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                Log.e("=obj===","=="+obj.toString());
                if (obj instanceof String){
                    if (TextUtils.isEmpty((String)obj)){
                        Log.e("=obj=null","=="+obj.toString());
                        NotNull annotation = field.getAnnotation(NotNull.class);
                        VerifyResult verifyResult = new VerifyResult();
                        verifyResult.setMsg(annotation.fileName() + "不能为空");
                        verifyResults.add(verifyResult);
                    }
                }
                else if (obj instanceof List){
                    if (((List)obj).isEmpty()){
                        NotNull annotation = field.getAnnotation(NotNull.class);
                        VerifyResult verifyResult = new VerifyResult();
                        verifyResult.setMsg(annotation.fileName() + "不能为空");
                        verifyResults.add(verifyResult);
                    }
                }
            }
        }
        Log.e("====verify",verifyResults.size() + "");
        return verifyResults;
    }

    public static String showNullTips(List<VerifyResult> list){
        Log.e("====showNullTips",list.size() + "");
        if (list == null || list.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for (VerifyResult result: list){
            sb.append(result.getMsg()).append(",");
        }
        return sb.toString();
    }
}
