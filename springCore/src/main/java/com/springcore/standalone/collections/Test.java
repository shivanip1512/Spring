package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext contect = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/config.xml");
		Stanalone s1 = contect.getBean("s1",Stanalone.class);
		System.out.println(s1);
	}

}
