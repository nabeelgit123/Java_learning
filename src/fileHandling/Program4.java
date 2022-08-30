package fileHandling;

/*Write a program which will create a java file if not present, and then append the content to the file.
Example  if a file already has some content in it, then the program should not override the content rather
 it should append the new text after the previous content.
 */

import java.io.*;

public class Program4 
{
public static void append(String loc) 
{
	File f=new File(loc);
	try {
	if(f.exists()) 
	{
	FileWriter fw=new FileWriter(loc,true);
	PrintWriter pw=new PrintWriter(fw);
	pw.print(" this appened from if");
	pw.close();
	fw.close();
	System.out.println("success from if");
	
	}
	else 
	{
		FileWriter fw=new FileWriter(loc,true);
		fw.write("this is first time writing ");
		PrintWriter pw=new PrintWriter(fw);
		pw.print(" this is appended from else");
		pw.close();
		fw.close();
		System.out.println("success from else");
	}
	
	}
	catch(Exception e) 
	{
		System.out.println(e);
	}

}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String location="C:\\test2\\abcd_xyz_1234.txt";
		append(location);
	}

}
