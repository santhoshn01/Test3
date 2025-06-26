package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.WebApplicationType;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        app.setWebApplicationType(WebApplicationType.SERVLET); // ensure web server mode
        app.run(args);
        System.out.println("Welcome");
        
        // Pause for 10 seconds before shutting down the app
        Thread.sleep(10000);
        System.out.println("Exiting after 10 seconds");
    }
}
