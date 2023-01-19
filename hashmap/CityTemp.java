package com.xworkz.colllections.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CityTemp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("Banglore", 28.0);
		map.put("Ballari", 33.3);
		map.put("mysore", 29.9);
		map.put("hubli", 48.0);
		map.put("vijaya nagara", 35.9);
		map.put("dharavad", 38.8);
		map.put("Udupi", 22.6);
		map.put("tumkuru", 21.3);
		map.put("manglore", 27.2);
		map.put("anatpur", 38.1);
		map.put("Hospete", 24.6);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.size());
		
		if (map.isEmpty()) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		Set<String> keys = map.keySet();
		keys.forEach(e->System.out.println(e));
		
		Collection<Double> values = map.values();
		for (Double doub: values) {
			System.out.println(doub);
		}
		
		Set<Entry<String,Double>> entries = map.entrySet();
		
		for (Entry<String, Double> entry : entries) {
			System.out.println("KeyName : "+entry.getKey()+"------------>"+" Key value : "+entry.getValue());
		}
	}
	
}