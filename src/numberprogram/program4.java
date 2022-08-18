package numberprogram;

/*Write a program to check if the given number is a Palindrome Number or not.
 The method should return the value and print it in main().
*/

public class program4 {

	public static boolean isPalindrome(int parameterPassed)

	{
		int tempNumber = parameterPassed;
		int reverseNum = 0;
		while (tempNumber > 0)
		{
			int lastDigit = tempNumber % 10;
			reverseNum = (reverseNum * 10) + lastDigit;
			tempNumber = tempNumber / 10;

		}

		if (parameterPassed == reverseNum)
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
		int numberToBeChecked = 123321;
		System.out.println("checking the number " + numberToBeChecked + "is palindrome or not");
		if (isPalindrome(numberToBeChecked)) {
			System.out.println("the given number " + numberToBeChecked + " is palindromes");
		} 
		else 
		{
			System.out.println("the given number " + numberToBeChecked + " is not  palindromes");
		}

	}

}
