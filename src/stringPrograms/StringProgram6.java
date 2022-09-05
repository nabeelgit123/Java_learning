package stringPrograms;

/*Q6 Write a program to Convert a string to Array without using any inbuilt methods.
*/

public class StringProgram6 
{
public static void stringToArray(String str) 
{
	int length=str.length();// length of string
	char array[]=new char[length]; 
	for(int i=0;i<length;i++) // converting String to array
	
	{
		array[i]=str.charAt(i);
	}
	
	int arraylength=array.length;//length of array (converted into array from string)
	for(int i=0;i<arraylength;i++) // printing the string converted into array
	{
		int value=array[i];
		String print=String.format("the index of %c is %d",value,i);
		System.out.println(print);
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="automation";
		stringToArray(s); // method to convert string to array
			
	}
}
