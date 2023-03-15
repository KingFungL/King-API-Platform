//package com.king.kingapiinterface;
//
//import com.king.kingapiinterface.client.KingApiClient;
//import com.king.kingapiinterface.model.User;
//
///**
// * @author King
// * @Description:
// */
//public class Main {
//    public static void main(String[] args) {
//
//        String accessKey  = "king";
//        String secretKey = "abcdefgh";
//
//        KingApiClient kingApiClient = new KingApiClient(accessKey, secretKey);
//        String result1 = kingApiClient.getNameByGet("Mark");
//        String result2 = kingApiClient.getNameByPost("Mark");
//        User user = new User();
//        user.setUsername("Mark-King");
//        String result3 = kingApiClient.getUsernameByPost(user);
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//    }
//}
