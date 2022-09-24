class Furniture {

	static int furnitureId;
	static String furnitureName;
	static String color;
	static double price;
	
	static void setFurnitureId(int fId){
	 furnitureId= fId;
	}
	static int getFurnitureId(){
	
	return furnitureId;
	}
	static void setFurnitureName(String fName){
	 furnitureName = fName;
	}
	static String getFurnitureName(){
	
	return furnitureName ;
	}
	static void setColor(String cop){
	color = cop;
	}
	static String getColor(){
	
	return color;
	}
	static void setPrice(double money){
	price = money;
	}
	static double getPrice(){
	
	return price;	
	}
}
