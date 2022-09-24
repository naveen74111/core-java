class EcommerceTester{

	public static void main (String args[]){
	
	Ecommerce.setProductId(45687);
	Ecommerce.setBuyingProductName("RoyalKit");
	Ecommerce.setSellingProductName("commutativeMaterial");
	Ecommerce.setTransactionOnInternet(1500.50d);
	
	System.out.println(Ecommerce.getProductId() + " "+ Ecommerce.getBuyingProductName()+" "
					+ Ecommerce.getSellingProductName() +" "+ Ecommerce.getTransactionOnInternet());
	
	} 






}