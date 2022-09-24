class Soil {

	static int soilIdNum;
	static String soilName;
	static String soilType;
	static String soilColor;
	
	static void setSoilId(int sId){
	soilIdNum = sId;
	}
	static int getSoilId(){
	
	return soilIdNum;
	}
	static void setSoilName(String sName){
	 soilName = sName;
	}
	static String getSoilName(){
	
	return soilName ;
	}
	static void setSoilType(String sType){
	 soilType = sType;
	}
	static String getSoilType(){
	
	return soilType ;
	}
	static void setSoilColor(String soc){
	soilColor = soc;
	}
	static String getSoilColor(){
	
	return soilColor;
	}

}