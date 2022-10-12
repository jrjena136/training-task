package com.example.springmicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class TeacherMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeacherMicroservicesApplication.class, args);
	}

}
