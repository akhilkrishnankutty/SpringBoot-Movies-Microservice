package com.example.Movie_front_end;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MovieFrontEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieFrontEndApplication.class, args);
	}

}
