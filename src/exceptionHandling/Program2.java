package exceptionHandling;

import java.util.Scanner;

/*Q2  Write a program which will print “Program initiated..”, then accept a PhoneNumber from the user. 
If the Number entered is not equal to 10 digit, then throw an Exception
with a message “Number should be 10 digit”, Catch the Exception and print the message in the exception,
and then the program should print “Program terminated.”
If the Number is equal to 10 digit, then display the entered number and then print “Program Terminated.”

*/

public class Program2
{

	public static void phoneNumberCheck(int len, String no) throws Exception
	{
		String s = no;
		try
		{
		if (len == 10)
		{
			String print = String.format("the no you  entered is %s" , s);
			System.out.println(print);
		} 
		else if (len > 10 || len < 10) 
		{

			throw new Exception("Number should be exactly 10 digit"); // throwing exception with message
		}
		}
		catch(Exception e) // caught exception
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("Program terminated");
		}

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Program initiated.");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter phone number");
		long phno = sc.nextLong(); // takes phone number as input
		String str = Long.toString(phno); // converting into string to get length
		int len = str.length(); // calculating the length
		phoneNumberCheck(len, str); // method calling
		
		
	}

}
