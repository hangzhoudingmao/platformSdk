package com.dingmao.platformsdkdemo;

import com.dingmao.platformsdk.systemmanagement.SysDelVerReq;

import org.junit.Test;

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
}