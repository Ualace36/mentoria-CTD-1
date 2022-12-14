package com.mentoria.ctd.apibancaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ApiBancariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBancariaApplication.class, args);
	}

}
