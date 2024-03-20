package com.collectionnew;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
	
		Map<String, String> m=new HashMap<String, String>();
		m.put("TestPlan", "Test Lead");
		m.put("TestCases", "Tester");
		m.put("TestData", "Tester");
		m.put("TestStrategy", "Project Manager");
		m.put("SRS", "BA");
		m.put(null, null);
		m.put(null, "Test");
		m.put("QA", null);
		
		m.forEach((k,v)->{
			System.out.println(k+" : "+v);
		});
	
	}
	

}
