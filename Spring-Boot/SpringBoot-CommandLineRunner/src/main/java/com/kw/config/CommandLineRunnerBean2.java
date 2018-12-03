package com.kw.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class CommandLineRunnerBean2 implements CommandLineRunner {
    public void run(String... args) {
    	System.out.println("CommandLineRunnerBean 2");
    }
}
