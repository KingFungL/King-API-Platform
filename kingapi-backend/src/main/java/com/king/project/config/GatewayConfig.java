package com.king.project.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author King
 * @Description:
 */
@Configuration
@ConfigurationProperties(prefix = "king.gateway")
@Data
public class GatewayConfig {

    private String host;
}
