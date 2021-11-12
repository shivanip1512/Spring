package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Citizen {
	private String adharNum;
	private List<String> addresses;
	private Set<String> phones;
	private Map<String, String> placesmoved;

	public String getAdharNum() {
		return adharNum;
	}

	public void setAdharNum(String adharNum) {
		this.adharNum = adharNum;
	}

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	public Set<String> getPhones() {
		return phones;
	}

	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}

	public Map<String, String> getPlacesmoved() {
		return placesmoved;
	}

	public void setPlacesmoved(Map<String, String> placesmoved) {
		this.placesmoved = placesmoved;
	}

	@Override
	public String toString() {
		return "Citizen [adharNum=" + adharNum + ", addresses=" + addresses + ", phones=" + phones + ", placesmoved="
				+ placesmoved + "]";
	}

}
