class PaintTester{

public static void main(String a[]){

	//Initialization through the  setter method
   Paint.setPaintId(1250);
   Paint.setBrandName("Asian");
   Paint.setColor("White");
   
   //Get the data to the getter method
   System.out.println(Paint.getPaintId() +" "+ Paint.getBrandName()+ " "+ Paint.getColor());


}




}