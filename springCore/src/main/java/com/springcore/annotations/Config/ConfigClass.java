package com.springcore.annotations.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.springcore.annotations.Config")
public class ConfigClass {

	@Bean
	public Demo getDemoInstance() {
		return new Demo();
	}
}
