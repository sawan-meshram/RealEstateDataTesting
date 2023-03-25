package com.realestate.validation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.BiPredicate;

import org.apache.commons.lang3.StringUtils;

import com.realestate.function.TriFunction;

public class BuilderCompare {
	
	public static BiPredicate<Object[], Object[]> arrayEquals = (a, b)->{
		if (a.length == b.length) {
			Arrays.sort(a);
			Arrays.sort(b);
            return Arrays.equals(a,b);
        }
		return false;
	};
	
	public static TriFunction<String, String, Set<String>, List<String>> testIfBugsRemoved = (oldVal, newVal, wrongPropStatusSet)->{
		
		String oldStatus[] = oldVal.split(",");
		String newStatus[] = newVal.split(",");
		
		oldStatus = StringUtils.stripAll(oldStatus);
		newStatus = StringUtils.stripAll(newStatus);

		if(arrayEquals.test(oldStatus, newStatus)) return new ArrayList<>(wrongPropStatusSet); //not fixed
		
		List<String> bugs = new ArrayList<>();
		for(String val : newStatus) {
			if(wrongPropStatusSet.contains(val)) {
//				return false; //not fixed
				bugs.add(val);
			}
		}
		return bugs;
//		return true; //fixed
	};
	

}
