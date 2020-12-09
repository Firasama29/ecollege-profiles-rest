package com.ecollege;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.ecollege.repository.ProfileRepository;

@SpringBootApplication
//@EnableMongoRepositories(basePackageClasses = ProfileRepository.class)
public class RestProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestProfileApplication.class, args);
	}

}
