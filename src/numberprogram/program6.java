package numberprogram;

// Write a program to print the factorial of numbers in the range of  10-30 (both inclusive).


public class program6 {
	public static void factorialBetweenRange(int start, int end)

	{

		for (int i = start; i <= end; i++)
		{
			double factorial = 1;
			for (int j = 1; j <= i; j++) 
			{
				factorial = factorial * j;

			}
			System.out.println("factorial of " + i + " is " + factorial);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rangeStart = 10;
		int rangeEnd = 30;
		factorialBetweenRange(rangeStart, rangeEnd);
	}

}
