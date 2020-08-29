package com.oocl.epauserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EpaUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EpaUserServiceApplication.class, args);
    }

}
