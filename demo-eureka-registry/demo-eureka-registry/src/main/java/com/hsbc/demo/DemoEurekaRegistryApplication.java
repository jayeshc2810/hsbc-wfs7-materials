package com.hsbc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// the default port of tomcat is 8080, hence you run in 8761 
// so that eureka registry will be running in 8761
@SpringBootApplication
@EnableEurekaServer
public class DemoEurekaRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEurekaRegistryApplication.class, args);
	}

}
