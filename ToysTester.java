class ToysTester{

	public static void main(String args[]){
	
	Toys.setToysId(5345);	
	Toys.setToysName("ComboSetOfRangers");
	Toys.setColor("green");
	Toys.setPrice(2000.50);
		
	System.out.println(Toys.getToysId()+ " "+ Toys.getToysName()+ " " + Toys.getColor()
						+ " " + Toys.getPrice());	
		
		
	}

}