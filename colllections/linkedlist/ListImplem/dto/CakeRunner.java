package com.xworkz.colllections.linkedlist.ListImplem.dto;

import java.util.LinkedHashSet;
import java.util.Set;

public class CakeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CakeDto cake1 = new CakeDto("Chocolate", 200, "brown");
		CakeDto cake2 = new CakeDto("vennele", 300, "green");
		CakeDto cake3 = new CakeDto("hunny", 350, "red");
		CakeDto cake4 = new CakeDto("Strawberry", 400, "red");
		CakeDto cake5 = new CakeDto("fruit", 100, "orange");

		Set<CakeDto> dto = new LinkedHashSet<CakeDto>();
		dto.add(cake5);
		dto.add(cake4);
		dto.add(cake3);
		dto.add(cake2);
		dto.add(cake1);
		
		for (CakeDto cakeDto : dto) {
			System.out.println(cakeDto);
			System.out.println("Hashcode :  " + cakeDto.hashCode());
			System.out.println(System.identityHashCode(cakeDto));
		}
	}

}
