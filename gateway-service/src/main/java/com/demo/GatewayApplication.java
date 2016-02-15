package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Marcos Barbero
 */
@EnableZuulProxy
@SpringCloudApplication
public class GatewayApplication {

    public static void main(String... args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}