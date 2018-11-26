package com.spring.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author KaustubhWaghmare
 *
 */
@Configuration
@Import({ CustomerConfig.class, SchedulerConfig.class })
public class AppConfig {

}