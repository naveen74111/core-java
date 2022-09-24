class TeaStall{

	static int teaStallId ;
	static String name;
	static String address;
	static long contactNo;

	//setter and getter
	
	static void setTeastallId(int id)
	{
		teaStallId = id ;
		
	}
	static int getTeastallId()
	{
			return teaStallId;
			
	}
	static void setContactNo(Long cNo)
	{
		contactNo = cNo ;
			
	}
	static Long getContactNo()
	{
		return contactNo;
	}
	static void setAddress(String addr){
		address = addr;
	}
    static String getAddress(){
	 return address;
	}
	static void setName(String nm){
		name = nm;
	}
	static String getName(){
		return name;
	}
 
}