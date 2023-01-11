package com.xworkz.colllections.onetoanother;

import java.util.ArrayList;
import java.util.Collection;


public class Webseries {

	public static void main(String[] args) {
		
		System.out.println("Stroring One Collection to another Collection");
		
		Collection<String> collection = new ArrayList<String>();
		collection.add("Game of thrones");
		collection.add("Live Telecast");
		collection.add("Loki");
		collection.add("she hulk");
		collection.add("parampara");
		collection.add("money heist");
		collection.add("Dark");
		collection.add("Stranger things");

		
		for (String str :collection ) {
			System.out.println(str);
			
		}
		System.out.println(collection.size());
		
	}
}
