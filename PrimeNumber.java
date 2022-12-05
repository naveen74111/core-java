package com.xworkz.taskapp.task;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using forloop
//		int num =1;
//		boolean flag =false;
//		for(int i=2;i<=num;i++) 
//		{
//			//condition for non prime number
//			if(num% i==0)
//			{
//				flag=true;
//				break;
//			}
//		}
//		if(!flag)
//		{
//			System.out.println(num + "is aPrime Number: ");
//		}
//		else {
//			System.out.println(num+"is not a prime number: ");
//		}
		
		//using whileloop
		
		 int num = 5, i = 2;
		    boolean flag = false;
		    while (i <= num / 2) {
		      // condition for nonprime number
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }

		      ++i;
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number");
		    else
		      System.out.println(num + " is not a prime number");
		  
	}

}
