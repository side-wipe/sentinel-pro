package com.sidewipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductCenterApplication.class, args);
    }

}
