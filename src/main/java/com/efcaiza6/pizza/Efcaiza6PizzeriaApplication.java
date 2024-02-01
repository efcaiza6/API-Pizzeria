package com.efcaiza6.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableJpaAuditing
public class Efcaiza6PizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Efcaiza6PizzeriaApplication.class, args);
	}

}
