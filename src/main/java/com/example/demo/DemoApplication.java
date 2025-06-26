package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        // Force the app to start as a web application with embedded servlet container
        app.setWebApplicationType(WebApplicationType.SERVLET);
        app.run(args);
        System.out.println("Welcome");
    }

}
