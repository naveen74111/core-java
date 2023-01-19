package com.xworkz.colllections.hashmap;

import java.util.Map;
import java.util.TreeMap;

public class Players {

	public static void main(String[] args) {

		Map<String,Integer> player = new TreeMap<String,Integer>((e1,e2)->e2.compareTo(e1));
		player.put("virat", 100000);
		player.put("boomra", 30000);
		player.put("kapil dev", 100000);
		player.put("sachin", 90000);
		player.put("archar",50000);
		player.put("rohan", 1100000);
		player.put("bhooshan", 6000);

		player.forEach((e1,e2)->System.out.println(e1+e2));
		System.out.println(System.lineSeparator());
	}

}
