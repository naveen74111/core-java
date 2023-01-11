package com.xworkz.colllections.Lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public abstract class LambdaExpression implements FunctionalInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Anonymous class..........

		System.out.println("Ananymous Implemen.................");
		Collection<String> animal = new ArrayList<String>();
		animal.add("Dog");
		animal.add("Tiger");
		animal.add("Lion");
		animal.add("Cat");
		animal.add("Donkey");
		animal.add("Elephant");
		animal.add("Horse");

		System.out.println("Animal Size : " + animal.size());
		for (String str : animal) {
			System.out.println(str);
		}

		// Functional Interface
		System.out.println("Functional Imple.......");

		LambdaExpression govt = new LambdaExpression() {
			@Override
			public void test(int t, int y) {
				// TODO Auto-generated method stub
				System.out.println("Running test");
				System.out.println(t);
				System.out.println(y);
			}
		};
		govt.test(23, 64);
	
		//Lambda Expression 
		System.out.println("Lambda Expression.....");
	
		FunctionalInter lambda =(t,y)->{
			System.out.println("Lambda Expression");
			System.out.println(t);
			System.out.println(y);
		};
		lambda.test(45, 65);
		
		//Consumer interface only one arguments in the abstract method on functional interface.
		
		System.out.println("Consumer Interface........");
		Consumer<String> consumer=(e)->{
			System.out.println(e);
		};
		animal.forEach(consumer);
	}
}