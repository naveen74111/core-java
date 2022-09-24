class SoilTester{

	public static void main(String args[]){
	
	Soil.setSoilId(5599);	
	Soil.setSoilName("BaruduBhoomi");
	Soil.setSoilColor("OrangeEarth");
	Soil.setSoilType("ClaySoil");
		
	System.out.println(Soil.getSoilId()+ " "+ Soil.getSoilName()+ " " + Soil.getSoilColor()
						+ " " + Soil.getSoilType());	
	
	}

}