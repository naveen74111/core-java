class class Computer {

	static String brand ;
	static String color ;
	static double price ;
	static boolean  isOn ;
	
	public static boolean onOrOff()
	{
	    System.out.println("start inside onOrOff()");
		if(isOn == false)
		{
					isOn = true;
			System.out.println("Speaker is turned on...");
		
		}
		else if(isOn == true)
		{
			isOn =false;
			System.out.println("Speaker is turned off...");
			
		}
	
		System.out.println("end of onOrOff()");
		return isOn;
	}	

} {

	static String brand ;
	static String color ;
	static double price ;
	static boolean  isConnected ;
	
	public static boolean onOrOff()
	{
	    System.out.println("start inside onOrOff()");
		if(isConnected == false)
		{
					isConnected = true;
			System.out.println("Speaker is turned on...");
		
		}
		else if(isConnected == true)
		{
			isConnected =false;
			System.out.println("Speaker is turned off...");
			
		}
	
		System.out.println("end of onOrOff()");
		return isConnected;
	}	

}