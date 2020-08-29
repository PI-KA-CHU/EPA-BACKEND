package com.oocl.epaorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EpaOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EpaOrderServiceApplication.class, args);
    }

}
