package com.RESTAPI.learnRESTAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@ComponentScan("com.RESTAPI.*")
@EntityScan("com.RESTAPI.*")
@EnableJpaRepositories("com.RESTAPI.*")
public class LearnRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnRestapiApplication.class, args);
	}

}
