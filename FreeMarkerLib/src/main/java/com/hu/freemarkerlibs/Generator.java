package com.hu.freemarkerlibs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateNotFoundException;

public class Generator {
    private static final String BEAN_KEY = "bean";
    private Template myJavaFileFtl;

    public Generator(String temp) throws IOException {
        Configuration config = getConfiguration(temp);
        myJavaFileFtl = config.getTemplate(temp);
    }

    public Generator() {}

    private Configuration getConfiguration(String template) throws IOException {
        Configuration config = new Configuration(Configuration.VERSION_2_3_23);
        config.setClassForTemplateLoading(getClass(), "/");
        //这里要设置取消使用Local语言环境
//        config.setLocalizedLookup(false);
        try {
            config.getTemplate(template);
        } catch (TemplateNotFoundException e) {
            File dir = new File("src/main/resources/");

            if (dir.exists() && new File(dir, template).exists()) {
                config.setDirectoryForTemplateLoading(dir);
                config.getTemplate(template);
            } else {
                throw e;
            }
        }
        return config;
    }

    public void create() throws Exception {
        Map<String, Object> beanMap = new HashMap<String, Object>();
        beanMap.put("beanName", "User");// 实体类名
        beanMap.put("interfaceName", "User");// 接口名
        List<Map<String, String>> paramsList = new ArrayList<Map<String, String>>();
        for (int i = 0; i < 4; i++) {
            Map<String, String> tmpParamMap = new HashMap<String, String>();
            tmpParamMap.put("fieldNote", "fieldNote" + i);
            tmpParamMap.put("fieldType", "String");
            tmpParamMap.put("fieldName", "fieldName" + i);
            paramsList.add(tmpParamMap);
        }
        beanMap.put("params", paramsList);

        Configuration config = new Configuration();
        config.setObjectWrapper(new DefaultObjectWrapper());
        Template template = config.getTemplate("src/main/resources/temp.ftl", "UTF-8");
        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/main/resources/User.java"), "UTF-8"));
        template.process(beanMap, out);
        out.flush();
        out.close();
    }

    public void generate(File outDirFile, String packageName, String clazzName, int id, String sex, String name) throws Exception {
        // 创建数据模型
        Map<String, Object> root = new HashMap<>();
        TestBean testBean = new TestBean();
        testBean.setPackageName(packageName);
        testBean.setClazzName(clazzName);
        testBean.setId(id);
        testBean.setSex(sex);
        testBean.setName(name);
        //这里的key的名称要与模板里的名称一致，否则无法进行映射
        root.put(BEAN_KEY, testBean);

        File file = toJavaFilename(outDirFile, testBean.getPackageName(), testBean.getClazzName());
        //noinspection ResultOfMethodCallIgnored
        file.getParentFile().mkdirs();

        Writer writer = new FileWriter(file);
        try {
            myJavaFileFtl.process(root, writer);
            writer.flush();
            System.out.println("Written " + file.getCanonicalPath());
        } finally {
            writer.close();
        }
    }

    private File toJavaFilename(File outDirFile, String javaPackage, String javaClassName) {
        String packageSubPath = javaPackage.replace('.', '/');
        File packagePath = new File(outDirFile, packageSubPath);
        return new File(packagePath, javaClassName + ".java");
    }
}
