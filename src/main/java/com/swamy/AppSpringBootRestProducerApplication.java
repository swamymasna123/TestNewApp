package com.swamy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AppSpringBootRestProducerApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AppSpringBootRestProducerApplication.class, args);
		System.out.println(context);
	}

}

