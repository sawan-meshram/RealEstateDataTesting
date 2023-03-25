package com.realestate.builder;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvRecurse;

public class Builder {

	@CsvBindByName(column="Index", required= true)
	private int index;
	
	@CsvBindByName(column="BuilderName", required= true)
	private String builderName;

	@CsvBindByName(column="BuilderUrl", required= true)
	private String builderUrl;
	
	@CsvBindByName(column="CommunityName", required= true)
	private String communityName;
	
	@CsvBindByName(column="CommunityUrl", required= true)
	private String communityUrl;
	
	@CsvRecurse
	private Type type;
	
	@CsvRecurse
	private Address address;
	
	@CsvRecurse
	private Coordinate coordinate;
	
	@CsvRecurse
	private Price price;
	
	@CsvRecurse
	private Sqft sqft;
	
	@CsvRecurse
	private Date date;
	
	@CsvBindByName(column="GEOCODED_FROM_GOOGLE")
	private String geoCode;
	
	@CsvBindByName(column="PropertyStatus")
	private String propertyStatus;
	
	@CsvBindByName(column="Notes")
	private String note;
	
	@CsvBindByName(column="Number_Of_Units")
	private String numberOfUnits;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getBuilderName() {
		return builderName;
	}

	public void setBuilderName(String builderName) {
		this.builderName = builderName;
	}

	public String getBuilderUrl() {
		return builderUrl;
	}

	public void setBuilderUrl(String builderUrl) {
		this.builderUrl = builderUrl;
	}

	public String getCommunityName() {
		return communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getCommunityUrl() {
		return communityUrl;
	}

	public void setCommunityUrl(String communityUrl) {
		this.communityUrl = communityUrl;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Sqft getSqft() {
		return sqft;
	}

	public void setSqft(Sqft sqft) {
		this.sqft = sqft;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getGeoCode() {
		return geoCode;
	}

	public void setGeoCode(String geoCode) {
		this.geoCode = geoCode;
	}

	public String getPropertyStatus() {
		return propertyStatus;
	}

	public void setPropertyStatus(String propertyStatus) {
		this.propertyStatus = propertyStatus;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getNumberOfUnits() {
		return numberOfUnits;
	}

	public void setNumberOfUnits(String numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}

	@Override
	public String toString() {
		return "Builder [index=" + index + ", builderName=" + builderName + ", builderUrl=" + builderUrl
				+ ", communityName=" + communityName + ", communityUrl=" + communityUrl + ", type=" + type
				+ ", address=" + address + ", coordinate=" + coordinate + ", price=" + price + ", sqft=" + sqft
				+ ", date=" + date + ", geoCode=" + geoCode + ", propertyStatus=" + propertyStatus + ", note=" + note
				+ ", numberOfUnits=" + numberOfUnits + "]";
	}
	
}
