class VesselTester{

	public static void main(String args[]){
	
	Vessel.setVesselId(80506903);	
	Vessel.setVesselName("ContainerShip");
	Vessel.setColor("White");
	Vessel.setPrice(190000.00);
		
	System.out.println(Vessel.getVesselId()+ " "+ Vessel.getVesselName()+ " " + Vessel.getColor()
						+ " " + Vessel.getPrice());	
		
		
	}

}