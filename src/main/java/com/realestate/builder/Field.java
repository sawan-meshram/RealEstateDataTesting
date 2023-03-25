package com.realestate.builder;

public enum Field {
	INDEX ("Index"),
	B_NAME ("BuilderName"),
	B_URL ("BuilderUrl"),
	C_NAME ("CommunityName"),
	C_URL ("CommunityUrl"),
	C_TYPE ("CommunityType"),
	STREET ("Address"),
	CITY ("City"),
	STATE ("State"),
	ZIP ("Zip"),
	LAT ("Latitude"),
	LON ("Longitude"),
	GEOCODE ("GEOCODED_FROM_GOOGLE"),
	P_TYPE ("PropertyType"),
	D_TYPE ("DERIVED_PROPERTY_TYPE"),
	P_STATUS ("PropertyStatus"),
	MIN_PRICE ("MinPrice"),
	MAX_PRICE ("MaxPrice"),
	MIN_SQFT ("MinSquareFeet"),
	MAX_SQFT ("MaxSquareFeet"),
	NOTES ("Notes"),
	F_DATE_TIME ("Fetching Time"),
	UNITS ("Number_Of_Units"),
	C_START_DATE ("Construction_Start_Date"),
	C_END_DATE ("Construction_End_Date");
	
	private final String name;
	Field(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
