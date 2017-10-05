package com.yhyy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientKafka {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigClientKafka.class).web(true).run(args);
	}

}
