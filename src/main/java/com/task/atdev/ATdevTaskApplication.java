package com.task.atdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.atdev.controller")
@EnableJpaRepositories(basePackages = "com.atdev.repository")
@EntityScan(basePackages = "com.atdev.entity")
public class ATdevTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(ATdevTaskApplication.class, args);
	}

}
