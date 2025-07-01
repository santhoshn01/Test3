package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.WebApplicationType;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        app.setWebApplicationType(WebApplicationType.SERVLET); // Starts a web server
        app.run(args);

        System.out.println("Welcome");

        try {
            Thread.sleep(600_000); // 10 minutes
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Interrupted during sleep.");
        }

        System.out.println("Exiting after 10 minutes");
    }
}
