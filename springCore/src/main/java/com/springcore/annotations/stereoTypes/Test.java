package com.springcore.annotations.stereoTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("com/springcore/annotations/stereoTypes/config.xml");
		//standalone return same object
		Stanalone obj = c.getBean("obj",Stanalone.class);
		System.out.println(obj.hashCode());
		System.out.println(obj);
		Stanalone obj1 = c.getBean("obj",Stanalone.class);
		System.out.println(obj1.hashCode());

		//prototype scope return diff objs
		System.out.println(c.getBean("abc",ABC.class).hashCode());
		System.out.println(c.getBean("abc",ABC.class).hashCode());
}

}
