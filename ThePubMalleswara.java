class ThePubMalleswara
{
	public static void main(String a[])
	{
		String Type = "4 star";
		String address ="17th cross , milk colony ,subramanya nagar,2 state malleswaram, bengaluru";
		String managerNames[] ={"manoj kumar","mickel","manju","mahesh"};
		int noOfManager =4;
		int availableItems= 17;
		
		System.out.println("Welcome to ThePubMalleswara  ");
		System.out.println("Destination:- "  + address);
		System.out.println("-----------name of list managers-----------"  );
		System.out.println("managers is :- " + noOfManager );
		for(int m = 0; m < managerNames.length; m++)
		{
			System.out.println(managerNames[m] + "foodMenu ");
		}
		String foodMenu[] = {"King fisher Drught beer","cheese cherry pinaple","tandoori chicken",
		"mocktail","Tequila","chiken lollipop","French chicken","peaunut masala","chilli chicken",
		"potato basket of french fries","Anjal fry","baby corn manchuriyan","bakardi lemon ",
		"chicken ghee roast","Whiskey","American spicy corn","paneer tikka"};
		System.out.println("-------list of food items-------");
		System.out.println("FOOD LIST IS :- " + availableItems);
		for(int f = 0; f < foodMenu.length; f++)
		{
			System.out.println( foodMenu[f] +" ");
		}
	}
}