package com.realestate.builder;

import com.opencsv.bean.CsvBindByName;

public class Coordinate {

	@CsvBindByName(column = "Latitude")
	private String latitude;
	 
	@CsvBindByName(column = "Longitude")
	private String longitude;

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "Coordinate [latitude=" + latitude + ", longitude=" + longitude + "]";
	}
		
}
