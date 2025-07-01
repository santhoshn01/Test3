package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        app.run(args);

        // Check if sleep should be skipped (useful for tests)
        String skipSleep = System.getProperty("skip.sleep", "false");
        if (skipSleep.equalsIgnoreCase("true")) {
            System.out.println("Skipping sleep as requested.");
            return;
        }

        System.out.println("Welcome");

        try {
            Thread.sleep(600_000); // 10 minutes sleep
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Interrupted during sleep.");
        }

        System.out.println("Exiting after 10 minutes");
    }
}
