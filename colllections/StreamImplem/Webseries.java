package com.xworkz.colllections.StreamImplem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Webseries {

	public static void main(String[] args) {
		
		Collection<String> collect= new ArrayList<String>();
		collect.add("Live Telecast");
		collect.add("Loki");
		collect.add("GameOfThrones");
		collect.add("parampara");
		collect.add("moneyHeist");
		collect.add("Strnager things");
		collect.add("dark");
		collect.add("Rakan");

	System.out.println("------Stream implem........");
	
	Stream<String> stream =collect.stream();
	
	stream.filter(elem->{return elem.startsWith("d") &&
			elem.endsWith("k");}).collect(Collectors.toList())
	.forEach(ele->System.out.println(ele));
	
	System.out.println("-----------------------------------");
	collect.stream()
	.filter(ele->ele.endsWith("t"))
	.collect(Collectors.toList())
	.forEach(e->System.out.println(e));
	
	
	}
}
