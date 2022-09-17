class Television1Tester
{

	public static void main(String Television[])
	{
		System.out.println("main method is started");
		
		Television1.brand = "sony";
		Television1.color = "black";
		Television1.price = 50000.00;
		
		
		System.out.println(Television1.brand);
		System.out.println(Television1.color);
		System.out.println(Television1.price);
		
		Television1.onOrOff();
		Television1.onOrOff();
		
		
		System.out.println("main method is ended");
		
	}
	
}