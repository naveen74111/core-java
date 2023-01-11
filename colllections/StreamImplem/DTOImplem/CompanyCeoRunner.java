package com.xworkz.colllections.StreamImplem.DTOImplem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.colllections.StreamImplem.DTO.CompanyCeoDto;
import com.xworkz.colllections.StreamImplem.DTO.DaughterDto;

public class CompanyCeoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DaughterDto daughter1 = new DaughterDto("Lakshmi", 649846382f, 25, false, true);
		DaughterDto daughter2 = new DaughterDto("saraswathi", 254894651f, 28, true, true);
		DaughterDto daughter3 = new DaughterDto("parvathi", 6584789613f, 26, false, true);
		DaughterDto daughter4 = new DaughterDto("usha", 654798635f, 30, true, false);
		DaughterDto daughter5 = new DaughterDto("geetanjali", 698745369f, 23, false, false);
		
		Collection<CompanyCeoDto> ceo = new ArrayList<CompanyCeoDto>();
		ceo.add(new CompanyCeoDto("Naveen", "tcs", 50, "india", "Engineering","no" ,daughter1));
		ceo.add(new CompanyCeoDto("sunil","imposys",49,"india","Engineering","no",daughter2));
		ceo.add(new CompanyCeoDto("prasad","infosys",64,"india","Engineering","no",daughter3));
		ceo.add(new CompanyCeoDto("hemanth","cgi",47,"india","Engineering","yes",daughter4));
		ceo.add(new CompanyCeoDto("vinit","soft tech",35,"india","Engineering","no",daughter5));
		
		ceo.stream().collect(Collectors.toList()).forEach(e->System.out.println(e));
		
		System.out.println(System.lineSeparator());
		ceo.stream().map(e->e.getDaughterDto().getName()).collect(Collectors.toList())
		.forEach(e->System.out.println(e));
	
		System.out.println(System.lineSeparator());
		ceo.stream()
		.filter(e->e.getAge()>49)
		.collect(Collectors.toList())
		.forEach(e->System.out.println(e));
		
		System.out.println(System.lineSeparator());
		ceo.stream().forEach(e->System.out.println("Father Age :"+e.getAge()+" "+"Daughter Age :" +e.getDaughterDto().getAge()));
	
	
	
	}
	

}
