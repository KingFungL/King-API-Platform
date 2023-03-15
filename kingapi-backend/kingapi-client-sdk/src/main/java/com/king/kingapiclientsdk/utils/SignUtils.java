package com.king.kingapiclientsdk.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

/**
 * @author King
 * @Description: 签名工具类
 */
public class SignUtils {

    /**
     * 生成签名
     * @param secretKey
     * @return
     */
    public static String getSign(String body, String secretKey){
        Digester md5 = new Digester(DigestAlgorithm.SHA256);
        String content = body.toString() + "." + secretKey;
        return md5.digestHex(content);
    }
}
