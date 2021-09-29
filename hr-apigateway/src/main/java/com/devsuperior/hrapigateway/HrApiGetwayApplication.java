package com.devsuperior.hrapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrApiGetwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrApiGetwayApplication.class, args);
	}

}
