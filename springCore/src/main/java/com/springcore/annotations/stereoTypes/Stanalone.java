package com.springcore.annotations.stereoTypes;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
//@Scope("prototype")
public class Stanalone {

	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;

	@Value("#{T(java.lang.Math).PI}")
	private double pi;

	@Value("#{new java.lang.String('obj')}")
	private String obj;

	@Value("Shivani")
	private String name;

	@Value("#{listCollection}")
	private List<Integer> list;
	
	@Value("#{5<7}")
	private boolean bool;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public double getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public String getObj() {
		return obj;
	}

	public void setObj(String obj) {
		this.obj = obj;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Stanalone [z=" + z + ", pi=" + pi + ", obj=" + obj + ", name=" + name + ", list="
				+ (list != null ? list.subList(0, Math.min(list.size(), maxLen)) : null) + ", bool=" + bool + "]";
	}

	

}
