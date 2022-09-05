package stringPrograms;
/* Q2 Write a program to count the number of words in a paragraph. */

public class StringProgram2 {

	public static void countWords(String x)

	{
		int counter = 1;
		String temp = x;
		int length = temp.length();
		
		for (int i = 0; i < length; i++)
		{
			if (temp.charAt(i) == ' ' &&  temp.charAt(i + 1) != ' ') // since characters are in single quotes
			{
				counter++;
			}
		}
		String print = String.format("There are %d words int the given paragraph", counter);
		System.out.println(print);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paragraph = "hi this is a paragraph  hgfdsdfghjkl";
		countWords(paragraph);
	}

}
