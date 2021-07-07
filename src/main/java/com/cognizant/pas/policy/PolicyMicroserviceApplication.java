package com.cognizant.pas.policy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2

@SpringBootApplication
@EnableFeignClients
@ComponentScan(basePackages={"com.cognizant"})
@EnableJpaRepositories
public class PolicyMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolicyMicroserviceApplication.class, args);
	}

}
