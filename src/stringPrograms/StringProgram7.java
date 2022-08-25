package stringPrograms;

/*Q7 Write a program which will take a string , start index and end index as parameters and will print the substring of the given string with both index inclusive. (Do not use inbuilt methods)
Ex : public void printSubstring(String str, int startIndex, int endIndex)
	{
	…
	}
printSubstring(“This is Java Program”,5,11)
Output = “is Java”
*/

public class StringProgram7
{
	public static void printSubstring(String str,int startindex,int endindex) 
	{
		for(int i=startindex;i<=endindex;i++) // logic to print the sub string
		{
			System.out.print(str.charAt(i));
		}
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str="This is Java Program"; // given string
		printSubstring(str,5,11); //method to print substring 

	}

}
