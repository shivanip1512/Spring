package com.spring.hibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "student_address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private int addrId;

	@Column(length = 50)
	private String street;
	private String city;

	@Column(name = "is_open")
	private boolean isOpen;

	@Transient // not created in db
	private double airQuality;

	@Column(name = "added_date")
	@Temporal(TemporalType.DATE)
	private Date addedDate;

	@Lob
	private byte[] image;

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Address [addrId=" + addrId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
				+ ", airQuality=" + airQuality + ", addedDate=" + addedDate + ", image="
				+ (image != null ? arrayToString(image, image.length, maxLen) : null) + "]";
	}

	private String arrayToString(Object array, int len, int maxLen) {
		StringBuilder builder = new StringBuilder();
		len = Math.min(len, maxLen);
		builder.append("[");
		for (int i = 0; i < len; i++) {
			if (i > 0)
				builder.append(", ");
			if (array instanceof byte[])
				builder.append(((byte[]) array)[i]);
		}
		builder.append("]");
		return builder.toString();
	}

	public Address(int addrId, String street, String city, boolean isOpen, double airQuality, Date addrDate,
			byte[] image) {
		super();
		this.addrId = addrId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.airQuality = airQuality;
		this.addedDate = addrDate;
		this.image = image;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}


	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getAirQuality() {
		return airQuality;
	}

	public void setAirQuality(double airQuality) {
		this.airQuality = airQuality;
	}

	public Date getAddrDate() {
		return addedDate;
	}

	public void setAddrDate(Date addrDate) {
		this.addedDate = addrDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
}
