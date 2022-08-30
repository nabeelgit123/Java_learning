package exceptionHandling;
import java.util.Scanner;


/* Q1 Write a program which will catch an exception , print some message and then rethrow the exception.
Ex - 
Your program is performing Division of a Number, Accept 2 numbers from the user. 
if the second number is 0 then a Divide By Zero Exception occured, then catch the exception , 
Print the message “ Please enter valid number to divide.” and then throw the exception.
*/


public class Program1 
{
	public static void doDivision(int fno,int sno)  
	{
		int div;
		try
		{
			div=fno/sno;
			
			String print=String.format("the division of two numbers %d by %d is %d",fno,sno,div);
			System.out.println(print);
		}
		catch(Exception e)
		{
			System.out.println("Please enter valid number to divide.");
			
			System.out.println(e);
		}
		
		   
	}

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number  ");
		int firstno=sc.nextInt(); // takes first number
		System.out.println("enter the second number  ");
		int secondno=sc.nextInt(); // takes second number
		
	doDivision(firstno,secondno); // calling the method
	
	}

}
