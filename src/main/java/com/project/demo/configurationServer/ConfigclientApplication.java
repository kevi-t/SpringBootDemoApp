package com.project.demo.configurationServer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RefreshScope annotation is used to load the configuration properties value from the Config server.
//@RefreshScope
@RestController
public class ConfigclientApplication {
    @Value("${welcome.message}")
    String welcomeText;

    public static void main(String[] args) {
        SpringApplication.run(ConfigclientApplication.class, args);
    }
    @RequestMapping(value = "/")
    public String welcomeText() {
        return welcomeText;
    }

//    spring.application.name = config-client
//    spring.cloud.config.uri = http://localhost:8888
}