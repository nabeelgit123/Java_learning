package stringPrograms;
/*Q10 Write a program to check if the 2 Strings are anagram of each other.
Eg: Str1 = ARMY , Str2 = MARY
OUTPUT : String are Anagram.
*/


import java.util.Arrays;

public class StringProblem10 {

public static void anagram(String str1cp,String str2cp) 
{
	String str1=str1cp;
	String str2=str2cp;
	int length=str1cp.length();
	int length1=str2cp.length();
	char ch[]=new char[length];
	char ch2[]=new char[length1];
	
	for(int i=0;i<length;i++)       // converting string 1 into array
	{
		ch[i]=str1cp.charAt(i);
	}
	Arrays.sort(ch);      // sorting the converted array
	
	for(int i=0;i<length1;i++)       // converting string 2 into array
	{
		ch2[i]=str2cp.charAt(i);
	}
	Arrays.sort(ch2);        // sorting the converted array
	
	
	int counter=0;
	for(int i=0;i<length1;i++) // checking for anagram
	{
		
			if(ch[i]==ch2[i]) 
			{
				counter++;
			}
		
	}
		
if(counter==str1cp.length()) 
{
String print=String.format("the given string %s and %s is anagram ",str1,str2);
System.out.println(print);
}


}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// given Strings
		String str1 = "ARMY";
		String str2 = "MARY";
		
		anagram(str1, str2); // method to check anagram
	}

}
