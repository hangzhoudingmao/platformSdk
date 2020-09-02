package com.dingmao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create by atu on 2020/9/2
 */
public class StringUtils {

    private static Pattern linePattern = Pattern.compile("_(\\w)");

    /**
     * 创建请求或者响应类名
     * @param str
     * @param isReq
     * @return
     */
    public static String createReq(String str,boolean isReq) throws Exception {
        return line2Hump(str) + (isReq? "Req" : "Rsp");
    }

    public static String line2Hump(String str) {
        str = str.toLowerCase();
        String[] split1 = null;
        if (str.contains("/")){
            split1 = str.split("/");
            str = split1[split1.length - 1];
        }

        if (str.contains("_")){
            if (str.equals("get_list")){
                str = split1[split1.length - 2] + str;
            }
            String[] split = str.split("_");
            StringBuilder sb = new StringBuilder();
            for (String s: split){
                sb.append(first2Up(s));
            }
            return sb.toString();
        }
        else {
            return first2Up(str);
        }
    }

    public static String first2Up(String str){
        return str.substring(0,1).toUpperCase().concat(str.substring(1).toLowerCase());
    }

    public static String line2Hump2(String content){
        content = content.toLowerCase();
        Matcher matcher = linePattern.matcher(content);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()){
            System.out.println("goup"+ matcher.group());
            matcher.appendReplacement(sb,matcher.group(1).toUpperCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    public static String createPackageName(String str){
        String packageName = "com.dingmao.request";
        if (str.contains("/")){
            String[] split = str.split("/");
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (int index = 0;index < split.length;index++){
                if (!isEmpty(split[index])){
                    sb.append(split[index]);
                    if (index == split.length - 1) break;
                    i++;
                    if (i == 3) break;
                    sb.append(".");
                }
            }
            if (!isEmpty(sb.toString())){
                packageName = sb.toString();
            }
        }
        return packageName;
    }

    public static boolean isEmpty(String str){
        return str == null || str.length() == 0 || str.equals("null");
    }
}
