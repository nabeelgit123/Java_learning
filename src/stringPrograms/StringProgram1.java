package stringPrograms;
/*Q1 Write a program to reverse the string without using in-built methods (library methods). */

public class StringProgram1 {

	public static void reverseString(String x)
	{
		String temp = x;
		int length = temp.length();

		// length = length-1;
		System.out.println(length);

		for (int i = length - 1; i >= 0; i--) 
		{
			System.out.print(temp.charAt(i));
		}

	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s = "nabeel shaikh";
		reverseString(s);
	}

}
