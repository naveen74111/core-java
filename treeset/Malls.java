package com.xworkz.colllections.treeset;

import java.util.Collection;
import java.util.TreeSet;

public class Malls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mall1="lulu mall";
		String mall2="orian mall";
		String mall3="GT Mall";
		String mall4="Mantri mall";
		String mall5="nexes mall";
		String mall6="Garuda mall";
		String mall7="phenix mall";
		String mall8="gopalan mall";
		String mall9="ub city";
		String mall10="orian avenue mall";
		String mall11="Esteem mall";
		String mall12="ETA namma mall";
		String mall13="Elements mall";
		String mall14="Banglore central mall";
		String mall15="lido mall";
		String mall16="Toratal mall";
		String mall17="jaivaika mall";
		String mall18="vaishnavi mall";
		String mall19="menakshi mall";
		String mall20="vegacity mall";
		String mall21="Ascenders park square mall";
		String mall22="brookefield mall";
		String mall23="fastrack mall";
		String mall24="vr benglore";
		String mall25="nexus shantiniketan mall";
		String mall26="golden heights mall";
		String mall27="forum mall";
		String mall28="central mall";
		String mall29="viva mall";
		String mall30="palace mall";
		
		Collection<String> collect=new TreeSet<String>();
		collect.add(mall30);
		collect.add(mall29);
		collect.add(mall28);
		collect.add(mall27);
		collect.add(mall26);
		collect.add(mall25);
		collect.add(mall24);
		collect.add(mall23);
		collect.add(mall22);
		collect.add(mall21);
		collect.add(mall20);
		collect.add(mall19);
		collect.add(mall18);
		collect.add(mall17);
		collect.add(mall16);
		collect.add(mall15);
		collect.add(mall14);
		collect.add(mall13);
		collect.add(mall12);
		collect.add(mall11);
		collect.add(mall10);
		collect.add(mall9);
		collect.add(mall8);
		collect.add(mall7);
		collect.add(mall6);
		collect.add(mall5);
		collect.add(mall4);
		collect.add(mall3);
		collect.add(mall2);
		collect.add(mall1);
		
		
		System.out.println("no of malls:"+collect.size());
		
		collect.clear();
		
		System.out.println("After clear method");
		
		System.out.println("no of malls:"+collect.size());
	}

}
