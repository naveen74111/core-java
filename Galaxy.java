class Galaxy {

	static int galaxyId;
	static String galaxyName;
	static String color;
	static double price;
	
	static void setGalaxyId(int gId){
	galaxyId = gId;
	}
	static int getGalaxyId(){
	
	return galaxyId;
	}
	static void setGalaxyName(String gName){
	 galaxyName = gName;
	}
	static String getGalaxyName(){
	
	return galaxyName ;
	}
	static void setColor(String gc){
	color = gc;
	}
	static String getColor(){
	
	return color;
	}
	static void setPrice(double galaxyPrice){
	price = galaxyPrice;
	}
	static double getPrice(){
	
	return price;	
	}
}