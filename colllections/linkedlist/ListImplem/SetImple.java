package com.xworkz.colllections.linkedlist.ListImplem;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetImple {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<String>();
		set.add("Ballari");
		set.add("Banglore");
		set.add("Mumbai");
		set.add("kolkata");
		set.add("delhi");
		set.add("Hospete");

		System.out.println(set.size());

		for (String str : set) {
			System.out.println(str);
		}

	}
}
