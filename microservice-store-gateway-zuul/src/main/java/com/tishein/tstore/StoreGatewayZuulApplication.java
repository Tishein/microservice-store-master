package com.tishein.tstore;

import com.tishein.tstore.fallback.ZuulFallback;
import com.tishein.tstore.filter.PreZuulFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class StoreGatewayZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreGatewayZuulApplication.class, args);
    }

    @Bean
    public ZuulFallback zuulFallback() {
        return new ZuulFallback();
    }

    @Bean
    public PreZuulFilter preZuulFilter() {
        return new PreZuulFilter();
    }
}
