class Toys {

	static int toysId;
	static String toysName;
	static String toysColor;
	static double price;
	
	static void setToysId(int pId){
	toysId = pId;
	}
	static int getToysId(){
	
	return toysId;
	}
	static void setToysName(String tName){
	 toysName = tName;
	}
	static String getToysName(){
	
	return toysName ;
	}
	static void setColor(String cop){
	toysColor = cop;
	}
	static String getColor(){
	
	return toysColor;
	}
	static void setPrice(double toy){
	price = toy;
	}
	static double getPrice(){
	
	return price;	
	}
}