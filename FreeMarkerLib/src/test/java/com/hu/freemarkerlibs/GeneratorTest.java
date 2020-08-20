package com.hu.freemarkerlibs;

import java.io.File;

public class GeneratorTest {

    @org.junit.Test
    public void generate() throws Exception {
//        Generator daoGenerator = new Generator("myJavaFile.ftl");
        Generator daoGenerator = new Generator();

//        daoGenerator.generate(new File("checkTest"), "com.example.abc","user",11233,"man","Jeck");
        daoGenerator.create();
    }
}