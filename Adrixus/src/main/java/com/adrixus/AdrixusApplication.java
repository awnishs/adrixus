package com.adrixus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AdrixusApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdrixusApplication.class, args);
	}

}
