class ComputerTester
{

	public static void main(String Computer[])
	{
		System.out.println("main method is started");
		
		Computer.brand = "dell";
		Computer.color = "cilver";
		Computer.price = 50000.00;
		
		
		System.out.println(Computer.brand);
		System.out.println(Computer.color);
		System.out.println(Computer.price);
		
		Computer.onOrOff();
		Computer.onOrOff();
		
		
		System.out.println("main method is ended");
		
	}
	
}