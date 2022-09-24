class SuperMarket{

	static String superMarketName = "Reliance Mart";
	
	public  static void main(String a[])
	{
		System.out.println("Welcome to " + superMarketName );
		
		String vegetables[] ={"carot","tomato","mirchi","potato","lady's finger","beet root"};
		String perfumes[] = {"axe","fogg","sweetheart","park avenyu"};
		
		
		System.out.println("the size of vegetables is "+ vegetables.length);
		System.out.println("the size of perfumes is "+ perfumes.length);
		System.out.println("perfume section");
		for(int n = 0; n < perfumes.length; n++)
		{
			System.out.println(perfumes[n] + " ");
		}
		System.out.println("vegetable section");
		for(int v = 1; v < vegetables.length; v++)
		{
		System.out.println(vegetables[v] + " ");
		}		
	}
}
		