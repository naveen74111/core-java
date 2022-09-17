class User2{
 	 static String user;
     static boolean isAlive ;
	 static long contactNo ;
	 static double price ;
	 static char ch;

//local variables, static variable, instance variable , parameter

public static void main (String a[]){
	
	

	System.out.println("main started");
	System.out.println(" variable before initialization");

	System.out.println(user );
	System.out.println(isAlive);
	System.out.println(contactNo );
	System.out.println(price );
	System.out.println(ch );
	
	isAlive = true;
	contactNo = 1234567890; 
	price = 4562.00;
	ch ='a';

	System.out.println(user );
     System.out.println(isAlive);
	System.out.println(contactNo );
	System.out.println(price );
	System.out.println(ch );
	System.out.println("main ended");

}
}
      