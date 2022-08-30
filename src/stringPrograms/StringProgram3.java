package stringPrograms;
/* Q3
Write a program which will accept Name as parameter and will print the name as below :
Eg : Name - TECHNOGISE
Output : 
T
TEC
TECNO
TECNOGI
TECHNOGISE
*/

public class StringProgram3 {
	public static void printName(String x) 
	{
		String temp = x;
		int length = temp.length();

		for (int i = 1; i <= length; i = i + 2) 
		{
			for (int j = i; j <= i; j++) 
			{

				if (i == 9)
				{
					System.out.println(temp.substring(0, j + 1));
				} 
				else 
				{
					System.out.println(temp.substring(0, j));
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "TECHNOGISE"; // given String
		printName(s); // calling the printName method
	}

}
