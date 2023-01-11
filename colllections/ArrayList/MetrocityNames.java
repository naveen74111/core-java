package com.xworkz.colllections.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class MetrocityNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String c1="Banglore";
		String c2="Hyderabad";
		String c3="Chennai";
		String c4="Bombay";
		String c5="Telangana";
		
		Collection<String> cities= new ArrayList<String>();
		cities.add(c1);
		cities.add(c2);
		cities.add(c3);
		cities.add(c4);
		cities.add(c5);
		
		System.out.println(cities);
		
		System.out.println("-----------------for each------------");
		
		for(String ref:cities)
		{
			System.out.println(ref);
		}
		
		System.out.println("-----------------Iteretor------------");
		
		Iterator<String> ref=cities.iterator();
		while(ref.hasNext())
		{
			String element=ref.next();
			System.out.println(element);
		}
		
	}

}
