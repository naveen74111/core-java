package com.xworkz.colllections.hashmap;

import java.util.Map;
import java.util.TreeMap;

public class CountryNamePresidentName {

	public static void main(String[] args) {

		Map<String, String> cP = new TreeMap<String, String>();

		cP.put("india", "droupadi murmu");
		cP.put("Rashiya", "puthin");
		cP.put("china", "jenping");
		cP.put("Bangladesh", "abdul hamid");
		cP.put("Belarus", "Alexander lukashenko");
		cP.put("Belgium", "philippe");
		cP.put("Brazil", "jair bolsonaro");
		cP.put("Canada", "charles 111");
		cP.put("Egypt", "abdel fattahel");
		cP.put("France", "Emmanuel marcron");
		cP.put("Germany", "frank walter");
		cP.put("greece", "katerina");
		cP.put("Iceland", "johanson");
		cP.put("Iran", "ali khamenei");
		cP.put("Iraq", "abdullatif rashid");
		cP.put("Israel", "isaac herzong");
		cP.put("Japan", "naruhito");
		cP.put("Mali", "assimi goita");
		cP.put("Mexico", "andres manuel lopez");
		cP.put("Myanmar", "myiint swe");

		System.out.println(cP.size());
	
		System.out.println(cP.keySet());
		cP.forEach((key,value)->{
			if(key.length()>5)
			{
				System.out.println("Keys :"+key+" "+"value :"+value);
			}
		});
	}
}
