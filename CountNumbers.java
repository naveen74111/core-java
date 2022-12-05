package com.xworkz.taskapp.task;

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		int count =0;
		System.out.println("Enter the Number:");
		
		int num= sc.nextInt();
		
		while(num !=0) 
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of digits int the Enterd Integer are :  " +count );
	}

}
