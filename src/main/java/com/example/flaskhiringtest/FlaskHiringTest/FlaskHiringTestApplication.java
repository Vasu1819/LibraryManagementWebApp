package com.example.flaskhiringtest.FlaskHiringTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FlaskHiringTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlaskHiringTestApplication.class, args);
	}

}
