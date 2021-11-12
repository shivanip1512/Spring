package com.springcore.ci;

public class Person {
	private String name;
	private int personId;

	public Person(String name1, int personId1) {
		super();
		this.name = name1;
		this.personId = personId1;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + "]";
	}

}
