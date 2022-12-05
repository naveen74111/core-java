package com.xworkz.taskapp.task;

public class ReverseString1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2.using charcter array
		
		String str="ABCD";
		String rev="";
		
	/*	char a[]=str.toCharArray();
		int len=a.length;//4
		
		for(int i=len-1;i>=0;i--)//3 2 1 0 -1
		{
			rev=rev+a[i];	//DCBA
		}
		System.out.println("Reversed String is:"+rev); */
	
	//3.using String Buffer class
		
		StringBuffer sb =new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
