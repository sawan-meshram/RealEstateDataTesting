package com.realestate.test;

import com.realestate.query.TestQuery;
import com.realestate.query.TestQueryBuilder;

public class TestQueryMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		TestQuery test = new TestQueryBuilder()
				.prepareOriginalBuilderFile("/home/shatam-25/Downloads/Builders/Main Street Homes (copy).csv")
				.prepareFinalBuilderFile("/home/shatam-25/Downloads/Builders/Main Street Homes.csv")
				.buildTestQuery();
		
		test.wrongPropStatus(7, "Now Selling Final Section", "Actively Selling");
		test.wrongPropStatus(17, "Homesites Coming Soon");
		test.wrongPropStatus(20, "Coming Soon");
		test.wrongPropStatus(1, "Coming Soon");
		
		test.wrongPropType(7, "Luxury Homes");		
		test.wrongPropStatus(4, "Coming Soon");
		test.wrongDerivedType(4, "1 Story");
		
//		test.test();
		
		test.testFinal();
		test.showTestFinal();
	}

}
