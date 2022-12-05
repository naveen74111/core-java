package com.xworkz.taskapp.task;

public class CountEvenOdd {
	
	static void countingEvenOdd(int arr[],int arr_size)
	{
		int even_count =0;
		int odd_count = 0;
		
		 // loop to read all the values in
        // the array
		for(int i=0;i<arr_size;i++)
		{
		
			 // checking if a number is
            // completely divisible by 2
			
			if((arr[i]&1)==1)
			{
				odd_count++;
			}
			else
			{
				even_count++;
			}
			System.out.println("Number of even"
							+"elements = "+even_count
							+"Number of odd elements = "
							+ odd_count);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,3,4,5,6};
		int n =arr.length;
		countingEvenOdd(arr,n);
	}

}
