package com.realestate.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.realestate.builder.Field;
import com.realestate.function.FourConsumer;

public class BuilderUtil {
	public static FourConsumer<Integer, List<String>, Field, Map<Integer, Map<Field, List<String>>>> addToTestFinalMap = (
			index, bugs, field, testFinalMap) -> 
	{
		Map<Field, List<String>> bugsMap;
		if(testFinalMap.containsKey(index))
			bugsMap = testFinalMap.get(index);
		else bugsMap = new HashMap<>();
		
		//can update bugs list here, but we are assuming that only one field will add to Map
		if(!bugsMap.containsKey(field)) {
			bugsMap.put(field, bugs);
		}
		testFinalMap.put(index, bugsMap);
	};
}
