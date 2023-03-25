package com.realestate.builder;

import com.opencsv.bean.CsvBindByName;

public class Sqft {

	@CsvBindByName(column="MinSquareFeet")
	private String minSquareFeet;
	
	@CsvBindByName(column="MaxSquareFeet")
	private String maxSquareFeet;

	public String getMinSquareFeet() {
		return minSquareFeet;
	}

	public void setMinSquareFeet(String minSquareFeet) {
		this.minSquareFeet = minSquareFeet;
	}

	public String getMaxSquareFeet() {
		return maxSquareFeet;
	}

	public void setMaxSquareFeet(String maxSquareFeet) {
		this.maxSquareFeet = maxSquareFeet;
	}

	@Override
	public String toString() {
		return "Sqft [minSquareFeet=" + minSquareFeet + ", maxSquareFeet=" + maxSquareFeet + "]";
	}
}
