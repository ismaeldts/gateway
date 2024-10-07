package com.urbanestia.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
 public class GatewayMcsvApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayMcsvApplication.class, args);
	}

}
