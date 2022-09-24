class FurnitureTester{

	public static void main(String args[]){
	
	Furniture.setFurnitureId(5345);	
	Furniture.setFurnitureName("Sofa seat");
	Furniture.setColor("brown");
	Furniture.setPrice(1000.50);
		
	System.out.println(Furniture.getFurnitureId()+ " "+ Furniture.getFurnitureName()+ " " + Furniture.getColor()
						+ " " + Furniture.getPrice());	
		
		
	}

}