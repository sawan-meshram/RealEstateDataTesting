package com.realestate.builder;

import com.opencsv.bean.CsvBindByName;

public class Price {

	@CsvBindByName(column = "MinPrice")
	private String minPrice;

	@CsvBindByName(column = "MaxPrice")
	private String maxPrice;

	public String getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	public String getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	@Override
	public String toString() {
		return "Price [minPrice=" + minPrice + ", maxPrice=" + maxPrice + "]";
	}

}

