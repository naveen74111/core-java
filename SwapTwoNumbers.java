package com.xworkz.taskapp.task;

import java.util.Scanner;

public class SwapTwoNumbers {

	int a,b;
	
	public void swapNumber() 
	{
		int temp;
		temp=a;
		a=b;
		b=temp;
		
	
		//logic for swapping
//		temp=stn.a;
//		stn.a=stn.b;
//		stn.b=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating objct of the class
		SwapTwoNumbers stn= new SwapTwoNumbers();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First Number");
		stn.a=sc.nextInt();
		System.out.println("Enter the Second Number");
		stn.b=sc.nextInt();	
		
		stn.swapNumber();
		
		System.out.println("After swapping:a="+stn.a+",b="+stn.b);
		
	}

}
