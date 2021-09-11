package com.safetynet.database.models;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String address;
	private String city;
	private String zip;
	private int station;

	public Address() {

	}

	public Address(String address, String city, String zip, int station) {
		this.address = address;
		this.city = city;
		this.zip = zip;
		this.station = station;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String adress) {
		this.address = adress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public int getStation() {
		return station;
	}

	public void setStation(int station) {
		this.station = station;
	}
}
