package com.xworkz.colllections.comparatorandcomparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class MovieDTORunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<MovieDTO> movies = new ArrayList<MovieDTO>();
		
		movies.add(new MovieDTO("Avatar", 100, LocalDate.of(2022, 12, 16), "English", 250));
		movies.add(new MovieDTO("veda", 50, LocalDate.of(2022, 12, 28), "Kannada", 300));
		movies.add(new MovieDTO("Kranthi", 200, LocalDate.of(2023, 2, 12), "Kannada", 250));
		movies.add(new MovieDTO("Kantara", 75, LocalDate.of(2022, 10, 20), "Kannada", 200));
		movies.add(new MovieDTO("Avatar", 100, LocalDate.of(2022, 12, 16), "English", 250));
		movies.add(new MovieDTO("Kgf", 200, LocalDate.of(2021, 10, 10), "Kannada", 200));
		movies.add(new MovieDTO("Kgf2", 250, LocalDate.of(2022, 11, 16), "Kannada", 250));
	
		System.out.println("---------------Movies in ascendeng order.....");
		
		movies
		.stream()
		.sorted()
		.forEach(ref->System.out.println(ref));
		
		System.out.println("----------------Movies in descending oreder.....");
		
		movies
		.stream()
		.sorted((a1,a2)->a2.getName().compareTo(a1.getName()))
		.collect(Collectors.toList())
		.forEach(e->System.out.println(e));
		
		System.out.println("-----------------Name and Local Language will print..");
		
		movies
		.stream()
		.map(e->e.getName()+"=".concat(e.getLanguage()))
		.sorted()
		.collect(Collectors.toList())
		.forEach(e->System.out.println(e));
		
		System.out.println("--------------------name and budget");
	
		movies
		.stream().filter(e->{
			if(e.getName().equals(e.getName()) && e.getBudget()==e.getBudget()) {
				return true;
			}
			return false;
		})
		.sorted().collect(Collectors.toList())
		.forEach(e->System.out.println("name :"+ e.getName() +"       " + "budget :"+e.getBudget()));	
	}

}
