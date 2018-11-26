package com.spring.core.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.core.bean.SchedulerBo;

/**
 * @author KaustubhWaghmare
 *
 */
@Configuration
public class SchedulerConfig {
	
	@Bean(name="scheduler")
	public SchedulerBo suchedulerBo(){
		
		return new SchedulerBo();
		
	}
	
}