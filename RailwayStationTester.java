class RailwayStationTester{

	public static void main(String args[]){
	
	RailwayStation.setRailGadiNum(602548);	
	RailwayStation.setRailGadiName("Ajmeer GaribNawaz Express");
	RailwayStation.setPlatformNum(2);
	RailwayStation.setRailColor("Brown Color");
	RailwayStation.setJunctionToJunction("KSR-Bengaluru City Junction --> BAY-Ballai Junction");
	RailwayStation.setTicketPrice(200.00);
		
	System.out.println(RailwayStation.getRailGadiNum()+ " "+ RailwayStation.getRailGadiName()+ " " 
	  + RailwayStation.getPlatformNum() + " " + RailwayStation.getRailColor() + " "
	  + RailwayStation.getJunctionToJunction()+ " " + RailwayStation.getTicketPrice());	
	
	}

}