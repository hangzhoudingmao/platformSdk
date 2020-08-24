package com.dingmao.platformsdkdemo;

import android.os.Environment;
import android.util.Log;

import com.dingmao.platformsdk.systemmanagement.SysDelVerReq;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testNull(){
        SysDelVerReq req = new SysDelVerReq();
        System.out.println(req.getSys_ver_id().length());
    }

    @Test
    public void testInterface(){
        Log.e("path===",Environment.getExternalStorageDirectory().getPath());

        try {
            File file = new File(Environment.getExternalStorageDirectory() + "1.jpeg");
        } catch (Exception e) {
            Log.e("===exception",e.getMessage());
        }
        /*PlatformClient.doUploadFile(null,file,"pic_file_apk", new PlatformCallback<UploadFileResponse>() {
            @Override
            public void onSuccess(UploadFileResponse uploadFileResponse) {

            }

            @Override
            public void onFailed(String msg) {

            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });*/
    }
}