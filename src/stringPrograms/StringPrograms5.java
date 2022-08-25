package stringPrograms;
/*Q% Write a program to verify if the given string is palindrome. */


public class StringPrograms5 {

	public static void checkPalindrome(String x) {
		String temp = x;
		int length = temp.length();
		String reverse = "";
		for (int i = length - 1; i >= 0; i--) 
		{
			reverse=reverse+ temp.charAt(i);
		
		}
		
		
		if(reverse.equalsIgnoreCase(temp)) 
		{
			String print=String.format("the given string %s is palindrome",temp);
			System.out.println(print);
		}
		else 
		{
			String print=String.format("the given string %s is not palindrome",temp);
			System.out.println(print);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "acca";
		checkPalindrome(s);

	}

}
