class Pg {

	static int pgRoomNum;
	static String pgName;
	static String pgAddress;
	static String pgSharing;
	static double pgRent;
	
	static void setPgRoomNum(int pgNum){
	pgRoomNum = pgNum;
	}
	static int getPgRoomNum(){
	
	return pgRoomNum;
	}
	static void setPgName(String pgHesaru){
	 pgName = pgHesaru;
	}
	static String getPgName(){
	
	return pgName ;
	}
	static void setPgAddress(String area){
	pgAddress = area;
	}
	static String getPgAddress(){
	
	return pgAddress;
	}
	static void setPgSharing(String sharingOfPg){
	pgSharing = sharingOfPg;
	}
	static String getPgSharing(){
	
	return pgSharing;
	}
	static void setPgRent(double rent){
	pgRent = rent;
	}
	static double getPgRent(){
	
	return pgRent;	
	}
}