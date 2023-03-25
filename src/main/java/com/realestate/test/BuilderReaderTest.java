package com.realestate.test;

import java.util.List;

import com.realestate.builder.Builder;
import com.realestate.reader.BuilderReader;

public class BuilderReaderTest {
	public static void main(String[] args) throws Exception {
		 String filePath = "/home/shatam-25/Downloads/Builders/Newmark Homes Houston.csv";
		 /*List<Builder> builders = new CsvToBeanBuilder<Builder>(new FileReader(filePath))
				 .withType(Builder.class)
				 .build()
				 .parse();
		 
		 System.out.println(builders.size());
		 
		 System.out.println(builders.get(18));
*/
		 
//		 CSVReader reader = new CSVReaderBuilder(new FileReader(filePath)).build();
//	     List<String[]> myEntries = reader.readAll();
//	     
//	     for(String[] lines : myEntries) {
//	    	 System.out.println(Arrays.toString(lines));
//	     }
		 
		 List<Builder> builders = BuilderReader.readCsvToBeanFile(filePath);
		 Builder b1 = builders.get(18);
		 System.out.println(b1);//print row
		 System.out.println(b1.getDate().getFetchingTime()); //fetching time
		 System.out.println(b1.getType().getCommunityType()); //comm. type
		 System.out.println(b1.getIndex());
		 System.out.println(b1.getAddress().getStreet()); //comm. type
		 
	}
	
}
