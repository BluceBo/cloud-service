package com.banggood.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudServiceHiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudServiceHiveApplication.class, args);
	}
}
