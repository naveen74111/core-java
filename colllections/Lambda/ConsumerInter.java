package com.xworkz.colllections.Lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public abstract class ConsumerInter implements Functional1 {

	public static void main(String[] args) {
		
		Collection<Integer> collection = new ArrayList<Integer>();
		collection.add(1);
		collection.add(138);
		collection.add(63);
		collection.add(562);
		
		Consumer<Integer> consumer=(t)->
		{
			System.out.println(1);
		};
		
		collection.forEach((e)->System.out.println(e));
		
	}
}
