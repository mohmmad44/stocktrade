package com.slml.test.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.slml.test")
@EntityScan("com.slml.test.model")
@EnableJpaRepositories("com.slml.test.repository")
public class SlmlProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlmlProjectApplication.class, args);
	}

}
