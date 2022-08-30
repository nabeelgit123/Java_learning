package fileHandling;

/*Write a program which will accept a file location from the user and read and display the content of the file.
If the file is not present in the machine then Handle the exception and display the message - 
“File is not found at the given location {location). Please verify the file location.”
*/
import java.io.File;
import java.io.*;
import java.util.Scanner;


public class Program5
{
	public static void readDisplay(String loc) 
	{
		File f=new File(loc);
		try {
		if(f.exists()) 
		{	
			FileReader fr=new FileReader(loc);
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			
		}
		else 
		{
			String print=String.format("File is not found at the given location { %s }. Please verify the file location.",loc);
			throw new Exception(print);
		}
		}
		catch(Exception e) 
		{
			System.out.println(e);
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file location to read and display the content");
		String location=sc.nextLine();
		
		readDisplay(location);
		
	}

}
