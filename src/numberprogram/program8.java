package numberprogram;

//Write a program to Print the Armstrong Numbers from 50-1000.

public class program8 {
	public static void checkArmstrongBetweenRange(int givenStart, int givenEnd) {
		for (int i = givenStart; i <= givenEnd; i++)

		{
			int sum = 0;
			int tempNum = i;
			while (tempNum > 0)
			{
				int getNumberToCubed = tempNum % 10;
				sum += getNumberToCubed * getNumberToCubed * getNumberToCubed;
				tempNum = tempNum / 10;
			}
			if (sum == i) 
			{
				System.out.println("the given number " + i + " is armstrong");
			} 
			else
			{
				System.out.println("the number " + i + " is not armstrong");
			}
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int givenStartRange = 50;
		int givenEndRange = 1000;
		System.out.println("the aramstrong numbers from " + givenStartRange + "-" + givenEndRange);

		checkArmstrongBetweenRange(givenStartRange, givenEndRange);
	}

}
