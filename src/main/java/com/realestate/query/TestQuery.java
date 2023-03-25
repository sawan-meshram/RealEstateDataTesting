package com.realestate.query;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.realestate.builder.Builder;
import com.realestate.builder.Field;
import com.realestate.util.BuilderUtil;
import com.realestate.validation.BuilderCompare;

public class TestQuery {

	private Map<Integer, Set<String>> propTypeTests = null;
	private Map<Integer, Set<String>> propStatusTests = null;
	private Map<Integer, Set<String>> derivedTypeTests = null;

	private List<Builder> originalBuilderList;
	private List<Builder> finalBuilderList;

	private Map<Integer, Builder> originalBuilderMap;
	private Map<Integer, Builder> finalBuilderMap;
	
	private Map<Integer, Map<Field, List<String>>> testFinalMap;

	public TestQuery(TestQueryBuilder builder) {
		this.originalBuilderList = builder.getOriginalBuilderList();
		this.finalBuilderList = builder.getFinalBuilderList();
		this.init();
	}

	private void init() {
		propTypeTests = new HashMap<>();
		propStatusTests = new HashMap<>();
		derivedTypeTests = new HashMap<>();

		testFinalMap = new HashMap<>();
		
		if (originalBuilderList.size() > 0) {
			originalBuilderMap = originalBuilderList.stream()
					.collect(Collectors.toMap(Builder::getIndex, Function.identity()));
		}
		if (finalBuilderList.size() > 0) {
			finalBuilderMap = finalBuilderList.stream()
					.collect(Collectors.toMap(Builder::getIndex, Function.identity()));
		}
	}

	public List<Builder> getOriginalBuilderList() {
		return originalBuilderList;
	}

	public List<Builder> getFinalBuilderList() {
		return finalBuilderList;
	}

	public TestQuery wrongPropType(int index, String... types) {
		Set<String> wrongTypeSet;
		if (propTypeTests.containsKey(index))
			wrongTypeSet = propTypeTests.get(index);
		else
			wrongTypeSet = new HashSet<>();

		for (String type : types) {
			wrongTypeSet.add(type);
		}
		propTypeTests.put(index, wrongTypeSet);

		return this;
	}

	public TestQuery wrongPropStatus(int index, String... status) {
		Set<String> wrongStatusSet;
		if (propStatusTests.containsKey(index))
			wrongStatusSet = propStatusTests.get(index);
		else
			wrongStatusSet = new HashSet<>();

		for (String val : status) {
			wrongStatusSet.add(val);
		}

		propStatusTests.put(index, wrongStatusSet);

		return this;
	}

	public TestQuery wrongDerivedType(int index, String... types) {
		Set<String> wrongTypeSet;
		if (derivedTypeTests.containsKey(index))
			wrongTypeSet = derivedTypeTests.get(index);
		else
			wrongTypeSet = new HashSet<>();

		for (String type : types) {
			wrongTypeSet.add(type);
		}

		derivedTypeTests.put(index, wrongTypeSet);
		return this;
	}

	public void test() {

	}
	
	public void testFinal() {
		/*
		 * Property Type
		 */
		if (propTypeTests.size() > 0) {
			for (Map.Entry<Integer, Set<String>> entry : propTypeTests.entrySet()) {
				
				List<String> bugs = BuilderCompare.testIfBugsRemoved.apply(originalBuilderMap.get(entry.getKey()).getType().getPropertyType(),
						finalBuilderMap.get(entry.getKey()).getType().getPropertyType(), entry.getValue());
				
				if(bugs.size() > 0) {
					BuilderUtil.addToTestFinalMap.accept(entry.getKey(), bugs, Field.P_TYPE, testFinalMap);
				}
			}
		}//eof if
		
		/*
		 * Property Status
		 */
		if (propStatusTests.size() > 0) {
			for (Map.Entry<Integer, Set<String>> entry : propStatusTests.entrySet()) {
				
				List<String> bugs = BuilderCompare.testIfBugsRemoved.apply(originalBuilderMap.get(entry.getKey()).getPropertyStatus(),
						finalBuilderMap.get(entry.getKey()).getPropertyStatus(), entry.getValue());
				
				if(bugs.size() > 0) {
					BuilderUtil.addToTestFinalMap.accept(entry.getKey(), bugs, Field.P_STATUS, testFinalMap);
				}
				
			}
		}//eof IF
		/*
		 * Derived Property Type
		 */
		if (derivedTypeTests.size() > 0) {
			for (Map.Entry<Integer, Set<String>> entry : derivedTypeTests.entrySet()) {
				
				List<String> bugs = BuilderCompare.testIfBugsRemoved.apply(originalBuilderMap.get(entry.getKey()).getType().getDerivedPropertyType(),
						finalBuilderMap.get(entry.getKey()).getType().getDerivedPropertyType(), entry.getValue());
				
				if(bugs.size() > 0) {
					BuilderUtil.addToTestFinalMap.accept(entry.getKey(), bugs, Field.D_TYPE, testFinalMap);
				}
			}
		}//eof IF
		
	}//testFinal
	
	public void showTestFinal() {
		//e Map<Integer, Map<Field, List<String>>> testFinalMap;
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<Integer, Map<Field, List<String>>> idxEntry : testFinalMap.entrySet()) {
			
			sb.append("Index : ").append(idxEntry.getKey()).append(" :: ");
			for(Map.Entry<Field, List<String>> fieldEntry : idxEntry.getValue().entrySet()) {
			
				sb.append("{ ").append(fieldEntry.getKey()).append(" :: ").append(fieldEntry.getValue()).append(" } ");
			}
			sb.append("\n");
		}
		if(sb.toString().length() == 0) {
			System.out.println("Test successfully");
			return;
		}
		System.out.println("=========== Bugs found on final csv ============");
		System.out.println(sb);
	}
}

