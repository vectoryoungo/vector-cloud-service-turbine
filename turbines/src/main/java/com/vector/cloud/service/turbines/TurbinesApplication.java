package com.vector.cloud.service.turbines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class TurbinesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbinesApplication.class, args);
	}

}
