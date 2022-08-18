package numberprogram;
/*Write a program to Print if the given Number is a Prime Number or Not.
 The method should return the value and print it in main().
 */

public class program2 {

	static boolean isPrime(int parameterPassed) {
		int flag = 0;
		for (int i = 1; i <= parameterPassed; i++) 
		{
			if (parameterPassed % i == 0)
			{
				flag++;
			}

		}
		if (flag == 2) 
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
		int numberToBeChecked = 4;
		if (isPrime(numberToBeChecked))
		{
			System.out.println("The number :" + numberToBeChecked + " is prime number");
		} 
		else
		{
			System.out.println("the number :" + numberToBeChecked + " is not a prime");
		}

	}

}
