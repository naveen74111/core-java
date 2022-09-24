class RailwayStation {

	static int railGadiNum;
	static String railGadiName;
	static int platformNum;
	static String railColor;
	static String junctionToJunction;
	static double ticketPrice;
	
	static void setRailGadiNum(int railIdNum){
	railGadiNum = railIdNum;
	}
	static int getRailGadiNum(){
	
	return railGadiNum;
	}
	static void setRailGadiName(String railName){
	 railGadiName = railName;
	}
	static String getRailGadiName(){
	
	return railGadiName ;
	}
	static void setPlatformNum(int railPNum){
	platformNum = railPNum;
	}
	static int getPlatformNum(){
	
	return platformNum;
	}
	static void setRailColor(String rColor){
	railColor = rColor;
	}
	static String getRailColor(){
	
	return railColor;
	}
	static void setJunctionToJunction(String location){
	 junctionToJunction = location;
	}
	static String getJunctionToJunction(){
	
	return junctionToJunction ;
	}
	static void setTicketPrice(double tPrice){
	ticketPrice = tPrice;
	}
	static double getTicketPrice(){
	
	return ticketPrice;	
	}
}