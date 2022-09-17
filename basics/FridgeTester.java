class FridgeTester
{

	public static void main(String fridge[])
		{
			Fridge.brandName = "LG";
			Fridge.color = "red";
			Fridge.price = 50000.00;
			
			Fridge.brandName0 = "SONY";
			Fridge.color0 = "cilver";
			Fridge.price0 = 70000.00;
			
			Fridge.brandName1 = "WIRLPOOL";
			Fridge.color1 = "brown";
			Fridge.price1 = 90000.00;
			
			Fridge.brandName2 = "GODREJ";
			Fridge.color2 = "maroon";
			Fridge.price2 = 88000.00;
			
			System.out.println(Fridge.brandName);
			System.out.println(Fridge.color);
			System.out.println(Fridge.price);
			System.out.println("------------------");
			
			System.out.println(Fridge.brandName0);
			System.out.println(Fridge.color0);
			System.out.println(Fridge.price0);
			System.out.println("------------------");
			
			System.out.println(Fridge.brandName1);
			System.out.println(Fridge.color1);
			System.out.println(Fridge.price1);
			System.out.println("------------------");
			System.out.println(Fridge.brandName2);
			System.out.println(Fridge.color2);
			System.out.println(Fridge.price2);
		}
}
