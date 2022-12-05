package com.xworkz.taskapp.task;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rev=0;
		Scanner sc= new Scanner(System.in);
//		int num=7007;
		System.out.println("Enter the number :");
		int num =sc.nextInt();
		int temp=num;
		
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		if(temp==rev)
		{
			System.out.println("Entered the number is palindrome..");
		}
		else
		{
			System.out.println("Entered the number is not a palindrome...");
		}
	}

}
