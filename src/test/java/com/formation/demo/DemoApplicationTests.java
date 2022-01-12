package com.formation.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.formation.demo.service.Calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	Calculator calculator;


	@Test
	void contextLoads() {
		assertEquals(5, calculator.sum(3, 2));
	}

}
