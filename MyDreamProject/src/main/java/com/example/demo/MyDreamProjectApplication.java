package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"com.tofg.controller"})
@EntityScan("com.tofg.model")
@EnableJpaRepositories("com.tofg.repository")

public class MyDreamProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDreamProjectApplication.class, args);
	}

}
