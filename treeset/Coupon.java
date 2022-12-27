package com.xworkz.colllections.treeset;

import java.util.Collection;
import java.util.TreeSet;

public class Coupon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String c1 = "Amazon";
		String c2 = "flipkart";
		String c3 = "zomato";
		String c4 = "Swiggy";
		String c5 = "jio";
		String c6 = "myntra";
		String c7 = "airtel";
		String c8 = "VI";
		String c9 = "Ajio";
		String c10 = "Recharge Coupon";
		String c11 = "Food Coupon";
		String c12 = "Cash Coupon";
		
		Collection<String> cp =new TreeSet<String>();
		cp.add(c12);
		cp.add(c11);
		cp.add(c10);
		cp.add(c9);
		cp.add(c8);
		cp.add(c7);
		cp.add(c6);
		cp.add(c5);
		cp.add(c4);
		cp.add(c3);
		cp.add(c2);
		cp.add(c1);
				
		System.out.println("No Of Coupons:"+ cp.size());
		
		cp.clear();
		
		System.out.println("After clear metod");
		
		System.out.println("No Of Coupons:"+ cp.size());
	}

}
