package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
    webEnvironment = SpringBootTest.WebEnvironment.NONE,
    properties = {
        "spring.application.name=demo",
        "server.port=0",
        "skip.sleep=true"
    }
)
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }
}
