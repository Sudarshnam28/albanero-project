package com.spring.Spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.dao")
@EntityScan(basePackages="com.modal")
@SpringBootApplication(scanBasePackages="com")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
