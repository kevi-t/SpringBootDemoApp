package com.project.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.Serial;
import java.io.Serializable;

@SpringBootApplication
@RestController
public class DemoApplication extends SpringBootServletInitializer implements Serializable {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Serial
    private static final long serialVersionUID = 1L;
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoApplication.class);
    }
//    @Override
//    public void run(ApplicationArguments arg0) throws Exception {
//        System.out.println("Hello World from Application Runner");
//    }

//    @SpringBootApplication
//    public class DemoApplication implements CommandLineRunner {
//        public static void main(String[] args) {
//            SpringApplication.run(DemoApplication.class, args);
//        }
//        @Override
//        public void run(String... arg0) throws Exception {
//            System.out.println("Hello world from Command Line Runner");
//        }
//    }
}