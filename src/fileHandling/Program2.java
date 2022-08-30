package fileHandling;
/*Write a Java Program to take input from the user.
Take the below Inputs -
First Name, Last Name and PhoneNumber
Create a .txt file. the Name of the file should be {firstName}_{lastName)_{phoneNumber}.txt

The content in the file should be - 
	Hello {firstName},
	Welcome to Java Programming.
	Your Number {PhoneNumber} has been registered for updates.
	Thanks,
	Team Java.
*/

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program2
{
	public static void detailsfile(String loc,String toPrint) 
	{
		try
		{
			String print=toPrint;
			FileWriter fw=new FileWriter(loc);
			fw.write(print);
			fw.close();
			
		} 
		catch (IOException e) 
		{
			
			System.out.println(e);
			
		}
		
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name");
		String fname=sc.nextLine();
		
		System.out.println("enter last name");
		String lname=sc.nextLine();
	
		System.out.println("enter phone number");
		long phnumber=sc.nextLong();
		
		
		String locname=String.format("C:\\test2\\%s_%s_%d.txt", fname,lname,phnumber);
		System.out.println(locname);
		
		
		String details=String.format("Hello %s,\nWelcome to Java Programming.\nYour Number %d has been registered for updates.\nThanks,\nTeam Java.",fname,phnumber);
		System.out.println(details);
		
		detailsfile(locname,details);
		
	
	}
	

}
