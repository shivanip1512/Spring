package com.springcore.annotations.stereoTypes;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj")
@Scope("prototype")
public class Stanalone {

	@Value("Shivani")
	private String name;

	@Value("#{listCollection}")
	private List<Integer> list;

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

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Stanalone [name=" + name + ", list="
				+ (list != null ? list.subList(0, Math.min(list.size(), maxLen)) : null) + "]";
	}

}
