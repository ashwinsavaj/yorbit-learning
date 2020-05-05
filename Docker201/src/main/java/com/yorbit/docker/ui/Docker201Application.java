package com.yorbit.docker.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Docker201Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Docker201Application.class, args);
	}

}
