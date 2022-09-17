class BottleTester
{

	public static void main(String a[])
		{
			Bottle.bottleType = "plastic";
			Bottle.color = "black";
			Bottle.price = 50.00;
			
			Bottle.bottleType1 = "steel";
			Bottle.color1 = "cilver";
			Bottle.price1 = 150.00;
			
			Bottle.bottleType2 = "copper";
			Bottle.color2 = "brown";
			Bottle.price2 = 500.00;
			
			System.out.println(Bottle.bottleType);
			System.out.println(Bottle.color);
			System.out.println(Bottle.price);
			System.out.println("---------------------------");
			
			System.out.println(Bottle.bottleType1);
			System.out.println(Bottle.color1);
			System.out.println(Bottle.price1);
			System.out.println("---------------------------");
			
			System.out.println(Bottle.bottleType2);
			System.out.println(Bottle.color2);
			System.out.println(Bottle.price2);
			System.out.println("---------------------------");
		}
}
