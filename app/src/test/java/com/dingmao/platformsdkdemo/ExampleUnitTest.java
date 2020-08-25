package com.dingmao.platformsdkdemo;

import android.content.Context;
import android.content.res.AssetManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    Context mContext;
    AssetManager mAssetManager;

    @Test
    public void testTemp(){
        mContext = RuntimeEnvironment.systemContext;
        mAssetManager = mContext.getResources().getAssets();
        try {
            InputStream is = mAssetManager.open("temp.ftl");
            byte[] buffer = new byte[is.available()];
            is.read(buffer);
            String json = new String(buffer, StandardCharsets.UTF_8);
            System.out.println("json = " + json);
        } catch (IOException e) {
            System.out.println("e = " + e.getMessage());
            e.printStackTrace();
        }
        /*TempUtils tempUtils = new TempUtils();
        tempUtils.parseJson();
        try {
            tempUtils.create();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}