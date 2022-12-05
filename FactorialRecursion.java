package com.xworkz.taskapp.task;

public class FactorialRecursion {

	static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
			else
			{
			return(n*factorial(n-1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i , fact=1;
		int number=5; //this is calculating factorial
		
		fact=factorial(number);
		System.out.println("Factorial Of "+number+"is"+fact);
	}

}
