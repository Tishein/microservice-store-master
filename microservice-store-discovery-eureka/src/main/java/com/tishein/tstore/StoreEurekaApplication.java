package com.tishein.tstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class StoreEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreEurekaApplication.class, args);
    }
}
