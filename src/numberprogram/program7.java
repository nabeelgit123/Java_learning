package numberprogram;
/*Write a program to print if the given number is an Armstrong number or not.
 The method should return the value and print it in main().
  */
public class program7 {

	public static boolean isArmstrong(int givenNumber)

	{
		
		
		int length = 0;
		int tempForLength=givenNumber ;
		int tempForCube=givenNumber ;
		while (tempForLength > 0) 
		{
			length++;
			tempForLength = tempForLength / 10;
		}
		int getSingleDigit = 0;
		int sum = 0;
		while (tempForCube > 0)
		{
			int storeMulti = 1;
			getSingleDigit = tempForCube % 10;
			for (int j = 1; j <= length; j++) 
			{
				storeMulti = storeMulti * getSingleDigit;
			}
			sum = sum + storeMulti;
			tempForCube = tempForCube / 10;
		}
		if (sum == givenNumber) 
		{
			
			return (true);
		}
		else 
		{
			return (false);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberToBeChecked = 153;
		if (isArmstrong(numberToBeChecked)) 
		{
			System.out.println("the number " + numberToBeChecked + " is armstrong");
		} 
		else
		{
			System.out.println("the number " + numberToBeChecked + " is not armstrong");
		}
	}

}
