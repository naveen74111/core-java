package com.xworkz.colllections.linkedlist.ListImplem;

import java.util.ArrayList;


public class ListImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("Ballari");
		list.add("Hospete");
		list.add("Banglore");
		list.add("Mysore");
		list.add("Chitradurga");
		list.add("Belgavi");
		
		System.out.println("~~~~~~~~~~~~~~~~~~ADD LIST~~~~~~~~~~~~~~~~~~~~~~~~");
		list.add(1, "Hampi");
		list.add(2, "Manglore");
		list.add(4, "vijaya nagara");
		for (String string : list) {
			System.out.println("   ");
			System.out.println(string);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~REMOVE LIST~~~~~~~~~~~~~~~~~~~~~~~~");
		list.remove("Hampi");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~REPLACE LIST~~~~~~~~~~~~~~~~~~~~~~~~");
		list.set(0, "Shivmoga");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("---------------get index value--------------------");
		String str=list.get(4);
		String str1=list.get(1);
		System.out.println(str);
		System.out.println(str1);
	}

}
