package com.diktam.jenkinsmavendemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JenkinsMavenDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsMavenDemoApplication.class, args);
	}

	@RestController
	static class TestController {

		@GetMapping
		String test() {
			System.out.println("Hello World");
			return "ok";
		}
	}

}
