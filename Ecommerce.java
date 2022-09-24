class Ecommerce
{
	static int productId;
	static String buyingProductName;
    static String sellingProductName; 
    static double transactionOnInternet;
 

	static void setProductId(int pId){
	productId = pId;
	}
	static int getProductId(){
	return productId;
	}
	static void setBuyingProductName(String productName){
	buyingProductName = productName;
	}
	static String getBuyingProductName(){
	return buyingProductName;
	}
	static void setSellingProductName(String productName){
	sellingProductName = productName;
	}
	static String getSellingProductName(){
	return sellingProductName;
	}
	static void setTransactionOnInternet(double amount){
	transactionOnInternet = amount;
	}
	static double getTransactionOnInternet(){
	return transactionOnInternet;
	}

}