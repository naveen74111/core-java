package com.xworkz.colllections.treeset;

import java.util.ArrayList;
import java.util.Collection;

public class Sweets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sw1="Laddu";
		String sw2="Gulab jamun";
		String sw3="Gilebee";
		String sw4="Jangree";
		String sw5="Halwa";
		String sw6="rasagulla";
		String sw7="kheer";
		String sw8="Cova";
		String sw9="peda";
		String sw10="Soan papdi";
		String sw11="Kesari baath";
		String sw12="Cool Cake";
		String sw13="venela creame";
		String sw14="dilpasan";
		String sw15="Karjikai";
		String sw16="Ravaball sweet";
		String sw17="Kajjaya";
	
		Collection<String> sw=new ArrayList<String>();
		sw.add(sw1);
		sw.add(sw2);
		sw.add(sw3);
		sw.add(sw4);
		sw.add(sw5);
		sw.add(sw6);
		sw.add(sw7);
		sw.add(sw8);
		sw.add(sw9);
		sw.add(sw10);
		sw.add(sw11);
		sw.add(sw12);
		sw.add(sw13);
		sw.add(sw14);
		sw.add(sw15);
		sw.add(sw16);
		sw.add(sw17);
		
		System.out.println("No Of Sweets:"+sw.size());
		
		sw.clear();
		System.out.println("After clear method");
		
		System.out.println("No Of Sweets: "+sw.size());
		
	}

}
