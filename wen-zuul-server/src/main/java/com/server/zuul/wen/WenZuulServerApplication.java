package com.server.zuul.wen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class WenZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WenZuulServerApplication.class, args);
	}

}
