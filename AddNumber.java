package com.xworkz.taskapp.task;

public class AddNumber {
	
	static int sum(int a , int b) {
		//interacitng until there is nocarry
		while(b!= 0) {
			
			//using AND operator
			int carry =a & b;
			
			//using OR operator
			
			a= a^b;
			
			 // Shifting the carry by one so that
            // adding it to the integer 'a'
            // gives the desired output
			b=carry<<1;	
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 // Print the sum of custom integer numbers to be
        // summed up passed as an arguments
		System.out.println(sum(5,10));
	}

}
