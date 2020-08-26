package com.dingmao.platformsdk.internal.util;

import com.dingmao.platformsdk.verifynull.VerifyAnnotation;
import com.dingmao.platformsdk.verifynull.VerifyResult;
import com.google.gson.Gson;

import org.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Create by atu on 2020/8/12
 */
public class StringUtils {
    public static boolean isEmpty(String value) {
        int strLen;
        if ((value == null) || ((strLen = value.length()) == 0))
            return true;
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(value.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean areNotEmpty(String... values) {
        boolean result = true;
        if ((values == null) || (values.length == 0)) {
            result = false;
        } else {
            for (String value : values) {
                result &= !isEmpty(value);
            }
        }
        return result;
    }

    public static String is2str(InputStream input) throws IOException {
        StringBuffer out = new StringBuffer();
        byte[] b = new byte[4096];
        for (int n; (n = input.read(b)) != -1;) {
            out.append(new String(b, 0, n));
        }
        return out.toString();
    }

    public static String ObjNotNull(Object o){
        List<VerifyResult> verify = VerifyAnnotation.verify(o);
        String tips = VerifyAnnotation.showNullTips(verify);
        return tips;
    }

    public static String obj2Json(Object o){
        return new Gson().toJson(o);
    }

    public static String list2Json(List<Object> list){
        JSONArray jsonArray = new JSONArray(list);
        return jsonArray.toString();
    }

    public static String getFileName() {
//        int separatorIndex = path.lastIndexOf("/");
        String fileName = String.valueOf(System.currentTimeMillis());
//        path = (separatorIndex < 0) ? path : path.substring(separatorIndex + 1,
//                path.length());
        return fileName + ".xls";
    }
}
