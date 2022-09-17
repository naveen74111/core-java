class Cricket{

	public static void main(String cricket[]){
	
		int rihitHighestScore = 264;       //declare and init
		int sachinHighestScore = 200;
		int mandanaHighestScore = 132;
		int ackerrHighestScore = 232;
		int bjClerkHighestScore =229;
		
		int highestScores[] ={rihitHighestScore,sachinHighestScore,
		mandanaHighestScore,ackerrHighestScore,bjClerkHighestScore};
		


		//variable returned from array element
		
		int ref4 = highestScores[4];
		int ref0 = highestScores[0];
		int ref2 = highestScores[2];
		int ref3 = highestScores[3];
		int ref1 = highestScores[1];
		
			System.out.println("Element at an Index 4 "+ ref4);
			System.out.println("Element at an Index 0 "+ ref0);
			System.out.println("Element at an Index 2 "+ ref2);
			System.out.println("Element at an Index 3 "+ ref3);
			System.out.println("Element at an Index 1 "+ ref1);
			
			//length is a property of an array
			System.out.println("the length of the HighestScores is  "+ highestScores.length);
			
			//for loop
			for(int index=0; index<highestScores.length; index++)
			{
				int ref = highestScores[index];
				System.out.println("Element at index " +index+ ref);
			}
	}
}