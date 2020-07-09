package com.caryguan.byteTest;

import org.apache.commons.codec.binary.Base64;

/**
 * @Author GuanCary
 * @Date 2020/7/7 17:19
 * @Version 1.0
 **/
public class utilHelper {
    //字符串转byte[]
    public static byte[] base64String2ByteFun(String base64str) {
        byte[] bytes = Base64.decodeBase64(base64str);
        return bytes;
    }
    //byte[]转base64
    public static String byte2Base64StringFun(byte[] b) {
        return Base64.encodeBase64String(b);
    }
}