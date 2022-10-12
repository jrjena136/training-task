package com.starhealth.springrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestapiApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		
		return new RestTemplate();
	}

}
