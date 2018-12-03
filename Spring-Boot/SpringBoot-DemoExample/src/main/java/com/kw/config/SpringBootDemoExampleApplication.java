package com.kw.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages="com.kw")
public class SpringBootDemoExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoExampleApplication.class, args);
	}
}
