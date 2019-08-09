package com.stackroute.gatewayconfigdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GatewayconfigdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayconfigdemoApplication.class, args);
	}

}
