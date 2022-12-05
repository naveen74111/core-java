package com.xworkz.taskapp.task;

public class SubtractNumber {

	static int subtract(int x,int y) {
		
		while(y !=0) {
			// borrow contains common
	        // set bits of y and unset
	        // bits of x
			int borrow =(~x) & y;
			
			 // Subtraction of bits of x
	        // and y where at least one
	        // of the bits is not set
			x=x^y;
			
			// Borrow is shifted by one
	        // so that subtracting it from
	        // x gives the required sum
			y=borrow << 1;
		}
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=30 ; int y= 15;
		System.out.println("x-y is"+subtract(x,y));
	}

}
