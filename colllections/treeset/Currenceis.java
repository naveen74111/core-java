package com.xworkz.colllections.treeset;

import java.util.Collection;
import java.util.TreeSet;

public class Currenceis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String c1="Indian Rupees";
		String c2="US Dollers";
		String c3="Stilank Rupees";
		String c4="Pakistan Rupees";
		String c5="Bealarus Rubel";
		String c6="Bermuda Dollars";
		String c7="Brazil real";
		String c8="Egypt pound";
		String c9="Honkong Doller";
		String c10="Iceland Crona";
		String c11="iran real";
		String c12="japan yen";
		String c13="Khazakasten tenge";
		String c14="Korea won";
		String c15="malasia rengith";
		String c16="mexico peso";
		String c17="nepal rupees";
		String c18="oman real";
		String c19="philipene reso";
		String c20="poland zloty";
		String c21="rusia rubel";
		String c22="soudi aribiya riayal";
		String c23="singapur doller";
		String c24="uk pound";
		String c25="vietnum dong";
		
		Collection <String> curr=new TreeSet<String>();
		curr.add(c1);
		curr.add(c2);
		curr.add(c3);
		curr.add(c4);
		curr.add(c5);
		curr.add(c6);
		curr.add(c7);
		curr.add(c8);
		curr.add(c9);
		curr.add(c10);
		curr.add(c11);
		curr.add(c12);
		curr.add(c13);
		curr.add(c14);
		curr.add(c15);
		curr.add(c16);
		curr.add(c17);
		curr.add(c18);
		curr.add(c19);
		curr.add(c20);
		curr.add(c25);
		curr.add(c24);
		curr.add(c23);
		curr.add(c22);
		curr.add(c21);
		
		System.out.println("no of currencies:"+curr.size());
		
		curr.clear();
		
		System.out.println("After clear method");
		
		System.out.println("no of currencies"+curr.size());
	}

}
