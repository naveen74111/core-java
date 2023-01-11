package com.xworkz.colllections.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PdAndFees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> maps= new HashMap<String,Integer>();
		maps.put("Vijaya Lakshmi pg", 6000);
		maps.put("Manjunata pg", 5500);
		maps.put("Kumar pg", 4000);
		maps.put("Srinivas pg", 4000);
		maps.put("Raghavendra pg", 5000);
		maps.put("Golden villa pg", 4500);
		maps.put("Sri Durga pg", 6000);
		maps.put("guru Mata pg", 1000);
		
		Collection<String> keys = maps.keySet();
		for (String string : keys) {
			System.out.println("PG Names : "+string);
			
		}
		Collection<Integer> values =  maps.values();
		for (Integer integer : values) {
			System.out.println("PG Fees : "+integer);
		}
		
		Set<Entry<String,Integer>> entry = maps.entrySet();
		for (Entry<String, Integer> entry2 : entry) {
			System.out.println("PG Names : "+ entry2.getKey() +"----> "+"PG Fees : "+entry2.getValue());
		}
		System.out.println("Number Of The PG are :-"+maps.size());
	}

}
