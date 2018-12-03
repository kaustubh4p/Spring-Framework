package com.kw.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.kw.service.HelloService;

@SpringBootApplication
@ComponentScan(basePackages="com.kw")
public class SpringMainApp {
	private static final Logger logger = LoggerFactory.getLogger(SpringMainApp.class);
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringMainApp.class, args);
		HelloService service =  context.getBean(HelloService.class);
		logger.info(service.getMessage());
    }       
} 
