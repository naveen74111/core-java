package com.xworkz.colllections.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String animals1="Dog";
		String animals2="cat";
		String animals3="tiger";
		String animals4="lion";
		String animals5="elephant";
		String animals6="horse";
		String animals7="camel";
		String animals8="snake";
		String animals9="eegel";
		String animals10="heppotatomus";
		
		//Boxing
		
		Collection<String> animal= new ArrayList<String>();
		animal.add(animals10);
		animal.add(animals9);
		animal.add(animals8);
		animal.add(animals7);
		animal.add(animals6);
		animal.add(animals5);
		animal.add(animals4);
		animal.add(animals3);
		animal.add(animals2);
		animal.add(animals1);
		
		//Un-Boxing
		for (String ref:animal) {
			System.out.println(ref);
		}
		
		System.out.println("----------------Iterator------------");
		
		
		Iterator<String>ref=animal.iterator();
		
		while(ref.hasNext())
		{
			String element=ref.next();
			System.out.println(element);
		}
	}

}
