package com.kw.config;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerBean implements ApplicationRunner {
	private static final Logger logger = LoggerFactory.getLogger(ApplicationRunnerBean.class);	
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
    	    String strArgs = Arrays.stream(arg0.getSourceArgs()).collect(Collectors.joining("|"));
    	    logger.info("ApplicationRunnerBean started with arguments:" + strArgs);
	}
} 
