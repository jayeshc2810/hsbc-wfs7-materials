package com.hsbc.demoeurekaclientaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoEurekaClientAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEurekaClientAccountApplication.class, args);
	}

}
