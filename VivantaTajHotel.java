class VivantaTajHotel
{
	public static void main (String a[])
	{
		String type = "5 star";
		String address ="banglore";
		String [] managerNames = {" akshata","lakshmi","sangeeta","ganesha","naveen"};
		int noOfManagers = 5;
	
		System.out.println("Welcome to Taj Vivanta Hotel");
		System.out.println("Destination"  + address);
		System.out.println("name of list managers"  );
		System.out.println("managers is " + noOfManagers );
		for(int m=0; m < managerNames.length; m++)
		{
			System.out.println(managerNames[m] + " ");
		}
			String foodMenu[] = {"chicken kabab","chicken lollipo","chiken tanduri","chicken biryani","chicken sukka","idli","vada","dose","puri","veg fied rice","puliogera","ghee rice","curd rice","lemon rice","jeera rice"};
			System.out.println("list of food items "  );
		for(int f=0; f < foodMenu.length; f++ )
		{
			System.out.println(foodMenu[f] +" ");
		}
	}	
}
