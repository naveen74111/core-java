package com.xworkz.colllections.linkedlist.ListImplem;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListReverseorder {

	public static void main(String[] args) {
		List<String> set = new LinkedList<String>();
		set.add("BANGLORE");
		set.add("MANGLORE");
		set.add("MYSORE");
		set.add("GULBARGA");
		set.add("BIJAPUR");
		set.add("BALLARI");
		set.add("DELHI");
		set.add("BAGALKOT");
		set.add("KOLKATA");
		set.add("MUMBAI");
		
		System.out.println(set.size());
		for (String str : set) {
			System.out.println(str);
		}
		System.out.println("---------------Reverse Order----------------");
		ListIterator<String> itr = set.listIterator(set.size());
		
		while (itr.hasPrevious()) {
			String str = itr.previous();
			System.out.println(str);
		}

	}
}
