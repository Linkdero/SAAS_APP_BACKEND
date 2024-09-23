package com.saas.SAAS_APP_BACKEND;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH") 
public class SaasAppBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaasAppBackendApplication.class, args);
	}

}
