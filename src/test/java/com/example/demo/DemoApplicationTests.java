package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void my_simple_unit_test() {
		System.out.println("Das ist ein Unit Test!");
	}

	@Test
	void my_simple_integration_test() {
		System.out.println("Das ist ein Integration Test!");
	}
}
