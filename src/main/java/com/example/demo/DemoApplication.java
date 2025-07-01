package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws InterruptedException {

        if (!Boolean.getBoolean("skip.sleep")) {
            System.out.println("Sleeping for 10 minutes...");
            Thread.sleep(10 * 60 * 1000); // Sleep for 10 minutes
        } else {
            System.out.println("Skipping sleep during test runs.");
        }

        SpringApplication.run(DemoApplication.class, args);
    }
}
