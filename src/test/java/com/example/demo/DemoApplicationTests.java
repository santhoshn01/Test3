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
        System.setProperty("skip.sleep", "true");
    }

    @Test
    void contextLoads() {
        // Spring context loads successfully
    }
}
