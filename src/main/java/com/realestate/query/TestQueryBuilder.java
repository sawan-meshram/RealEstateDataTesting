package com.realestate.query;

import java.util.List;
import com.realestate.builder.Builder;
import com.realestate.reader.BuilderReader;

public class TestQueryBuilder {

	public List<Builder> getOriginalBuilderList() {
		return originalBuilderList;
	}

	public List<Builder> getFinalBuilderList() {
		return finalBuilderList;
	}

	private List<Builder> originalBuilderList;
	private List<Builder> finalBuilderList;

	public TestQueryBuilder prepareOriginalBuilderFile(String filePath) throws Exception {
		originalBuilderList = BuilderReader.readCsvToBeanFile(filePath);
		return this;
	}
	
	public TestQueryBuilder prepareFinalBuilderFile(String filePath) throws Exception {
		finalBuilderList = BuilderReader.readCsvToBeanFile(filePath);
		return this;
	}

	public TestQuery buildTestQuery() {
		return new TestQuery(this); 
	}
	
}
