package com.xworkz.colllections.StreamImplem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> color =new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("green");
		color.add("yellow");
		color.add("brown");
		color.add("orange");
		color.add("purple");
		color.add("yellow");

		//Recieve Data
		System.out.println("---------Retrieve the data using forEach...");
		color.stream().forEach(e->System.out.println(e));

		//ToUppercase for list
		System.out.println("---------to uppercase for list");
		color
		.stream()
		.map((elem)->elem.toUpperCase())
		.collect(Collectors.toList())
		.forEach(e->System.out.println(e));

		//ToUppercase for set
		System.out.println("------------ToUppercase for Set");
		color.stream()
		.map(e->e.toUpperCase())
		.collect(Collectors.toSet())
		.forEach(e->System.out.println(e));
	
		System.out.println("-----------Ends with Using list");
		color.stream()
		.filter(element->element.endsWith("e"))
		.map(element->element.toUpperCase())
		.collect(Collectors.toList())
		.forEach(e->System.out.println(e));
	
		System.out.println("------------contains and index ");
		color.stream()
		.filter(ele->ele.endsWith("n"))
		.filter(ele->ele.contains("r"))
		.map(ele->ele.charAt(3))
		.collect(Collectors.toList())
		.forEach(e->System.out.println(e));
	
	
	
	
	
	
	
	
	
	}
}
