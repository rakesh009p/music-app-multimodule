package com.stackroute.gatewayapidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayapidemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayapidemoApplication.class, args);
	}

}
