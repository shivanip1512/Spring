package com.springcore.standalone.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Stanalone {
	private List<Integer> list;
	private Map<String, String> map;

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Stanalone [list=" + (list != null ? toString(list, maxLen) : null) + ", map="
				+ (map != null ? toString(map.entrySet(), maxLen) : null) + "]";
	}

	private String toString(Collection<?> collection, int maxLen) {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		int i = 0;
		for (Iterator<?> iterator = collection.iterator(); iterator.hasNext() && i < maxLen; i++) {
			if (i > 0)
				builder.append(", ");
			builder.append(iterator.next());
		}
		builder.append("]");
		return builder.toString();
	}
}
