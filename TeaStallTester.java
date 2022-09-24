class TeaStallTester{
	
	public static void main(String args[]){
	
	     TeaStall.setTeastallId(5678);
		 TeaStall.setContactNo(895647321L);
		 TeaStall.setName("Naveen T");
		 TeaStall.setAddress("bangolre");
		 
		 /*TeaStall.setContactNo(89456123789L);
	
		TeaStall.teaStallId = 5698;
		TeaStall.name = "Beereswara chaa Angadi"
		TeaStall.address = "Malleswaram";
		TeaStall.contactNo = 9567891234l;*/
		
		System.out.println(TeaStall.getTeastallId() +" " + TeaStall.getContactNo() +
		                 " " + TeaStall.getName() +" " + TeaStall.getAddress());
		
	
	
	
	}

}