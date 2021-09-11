package com.safetynet.database.models;

public class City {

	private String cityName;
	private String zip;

	public City(String cityName, String zip) {
		this.cityName = cityName;
		this.zip = zip;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
}
