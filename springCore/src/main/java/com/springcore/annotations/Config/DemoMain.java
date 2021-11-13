package com.springcore.annotations.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);

		Demo demoBean = context.getBean("obj1",Demo.class);
		demoBean.test();
	}

}
