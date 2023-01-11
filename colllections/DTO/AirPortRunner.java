package com.xworkz.colllections.DTO;

import com.xworkz.colllections.DTO.DTOExample.AirportDto;

public class AirPortRunner {

	public static void main(String[] args) {

		AirportDto airport1 = new AirportDto("KEMPE-GOWDA", "Banglore", 350);
		AirportDto airport2 = new AirportDto("KEMPE-GOWDA", "Hyderbad", 300);
		AirportDto airport3 = new AirportDto("Rajiv Gandhi", "Delhi", 350);
		AirportDto airport4 = new AirportDto("chatrapathi shivaji", "mumbai", 400);
		AirportDto airport5 = new AirportDto("thiruvendram", "thiruvendram", 350);
		AirportDto airport6 = new AirportDto("Rajiv Gandhi", "Delhi", 350);

		boolean result = airport1.getName().equals(airport2.getName());
		System.out.println(result);

		boolean result1 = airport1.getName().equals(airport3.getName());
		System.out.println(result1);
		boolean result2 = airport1.getName().equals(airport4.getName());
		System.out.println(result2);
		boolean result3 = airport1.getName().equals(airport5.getName());
		System.out.println(result3);
		boolean result4 = airport3.getName().equals(airport6.getName());
		System.out.println(result4);

	}

}
