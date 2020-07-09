package com.caryguan.byteTest;

import org.bouncycastle.util.encoders.UTF8;

import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * @Author GuanCary
 * @Date 2020/7/7 17:07
 * @Version 1.0
 **/
public class demo1 {
    public static void main(String[] args) {
        byte[] bytes = {97, 98, 99, 100, 101};
        // String s = Arrays.toString(bytes);
        String s = new String(bytes);
        System.out.println(s);
        // byte[] bytes = {1, 2, 3, 4, 5};
        // for (byte e : bytes) {
        //     System.out.println(e);
        // }
        // String s = utilHelper.byte2Base64StringFun(bytes);
        // System.out.println(s);
        // byte[] bytes1 = utilHelper.base64String2ByteFun(s);
        // for (byte e : bytes) {
        //     System.out.println(e);
        // }
    }
}