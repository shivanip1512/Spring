package com.springcore.annotations.Config;

import org.springframework.stereotype.Component;

//@Component
public class Demo {
	
	private StartDemo start;

	public void test() {
		this.start.display();
		System.out.println("inside demo test method...");
	}
	public Demo(StartDemo sd) {
		this.start = sd;
	}
}
