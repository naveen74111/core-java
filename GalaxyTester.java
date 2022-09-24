class GalaxyTester{

	public static void main(String args[]){
	
	Galaxy.setGalaxyId(123456);	
	Galaxy.setGalaxyName("SamsungGalaxy");
	Galaxy.setColor("VioletBlue");
	Galaxy.setPrice(25000.00);
		
	System.out.println(Galaxy.getGalaxyId()+ " "+ Galaxy.getGalaxyName()+ " " + Galaxy.getColor()
						+ " " + Galaxy.getPrice());	
	
	}

}