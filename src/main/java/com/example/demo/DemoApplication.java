package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // Start the Spring Boot application
        SpringApplication.run(DemoApplication.class, args);
        
        // Add a sleep delay (e.g., 5 seconds) to simulate waiting
        try {
            System.out.println("The application will wait for 5 seconds...");
            Thread.sleep(5000);  // 5000 milliseconds = 5 seconds
            System.out.println("The wait is over! Application is now running.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // No sleep or manual intervention needed after this
    }
}
