class SuperMarket1
{

  static void getVegetables(String[] vegetables)
  {
  
  System.out.println("inside getVegetable()");
  System.out.println(" size of vegetable is " + vegetables.length);
  System.out.println("list of Vegetables are :");
  for(int index = 0; index < vegetables.length ; index++)
  {
  System.out.println(vegetables[index]);
  }
  System.out.println("end getVegetable()");
  
  }
  static void getPerfumes(String[] perfumes)
  {
	  
  System.out.println("inside getperfumes()");
  System.out.println(" size of perfumes is " + perfumes.length);
  System.out.println("list of perfumes are :");
  for(int index = 0; index < perfumes.length ; index++)
  {
  System.out.println(perfumes[index]);
  }
  System.out.println("end getperfumes()"); 
	  
  }
  
  static void getBiscuits(String[] biscuits)
  {
	  
  System.out.println("inside getBiscuits()");
  System.out.println(" size of biscuits is " + biscuits.length);
  System.out.println("list of biscuits are :");
  for(int index = 0; index < biscuits.length ; index++)
  {
  System.out.println(biscuits[index]);
  }
  System.out.println("end getBiscuits()"); 
	  
  }
   }