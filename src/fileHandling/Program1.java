package fileHandling;

/*Write a program to create a text file and write the below text in the file.
“This file is created using java program.”
*/
import java.io.*;

public class Program1
{
	public static void createWrite(String loc,String str) 
	{
		try
		{
			FileWriter fw = new FileWriter(loc);
			fw.write(str);
			fw.close();
			
		}
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		System.out.println("successfully created file and wrote the goiven string in it");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String location="C:\\test2\\createandwrite.txt";
		String toWrite="This file is created using java program";
		createWrite(location,toWrite);
	}

}
