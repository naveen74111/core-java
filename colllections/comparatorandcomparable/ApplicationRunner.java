package com.xworkz.colllections.comparatorandcomparable;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationDTO application1 = new ApplicationDTO("Eclipse", 11,true, "eclipse", 0.0);
		ApplicationDTO application2 = new ApplicationDTO("Turbo c++", 18,true, "Turbo", 0.0);
		ApplicationDTO application3 = new ApplicationDTO("Intelg idea", 13,true, "intel", 0.0);
		ApplicationDTO application4 = new ApplicationDTO("ms office", 12,false, "microsoft", 5000.0);
		ApplicationDTO application5 = new ApplicationDTO("ms office12", 16,false, "ms", 500.0);
		ApplicationDTO application6 = new ApplicationDTO("ms office20019", 2,false, "micro", 500.0);
		ApplicationDTO application7 = new ApplicationDTO("python", 11,true, "python", 0.0);
		ApplicationDTO application8 = new ApplicationDTO("python", 11,true, "Ate", 0.0);

		List<ApplicationDTO> app =new LinkedList<ApplicationDTO>();
		app.add(application1);
		app.add(application2);
		app.add(application3);
		app.add(application4);
		app.add(application5);
		app.add(application6);
		app.add(application7);
		app.add(application8);

		System.out.println("Sort element by ascending order...");
		app.stream().sorted().collect(Collectors.toList()).forEach(a->System.out.println(a));
		
		System.out.println("-------descending order--------");
		app.stream().sorted((a1,a2)->a2.getDevelopedBy().compareTo(a1.getDevelopedBy())).collect(Collectors.toList()).forEach(e->System.out.println(e));
	
		Comparator<ApplicationDTO> comparator=(a1,a2)->Boolean.compare(a1.getFree(),a2.getFree());
		
		System.out.println("free element ascending order if false....");
		app
		.stream()
		.filter(e->e.getFree()!=true)
		.sorted(comparator)
		.forEach(e->System.out.println(e));
	}

}
