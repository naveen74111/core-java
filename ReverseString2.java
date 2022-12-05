package com.xworkz.taskapp.task;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stringInput;
		System.out.println("enter the string: ");
		Scanner sc= new Scanner(System.in);
		
		 stringInput=sc.nextLine();
		sc.close();
		
		String reversed = reverseString(stringInput);
		
		System.out.println("the reversed string is: "+reversed);
		
		
	}
	public static String reverseString(String s)
	{
		if(s.isEmpty())
			return s;
		return reverseString(s.substring(1))+s.charAt(0); //recursively called function
	}

}
