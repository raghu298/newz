package com.nui.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.nui")
@EnableFeignClients(basePackages={"com.feign.config"})
@EnableDiscoveryClient
public class NewzUiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewzUiServiceApplication.class, args);
	}
}
