package com.king.kingapiinterface;

import com.king.kingapiclientsdk.client.KingApiClient;
import com.king.kingapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class KingapiInterfaceApplicationTests {

    @Resource
    private KingApiClient kingApiClient;

    @Test
    void contextLoads() {
        String resutlt = kingApiClient.getNameByGet("king");
        User user = new User();
        user.setUsername("Mark-King");
        String usernameByPost = kingApiClient.getUsernameByPost(user);
        System.out.println(usernameByPost);
        System.out.println(resutlt);
    }

}
