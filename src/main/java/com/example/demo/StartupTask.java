package com.example.demo;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.boot.context.event.ApplicationReadyEvent;

@Component
public class StartupTask {

    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationReady() {
        String skipSleep = System.getProperty("skip.sleep", "false");
        if (skipSleep.equalsIgnoreCase("true")) {
            System.out.println("Skipping StartupTask sleep as requested.");
            return;
        }

        System.out.println("Welcome from StartupTask");

        try {
            Thread.sleep(600_000); // 10 minutes sleep
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Interrupted during sleep.");
        }

        System.out.println("Exiting after 10 minutes from StartupTask");
    }
}
