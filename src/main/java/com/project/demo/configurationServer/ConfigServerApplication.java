package com.project.demo.configurationServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

//    server.port = 8888
//    spring.cloud.config.server.native.searchLocations=file:///C:/configprop/
//    SPRING_PROFILES_ACTIVE=native

}