package com.michaelsoft.springboottest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.*;
import org.junit.runner.*;
//import org.springframework.boot.test.context.web.*;
import org.springframework.boot.test.web.client.*;
import org.springframework.test.context.junit4.*;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringBootTestApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void exampleTest() {
		String body = this.restTemplate.getForObject("/", String.class);
		assertThat(body).isEqualTo("Hello World");
	}
}
