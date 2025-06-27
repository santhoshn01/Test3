package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.WebApplicationType;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        app.setWebApplicationType(WebApplicationType.SERVLET); // Ensure web server mode
        app.run(args);
        System.out.println("Welcome");
        // No sleep or exit here — app stays alive as long as web server runs
    }
}
