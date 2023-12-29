package com.sathya.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;

public class Mapstuex {

	public static void main(String[] args) {
		Map<Integer,String > s1=new LinkedHashMap<>();
		
		s1.put(101,"ratan");
		s1.put(102,"anu");
		s1.put(103,"rari");
		s1.put(104,"ravi");
		s1.put(105,"raji");
		
Map<Integer,String > s2=new LinkedHashMap<>();
		
		s2.put(101,"cse");
		s2.put(102,"eee");
		s2.put(103,"mca");
		s2.put(104,"cse");
		s2
		.put(105,"ece");
		
		for (Map.Entry <Integer,String> ee : s2.entrySet()) {
			if ("cse".equals(ee.getValue())) {
				int k=ee.getKey();
				String v=s1.get(k);
				System.out.println(k+""+v);
				
				
				
			}
			
		}
	}

}
