package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerStudentApplication.class, args);
	}

}
