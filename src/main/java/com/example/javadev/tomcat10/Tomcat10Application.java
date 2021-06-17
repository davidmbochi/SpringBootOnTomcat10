package com.example.javadev.tomcat10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Tomcat10Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Tomcat10Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Tomcat10Application.class);
	}
}
