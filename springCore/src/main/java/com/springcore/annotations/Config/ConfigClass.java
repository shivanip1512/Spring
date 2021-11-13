package com.springcore.annotations.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.springcore.annotations.Config")
public class ConfigClass {
	
	@Bean
	public StartDemo getStartDemo() {
		return new StartDemo();
	}

	@Bean(name = {"obj1","obj2","obj3"})
	public Demo getDemoInstance() {
		return new Demo(getStartDemo());
	}
}
