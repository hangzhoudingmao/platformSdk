package com.dingmao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executors;

/**
 * Create by atu on 2020/9/2
 */
public class Main {
    private static final String CLASS_PATH = "src/main/java/com/freemarker";

    public static void main(String[] args) {
        FreemarkerConfig.Init();
        FreemarkerTools tools = new FreemarkerTools();
        /*try {
            tools.parseRspJson("",new File("Response"),"com.dingmao","Test");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (TemplateException templateException) {
            templateException.printStackTrace();
        }*/
        try {
            ArrayList<ApiJsonBean> apiJsonBeans = JsonUtils.json2List(tools.readJsonFile(), ApiJsonBean.class);
            if (!apiJsonBeans.isEmpty()
                    && !apiJsonBeans.get(0).getList().isEmpty()) {
                for (ListJsonBean bean : apiJsonBeans.get(0).getList()) {
                    switch (bean.getMethod()) {
                        case "POST":
                            operateReq(bean, tools);
                            operateRsp(bean, tools);
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void operateRsp(ListJsonBean bean, FreemarkerTools tools) throws Exception {
        if (bean.getRes_body_type().equals("json")) {
            String json = bean.getRes_body();
            if (StringUtils.isEmpty(json)) return;
//            System.out.println("response json ==" + bean.getRes_body());
            tools.parseRspJson(json, new File("Response"), StringUtils.createPackageName(bean.getPath()), StringUtils.createReq(bean.getPath(), false));
        }
    }

    private static void operateReq(ListJsonBean bean, FreemarkerTools tools) throws Exception {
        if (bean.getReq_body_type().equals("json")) {
            String json = bean.getReq_body_other();
            if (StringUtils.isEmpty(json)) return;
//            System.out.println("request json ==" + json);
            tools.parseOneSubContainsKeyReq(json, new File("Request"), StringUtils.createPackageName(bean.getPath()), StringUtils.createReq(bean.getPath(), true));
        }
    }

    private void execute() {
        Executors.newFixedThreadPool(10).execute(new Runnable() {
            public void run() {

            }
        });
    }
}
