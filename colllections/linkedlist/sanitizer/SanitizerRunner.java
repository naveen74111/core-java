package com.xworkz.colllections.linkedlist.sanitizer;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.colllections.linkedlist.sanitizer.DTO.SanitizerDTO;


public class SanitizerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SanitizerDTO sanitaizer1 = new SanitizerDTO(1,"Detol",100d,"red");
		SanitizerDTO sanitaizer2 = new SanitizerDTO(2,"Savlon",150d,"blue");
		SanitizerDTO sanitaizer3 = new SanitizerDTO(3,"Lifeboy",60d,"red");
		SanitizerDTO sanitaizer4 = new SanitizerDTO(4,"Sterillium",120d,"orange");
		SanitizerDTO sanitaizer5 = new SanitizerDTO(5,"godrej",120d,"white");
		SanitizerDTO sanitaizer6 = new SanitizerDTO(6,"Douber",170d,"red");
		SanitizerDTO sanitaizer7 = new SanitizerDTO(7,"Multani",120d,"pink");
		SanitizerDTO sanitaizer8 = new SanitizerDTO(8,"Corvil",90d,"yellow");
		SanitizerDTO sanitaizer9 = new SanitizerDTO(9,"Trust",1300d,"blue");
		SanitizerDTO sanitaizer10 = new SanitizerDTO(10,"DCM Shirram",200d,"White");
		SanitizerDTO sanitaizer11 = new SanitizerDTO(11,null,22d,null);
		
		Collection<SanitizerDTO> dto = new LinkedList<SanitizerDTO>();
		dto.add(sanitaizer10);
		dto.add(sanitaizer9);
		dto.add(sanitaizer8);
		dto.add(sanitaizer7);
		dto.add(sanitaizer6);
		dto.add(sanitaizer5);
		dto.add(sanitaizer4);
		dto.add(sanitaizer3);
		dto.add(sanitaizer2);
		dto.add(sanitaizer1);
		dto.add(sanitaizer11);
		
		System.out.println(dto);
	
		for(SanitizerDTO element:dto)
		{
			if(element.price>100)
			{
				System.out.println("price is greater then 100 : " + element);
				
			}
		}
		
		for(SanitizerDTO element : dto)
		{
			if(element.color==null)
			{
				System.out.println("null" + element);
			}
			else
			{
				System.out.println("There is no null values given List : " + element);
			}
		}
		
		Iterator<SanitizerDTO> removeDto = dto.iterator();
		while(removeDto.hasNext())
		{
			SanitizerDTO element = removeDto.next();
			if(element.color == "red")
			{
				removeDto.remove();
				System.out.println("Removed color in red "+ element);
			}
		}
		System.out.println(dto);
	
		
		SanitizerDTO sanitaizer=dto.stream().max(Comparator.comparing(SanitizerDTO::getPrice)).get();
		
		System.out.println("Maximum Price : " + sanitaizer);
	
		SanitizerDTO sani= dto.stream().min(Comparator.comparing(SanitizerDTO::getPrice)).get();
		System.out.println("Minimum Price is : " + sani);
	
	}

}
