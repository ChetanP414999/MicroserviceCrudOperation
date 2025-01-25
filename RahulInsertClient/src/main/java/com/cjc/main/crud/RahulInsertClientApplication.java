package com.cjc.main.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RahulInsertClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RahulInsertClientApplication.class, args);
	}

}
