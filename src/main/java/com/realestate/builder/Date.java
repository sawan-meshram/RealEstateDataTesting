package com.realestate.builder;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

public class Date {

	@CsvBindByName(column="Fetching Time")
	@CsvDate("yyyy/MM/dd HH:mm:ss")
	private LocalDateTime fetchingTime;
	
	
	@CsvBindByName(column="Construction_Start_Date")
	@CsvDate("yyyy/MM/dd")
	private LocalDate constructionStartDate;
	
	@CsvBindByName(column="Construction_End_Date")
	@CsvDate("yyyy/MM/dd")
	private LocalDate constructionEndDate;

	public LocalDateTime getFetchingTime() {
		return fetchingTime;
	}

	public void setFetchingTime(LocalDateTime fetchingTime) {
		this.fetchingTime = fetchingTime;
	}

	public LocalDate getConstructionStartDate() {
		return constructionStartDate;
	}

	public void setConstructionStartDate(LocalDate constructionStartDate) {
		this.constructionStartDate = constructionStartDate;
	}

	public LocalDate getConstructionEndDate() {
		return constructionEndDate;
	}

	public void setConstructionEndDate(LocalDate constructionEndDate) {
		this.constructionEndDate = constructionEndDate;
	}

	@Override
	public String toString() {
		return "Date [fetchingTime=" + fetchingTime + ", constructionStartDate=" + constructionStartDate
				+ ", constructionEndDate=" + constructionEndDate + "]";
	}

}
