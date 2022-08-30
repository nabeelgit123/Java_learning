package stringPrograms;

/*Q9 Write a program to remove all the duplicates from a give string.
Eg - Given String - SACHINTENDULKAR
OUTPUT - SCHITEDULKR
*/

public class StringProgram9 {
	public static void removeSameChar(String str) 
	
	{
		
		int length=str.length();// length of string
		
	    for (int i=0;i<length;i++)
	    {
	        int counter=0;
	        for (int j=0;j<length;j++)
	        {
	            
	            if (str.charAt(i)==str.charAt(j) && i!= j)//character should be equal and not on same position
	            {
	                counter++;
	             
	            }
	        }
	        if (counter==0)
	            System.out.print(str.charAt(i));
	    }

	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String string = "SACHINTENDULKAR";// given String
		
		 removeSameChar(string); // method to call removeSameChar
		 
		
		
		
	}

}
	