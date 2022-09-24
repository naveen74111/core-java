class EmporiumHotel
{
	public static void main(String a[])
	{
		String Type = "4.1 Star";
		String address = "Brigade Rd,Shantala Nagar,Ashok Nagar,Bengaluru,karnataka";
		String [] managerNames = {"Akhil","mohan","sweta","manju","vinay","kumar",};
		int noOfManagers = 6 ;
		int  foodList = 17;
		
		System.out.println("Welcome to Emporium Hotel");
		System.out.println("Destination:- "  + address);
		System.out.println("-----------name of list managers-----------"  );
		System.out.println("managers is :- " + noOfManagers );
		for(int e = 0; e < managerNames.length; e++)
		{
			System.out.println(managerNames[e] + "foodMenu ");
		}
		String foodMenu[] = {"roti","chapati","chicken kabab","chicken lollipo","chiken tanduri","chicken biryani","chicken sukka","idli","vada","dose","puri","veg fied rice","puliogera","ghee rice","curd rice","lemon rice","jeera rice"};
		System.out.println("-------list of food items-------");
		System.out.println("FOOD LIST IS :- " + foodList);
		for(int f = 0; f < foodMenu.length; f++)
		{
			System.out.println( foodMenu[f] +" ");
		}
	}
}
	