package com.bbs.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Tricloud
 * @date 2021/5/21 17:19
 */

/**
 * 密码加密
 * @author Tricloud
 */
public class MD5Utils {
    public static String getMD5(String pwd){
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(pwd.getBytes());
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}