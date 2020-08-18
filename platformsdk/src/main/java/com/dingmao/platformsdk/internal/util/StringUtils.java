package com.dingmao.platformsdk.internal.util;

import java.io.IOException;
import java.io.InputStream;

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
}
