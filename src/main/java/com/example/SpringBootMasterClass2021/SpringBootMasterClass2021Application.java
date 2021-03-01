package com.example.SpringBootMasterClass2021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootMasterClass2021Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMasterClass2021Application.class, args);
	}

}
