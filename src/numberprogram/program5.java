package numberprogram;

/*Write a program to print the factorial of a given number. 
 The method should return the value and print it in main().
*/

public class program5 {

	public static int giveFactorial(int parameterPassed) {
		int tempNumber = parameterPassed;
		int factorial = 1;
		for (int i = 1; i <= tempNumber; i++)
		{
			factorial = factorial * i;

		}
		return (factorial);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int patrameterToBePassed = 6;
		System.out.println("the factorial of " + patrameterToBePassed + " is :");
		System.out.print(giveFactorial(patrameterToBePassed));
	}

}
