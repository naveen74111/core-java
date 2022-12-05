package com.xworkz.taskapp.task;

public class MultiplesOfArray {

	static void mulsum(int arr[],int n,int N)
	{
		//store the sum
		int sum=0;
		
		//travese given array
		for(int i=0;i<n;i++)
		{
			//if current element multiple of array
			if(arr[i]%N==0)
			{
				sum= sum+ arr[i];
			}
		}
		//print the total sum
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,5,6};
		int n= arr.length;
		int N=5;//input number
		mulsum(arr,n,N);
	}

}
