class Vessel {

	static int vesselId;
	static String vesselName;
	static String vesselColor;
	static double price;
	
	static void setVesselId(int vId){
	vesselId = vId;
	}
	static int getVesselId(){
	
	return vesselId;
	}
	static void setVesselName(String vName){
	 vesselName = vName;
	}
	static String getVesselName(){
	
	return vesselName ;
	}
	static void setColor(String cov){
	vesselColor = cov;
	}
	static String getColor(){
	
	return vesselColor;
	}
	static void setPrice(double vPrice){
	price = vPrice;
	}
	static double getPrice(){
	
	return price;	
	}
}