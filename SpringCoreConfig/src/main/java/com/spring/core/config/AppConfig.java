package com.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.core.bean.Customer;
import com.spring.core.bean.CustomerImpl;

/**
 * @author KaustubhWaghmare
 * Spring Core Configuration
 *
 */
@Configuration
public class AppConfig {
	
	@Bean(name="customer")
	public Customer getCustomerMsg()
	{
		return new CustomerImpl();
	}

}
