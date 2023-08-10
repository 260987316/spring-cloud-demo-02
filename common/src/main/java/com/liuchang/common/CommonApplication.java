package com.liuchang.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class CommonApplication {

    @GetMapping
    public String test() {
        return "狗子报时:" + new Date();
    }

    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args);
    }

}
