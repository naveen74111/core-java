package com.xworkz.colllections.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String watch1="hmt";
		String watch2="rolex";
		String watch3="titan";
		String watch4="fastrak";
		String watch5="timex";
		String watch6="boat smart watch";
		String watch7="mi smartwatch";
		String watch8="fodg watch";
		String watch9="flex watch";
		String watch10="wrist watch";
		
		Collection<String> watch=new ArrayList<String>();
		watch.add(watch10);
		watch.add(watch9);
		watch.add(watch8);
		watch.add(watch7);
		watch.add(watch6);
		watch.add(watch5);
		watch.add(watch4);
		watch.add(watch3);
		watch.add(watch2);
		watch.add(watch1);
				
		for(String ref:watch)
		{
			System.out.println(ref);
		}
		System.out.println("-------------Iterator------------");
		
		Iterator<String> ref=watch.iterator();
		
		while(ref.hasNext())
		{
			String element=ref.next();
			System.out.println(element);
		}
	}

}
