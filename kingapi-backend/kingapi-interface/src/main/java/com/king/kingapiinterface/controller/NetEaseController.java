//package com.king.kingapiinterface.controller;
//
//import cn.hutool.core.util.CharsetUtil;
//import cn.hutool.core.util.URLUtil;
//import cn.hutool.http.HttpRequest;
//import cn.hutool.http.HttpResponse;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * @author King
// * @Description: 网易云音乐接口
// */
//
//@RestController
//public class NetEaseController {
//
//    @PostMapping("/netEase/comments")
//    public String hotComments(HttpServletRequest request){
//        String url = "https://api.uomg.com/api/comments.163";
//        String body = URLUtil.decode(request.getHeader("body"), CharsetUtil.CHARSET_UTF_8);
//        System.out.println(body);
//        HttpResponse httpResponse = HttpRequest.post(url)
//                .body(body)
//                .execute();
//        return httpResponse.body();
//    }
//
//    @PostMapping("/netEase/randMusic")
//    public String randMusic(HttpServletRequest request) {
//        String url = "https://api.uomg.com/api/rand.music";
//        String body = URLUtil.decode(request.getHeader("body"), CharsetUtil.CHARSET_UTF_8);
//        HttpResponse httpResponse = HttpRequest.get(url + "?" + body)
//                .execute();
//        return httpResponse.body();
//    }
//}
