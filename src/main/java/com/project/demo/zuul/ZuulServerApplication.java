package com.project.demo.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//annotation is used to make your Spring Boot application act as a Zuul Proxy server.
//@EnableZuulProxy
public class ZuulServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class, args);
    }

     //application.properties file
     //spring.application.name = zuulserver
     //zuul.routes.products.path = /api/demo/**// zuul.routes.products.url = http://localhost:8080/
     //server.port = 8111

    //This means that http calls to /api/demo/ get forwarded to the products service. For example, /api/demo/products is forwarded to /products.
}