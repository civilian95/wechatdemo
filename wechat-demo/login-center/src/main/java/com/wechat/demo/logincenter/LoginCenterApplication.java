package com.wechat.demo.logincenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LoginCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginCenterApplication.class, args);
	}

}
