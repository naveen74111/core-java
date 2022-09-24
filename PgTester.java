class PgTester{

	public static void main(String args[]){
	
	Pg.setPgRoomNum(05);	
	Pg.setPgName("Gangotri->PG,For_Boys_and_Girls");
	Pg.setPgAddress("RajajiNagar,3rdStage,2ndCross,Banglore");
	Pg.setPgSharing("6->Sharing");
	Pg.setPgRent(5500.00);
		
	System.out.println(Pg.getPgRoomNum()+ " "+ Pg.getPgName()+ " " + Pg.getPgAddress()+ " " 
					 + Pg.getPgSharing()+ " "+ Pg.getPgRent());	
		
		
	}

}