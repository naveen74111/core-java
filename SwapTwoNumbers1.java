package com.xworkz.taskapp.task;

//without using third variable.......

public class SwapTwoNumbers1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=20, y=30;
		
		//print both numbers before swapping..
		System.out.println("before swapping..");
		System.out.println("x = "+x+",y = "+y);
		
			//logic
			x =	x+y;
			y = x-y;
			x = x-y;
		//printing the both numbers againg after swapping
			System.out.println("After Swapping..");
			System.out.println("x = "+x+",y = "+y);
	}

}
