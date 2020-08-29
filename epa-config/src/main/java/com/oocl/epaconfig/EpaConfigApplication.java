package com.oocl.epaconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EpaConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(EpaConfigApplication.class, args);
    }

}
