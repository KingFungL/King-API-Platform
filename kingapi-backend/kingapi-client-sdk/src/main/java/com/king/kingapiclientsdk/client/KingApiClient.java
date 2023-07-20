package com.king.kingapiclientsdk.client;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.json.JSONUtil;
import com.king.kingapiclientsdk.model.LoveWords;
import com.king.kingapiclientsdk.model.User;
import com.king.kingapiclientsdk.utils.SignUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author King
 * @Description:调用第三方接口的客户端
 */
public class KingApiClient {

    private static final String GATEWAY_HOST = "http://localhost:8090";
    //private static final String GATEWAY_HOST = "http://175.178.15.235:8090";

    private String accessKey;

    private String secretKey;

    public KingApiClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }



    public String getNameByGet(User user){
        String json = JSONUtil.toJsonStr(user);
        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HttpResponse httpResponse= HttpRequest.get(GATEWAY_HOST+"/api/get")
                .addHeaders(getHeaderMap(json))
                .body(json)
                .execute();
        String result = httpResponse.body();
        return result;
    }

    public String getNameByPost(User user){
        //该方法加了@RequestParam接收JSON
        String json = JSONUtil.toJsonStr(user);
        HttpResponse httpResponse= HttpRequest.post(GATEWAY_HOST+"/api/post")
                .addHeaders(getHeaderMap(json))
                .body(json)
                .execute();
        String result = httpResponse.body();
        return result;
    }

    //添加请求头，发送给网关校验用户的信息
    private Map<String, String> getHeaderMap(String body) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("accessKey", accessKey);
        // 一定不能直接发送
//        hashMap.put("secretKey", secretKey);
        hashMap.put("nonce", RandomUtil.randomNumbers(4));
        hashMap.put("body", body);
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        hashMap.put("sign", SignUtils.genSign(body, secretKey));
        return hashMap;
    }

    //模拟接口
    public String getUserNameByPost(User user) {
        String json = JSONUtil.toJsonStr(user);
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST + "/api/user")
                .addHeaders(getHeaderMap(json))
                .body(json)
                .execute();
        System.out.println(httpResponse.getStatus());
        String result = httpResponse.body();
        System.out.println(result);
        return result;
    }

    //随机情话接口
    public String getLoveWordsGet(LoveWords loveWords) {
        String json = JSONUtil.toJsonStr(loveWords);
        HttpResponse httpResponse = HttpRequest.get(GATEWAY_HOST + "/api/lovewords")
                .addHeaders(getHeaderMap(json))
                .body(json)
                .execute();
        String result = httpResponse.body();
        return result;
    }
    //随机返回抖音girl视频
    public String getdyGirlGet() {
        HttpResponse httpResponse = HttpRequest.get(GATEWAY_HOST + "/api/dygirl")
                .addHeaders(getHeaderMap(""))
                .body("")
                .execute();
        String result = httpResponse.body();
        return result;
    }

    //随机返回爬虫girl视频
//    public String getpcGirlGet() {
//        HttpResponse httpResponse = HttpRequest.get(GATEWAY_HOST + "/api/pcgirl")
//                .addHeaders(getHeaderMap(""))
//                .body("")
//                .execute();
//        String result = httpResponse.body();
//        return result;
//    }
}
