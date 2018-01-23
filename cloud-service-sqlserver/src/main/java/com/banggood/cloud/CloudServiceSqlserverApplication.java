package com.banggood.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudServiceSqlserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudServiceSqlserverApplication.class, args);
	}
}
