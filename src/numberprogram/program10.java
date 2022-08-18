package numberprogram;

/*Write a program to Print all the Numbers between 1-10 which is Prime Number,
  Odd Number and also an Armstrong Number.
*/

public class program10

{
	public static void isarmstrongList(int startOfRange, int endOfRange) {
		for (int i = startOfRange; i <= endOfRange; i++) 
		{
			int tempArm = i;
			int sum = 0;
			while (tempArm > 0)
			{
				int getNumberToCubed = tempArm % 10;
				sum += getNumberToCubed * getNumberToCubed * getNumberToCubed;
				tempArm = tempArm / 10;
			}

			if (sum == i)
			{
				System.out.println(+sum + " is armStrong");
			}
		}
	}

	public static void isOdd(int startOfRange, int endOfRange) {

		for (int i = startOfRange; i <= endOfRange; i++) 
		{
			if (i % 2 != 0) {
				System.out.println("odd no" + i);

			}
		}

	}

	public static void isPrime(int startOfRange, int endOfRange) {

		for (int i = startOfRange; i <= endOfRange; i++) 
		{
			int count = 0;
			for (int j = 1; j <= i; j++)
			{
				if (i % j == 0)
				{
					count++;
				}

			}
			if (count == 2) 
			{
				System.out.println("prime no " + i);

			}

		}
	}

	public static void callingIsPrimeIsOddIsArmstrong(int copyOfstartOfRange, int copyOfgivenEndRange) {
		System.out.println("list of Armstrong numbers");
		isarmstrongList(copyOfstartOfRange, copyOfgivenEndRange);
		System.out.println("list of Odd numbers");
		isOdd(copyOfstartOfRange, copyOfgivenEndRange);
		System.out.println("list of Prime numbers");
		isPrime(copyOfstartOfRange, copyOfgivenEndRange);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startOfRange = 1;
		int endOfRange = 10;
		System.out.println("the given range is " + startOfRange + "-" + endOfRange);
		callingIsPrimeIsOddIsArmstrong(startOfRange, endOfRange);
	}

}
