package com.xworkz.taskapp.task;

public class Palindrome {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input1 =7007;
		String str_input1 = String.valueOf(input1); // .valueOf(variable) is used conveting int to string
		String str =new StringBuilder(str_input1).reverse().toString(); //reverse the input String
		
		if(str.equals(str_input1))//checking for palindrome..
		{
			System.out.println(input1+"is Palindrome");
		}
		else		
		{
			System.out.println(input1+" is not a Palindrome");
		}
	}

}
