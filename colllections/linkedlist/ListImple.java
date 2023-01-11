package com.xworkz.colllections.linkedlist;

import java.util.LinkedList;

public class ListImple {

	public static void main(String[] args) {
		/*ArrayList<String> list = new ArrayList<String>();
							or						*/
		LinkedList<String> list =new LinkedList<>();
		list.add("Ballari");
		list.add("Hospete");
		list.add("Banglore");
		list.add("Manglore");
		list.add("Mysore");
		list.add("Hyderabad");
		
		System.out.println("----------------------ADD LIST--------------");
		
		list.add(1, "Gulbarga");
		for(String string: list)
		{
			System.out.println(string);
		}
		System.out.println("----------------------REMOVE LIST--------------");

		list.remove("Manglore");
		for (String string1 : list) {
			System.out.println(string1);
		}
		System.out.println("----------------------REPLACE LIST(set)--------------");

		list.set(2, "Humpi");
		for (String string3 : list) {
			System.out.println(string3);
		}
		System.out.println("----------------------get index of value--------------");

		String str = list.get(0);
		String str1 = list.get(2);
		String str2 = list.get(5);

		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);

	}
}
