package com.springcore.reference;

public class A {
	int x;
	B obj;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public B getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", obj=" + obj + "]";
	}

	public void setObj(B obj) {
		this.obj = obj;
	}

}
