package com.jtv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;


@PropertySource( "classpath:client.properties")

@SpringBootApplication

public class SpringbKafkaDemoApplication {
	public static void main(String[] args) { 
		SpringApplication.run(SpringbKafkaDemoApplication.class, args);
	}

}
