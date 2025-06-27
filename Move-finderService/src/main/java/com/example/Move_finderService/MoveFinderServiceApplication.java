package com.example.Move_finderService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MoveFinderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoveFinderServiceApplication.class, args);
	}

}
