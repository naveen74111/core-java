package com.xworkz.taskapp.task;

public class OddOrEven {

	//Number is Even
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=100;
		
		// Condition check
        // if n|1 if greater than n then this number is even
        if ((n | 1) > n) {
        	System.out.println("Number is EVEN");
        }
        else
        {
        	System.out.println("Number is ODD");
        }
	}

}
