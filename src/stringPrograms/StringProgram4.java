package stringPrograms;
/*Q4 Write a program which will accept a character as a parameter and then print the count of the number of times the character is present in the string.
Eg: String = JAVA
Character = A
Output = “A is present 2 times”.
*/
public class StringProgram4 
{
	public static void timesCharAppear(String str)
	{
		// logic
		
		int length=str.length();
		
		String replaceStr=str.replace("A", "");
		
		int replaceStrLength=replaceStr.length();
		
		int count=length-replaceStrLength;
			
		String print=String.format("the character A is present %d times in string  %s",count,str);
		System.out.println(print);
		}
		
		
		
		
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			String string="JAVA";// the given string 
			timesCharAppear(string); // method to call timesCHarAppear
			
		}
		}