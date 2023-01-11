package com.xworkz.colllections.StreamImplem.DTOImplem;


import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.colllections.StreamImplem.DTO.ApplicationDto;

public class ApplicationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationDto application1=new ApplicationDto("eclipse", 11.5, true, "eclipse", 0.0);
		ApplicationDto application2=new ApplicationDto("Turbo", 18.5, true, "eclipse", 0.0);
		ApplicationDto application3=new ApplicationDto("Intel idea", 11.7, true, "eclipse", 0.0);
		ApplicationDto application4=new ApplicationDto("Ms Office", 12.5, false, "microsoft", 500.0);
		ApplicationDto application5=new ApplicationDto("Ms Office12", 12.5, false, "ms", 500.0);
		ApplicationDto application6=new ApplicationDto("Ms Office2019", 2.5, false, "micro", 500.0);
		ApplicationDto application7=new ApplicationDto("python", 11.5, true, "python", 0.0);

		
		Collection<ApplicationDto> app = new LinkedList<ApplicationDto>();
		app.add(application1);
		app.add(application2);
		app.add(application3);
		app.add(application4);
		app.add(application5);
		app.add(application6);
		app.add(application7);

		app.stream()
		.filter(e->e.getFree() !=true && e.getDevelopedBy()=="microsoft" && e.getVersion()>12)
		.collect(Collectors.toList())
		.forEach(e->System.out.println(e));
		
		System.out.println("All Application.........");
		app.stream().forEach(e->System.out.println(e));
	}

}
