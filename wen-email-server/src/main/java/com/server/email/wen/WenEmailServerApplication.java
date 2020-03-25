package com.server.email.wen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WenEmailServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WenEmailServerApplication.class, args);
	}

}
