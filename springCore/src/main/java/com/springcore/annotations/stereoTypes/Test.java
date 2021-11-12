package com.springcore.annotations.stereoTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("com/springcore/annotations/stereoTypes/config.xml");
		Stanalone obj = c.getBean("obj",Stanalone.class);
		System.out.println(obj);
	}

}
