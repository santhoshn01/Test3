package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
    webEnvironment = SpringBootTest.WebEnvironment.NONE,
    properties = {
        "spring.application.name=demo",
        "server.port=0"
    }
)
class DemoApplicationTests {

    static {
        // Skip sleep logic for both DemoApplication and StartupTask
        System.setProperty("skip.sleep", "true");
    }

    @Test
    void contextLoads() {
        // If the Spring context starts without errors, test passes
    }
}
