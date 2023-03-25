package com.realestate.builder;

import com.opencsv.bean.CsvBindByName;

public class Type {

	@CsvBindByName(column="CommunityType")
	private String communityType;
	
	@CsvBindByName(column="PropertyType")
	private String propertyType;
	
	@CsvBindByName(column="DERIVED_PROPERTY_TYPE")
	private String derivedPropertyType;

	public String getCommunityType() {
		return communityType;
	}

	public void setCommunityType(String communityType) {
		this.communityType = communityType;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getDerivedPropertyType() {
		return derivedPropertyType;
	}

	public void setDerivedPropertyType(String derivedPropertyType) {
		this.derivedPropertyType = derivedPropertyType;
	}

	@Override
	public String toString() {
		return "Type [communityType=" + communityType + ", propertyType=" + propertyType + ", derivedPropertyType="
				+ derivedPropertyType + "]";
	}
	
}
