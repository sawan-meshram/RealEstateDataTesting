package com.realestate.reader;

import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBeanBuilder;
import com.realestate.builder.Builder;

public class BuilderReader {
	
	public static List<Builder> readCsvToBeanFile(String filePath) throws Exception{
	    return new CsvToBeanBuilder<Builder>(new FileReader(filePath))
				 .withType(Builder.class)
				 .build()
				 .parse();
	}
	
	public static List<String[]> readCsvFile(String filePath) throws Exception{
	     return new CSVReaderBuilder(new FileReader(filePath))
	    		 .build()
	    		 .readAll();
	}
}
