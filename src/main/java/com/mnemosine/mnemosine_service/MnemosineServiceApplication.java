package com.mnemosine.mnemosine_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MnemosineServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MnemosineServiceApplication.class, args);
	}

}
