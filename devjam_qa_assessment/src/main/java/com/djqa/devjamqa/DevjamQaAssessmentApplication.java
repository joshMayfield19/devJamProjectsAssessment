package com.djqa.devjamqa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DevjamQaAssessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevjamQaAssessmentApplication.class, args);
	}
}
