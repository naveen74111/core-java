package com.xworkz.colllections.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class SoftCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String soft1="tcs";
		String soft2="wipro";
		String soft3="cognizant";
		String soft4="capgemini";
		String soft5="ntt data";
		String soft6="facebook";
		String soft7="google";
		String soft8="firstAmerica";
		String soft9="global quest";
		String soft10="tata tech";
		String soft11="sandi tech";
		String soft12="jio";
		String soft13="paytm";
		String soft14="cgi tech";
		String soft15="infosys";
		String soft16="tantragyan";
		String soft17="Emphasis";
		String soft18="accuavate";
		String soft19="ibm";
		String soft20="hcl";
		
		Collection<String> company=new ArrayList<String>();
		company.add(soft20);
		company.add(soft19);
		company.add(soft18);
		company.add(soft17);
		company.add(soft16);
		company.add(soft15);
		company.add(soft1);
		company.add(soft2);
		company.add(soft3);
		company.add(soft4);
		company.add(soft5);
		company.add(soft6);
		company.add(soft7);
		company.add(soft8);
		company.add(soft9);
		company.add(soft14);
		company.add(soft13);
		company.add(soft12);
		company.add(soft11);
		company.add(soft10);
		
		for(String ref:company)
		{
			System.out.println(ref);
		}
		System.out.println("---------------------Iterator---------------");
		
		Iterator<String> soft=company.iterator();
	
		while(soft.hasNext())
		{
			String element=soft.next();
			System.out.println(element);
		}
		
	}

}
