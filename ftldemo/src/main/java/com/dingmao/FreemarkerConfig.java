package com.dingmao;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;

import java.io.File;
import java.io.IOException;

/**
 * Create by atu on 2020/9/2
 * @desc Configuration 全局只要一次实例就行
 */
public class FreemarkerConfig {
    private static final String TEMP_PATH = "src/main/resources";
    public static Configuration configuration;

    public FreemarkerConfig(){
        configuration = new Configuration(Configuration.VERSION_2_3_30);
        try {
            configuration.setDirectoryForTemplateLoading(new File(TEMP_PATH));
            configuration.setObjectWrapper(new DefaultObjectWrapper());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static FreemarkerConfig Init(){
        return FreemarkerConfig.Inner.INSTANCE;
    }
    private static class Inner{
        private static final FreemarkerConfig INSTANCE = new FreemarkerConfig();
    }
}
