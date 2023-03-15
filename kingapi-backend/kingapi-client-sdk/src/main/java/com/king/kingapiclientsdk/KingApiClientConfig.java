package com.king.kingapiclientsdk;

import com.king.kingapiclientsdk.client.KingApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author King
 * @Description:
 */

@Configuration
@ConfigurationProperties("kingapi.client")
@Data
@ComponentScan
public class KingApiClientConfig {
    /**
     * appid
     */
    private String accessKey;

    /**
     * 密钥
     */
    private String secretKey;

    @Bean
    public KingApiClient kingApiClient(){
        return new KingApiClient(accessKey, secretKey);
    }
}
