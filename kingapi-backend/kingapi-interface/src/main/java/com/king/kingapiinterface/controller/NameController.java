package com.king.kingapiinterface.controller;

import com.king.kingapiclientsdk.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 名称API
 * @author King
 * @Description:
 */
@RestController
@RequestMapping("/")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(@RequestBody User user) {
        return "GET 名字" + user.getUsername();
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestBody User user) {
        return "POST 名字" + user.getUsername();
    }

    @PostMapping("/user")
    public String getUserNameByGet(@RequestBody User user, HttpServletRequest request) {
        String result = "POST 用户名字是" + user.getUsername();
        return result;
    }
}
