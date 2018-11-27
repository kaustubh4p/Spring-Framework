package com.spring.core.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.bean.OutputHelper;


/**
 * @author KaustubhWaghmare
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");
		OutputHelper  output = (OutputHelper ) context.getBean("OutputHelper");
		output.generateOutput();
	}
}