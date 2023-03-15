package com.king.kingapiinterface.controller;

import com.king.kingapiclientsdk.model.User;
import com.king.kingapiclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 名称API
 * @author King
 * @Description:
 */
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/")
    public String getNameByGet(String name){

        return "你的名字" + name;
    }

    @PostMapping("/")
    public String getNameByPost(@RequestParam String name){
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request){
        String accessKey = request.getHeader("accessKey");
        String nonce = request.getHeader("nonce");
        String timestamp = request.getHeader("timestamp");
        String sign = request.getHeader("sign");
        String body = request.getHeader("body");
        // todo 实际需要到数据库中查是否已分配给用户
        if (!accessKey.equals("king")){
            throw new RuntimeException("无权限");
        }
        if (Long.parseLong(nonce) > 10000){
            throw new RuntimeException("无权限");
        }
        //todo 时间和当前时间不能超过5分钟
//        if (timestamp)
        //todo 实际需要到数据库中查出secretKey
        String serverSign = SignUtils.getSign(body, "abcdefgh");
        if (!sign.equals(serverSign)) {
            throw new RuntimeException("无权限");
        }
        return "POST 用户名字是" + user.getUsername();
    }
}
