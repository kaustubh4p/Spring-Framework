package com.spring.core.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.core.bean.Customer;

/**
 * @author KaustubhWaghmare
 *
 */
public class SpringCoreConfigExample {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Customer obj = (Customer) context.getBean("customer");
		obj.getMessage("Hi whatsup !!");

	}
}
