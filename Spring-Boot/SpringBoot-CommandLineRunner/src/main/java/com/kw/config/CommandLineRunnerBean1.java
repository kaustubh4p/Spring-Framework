package com.kw.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class CommandLineRunnerBean1 implements CommandLineRunner {
    public void run(String... args) {
    	System.out.println("CommandLineRunnerBean 1");
    }
}
