package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationIT {

    @Test
    void contextLoads() {
    }

    @Test
    void my_simple_integration_test() {
        System.out.println("Das ist ein Integration Test!");
        assertTrue(true);
    }
}
