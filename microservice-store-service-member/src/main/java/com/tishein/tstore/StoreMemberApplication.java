package com.tishein.tstore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class StoreMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreMemberApplication.class, args);
    }
}
