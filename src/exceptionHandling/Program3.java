package exceptionHandling;
import java.util.Scanner;

/*Write a program to create a User Defined Exception named InvalidBrowserException.
Take a browser name as an input form the user and if the browser name is not in the supported browser 
list then throw the InvalidBrowserException.Example Supported Browsers = { Google Chrome, Firefox and Safari}
If the user input is “IE” then throw InvalidBrowserException.
If the user input is Firefox then display - “Awesome, We will launch the browser.”
*/


class InvalidBrowserException extends Exception //for user defined exception 
{
	InvalidBrowserException(String msg)
	{
		System.out.println(msg);
	}
	
	
 }
public class Program3 
{
	public static void browserType(String ip) throws InvalidBrowserException
	{
		// checking for supported browser or not
	 if(ip.equalsIgnoreCase("Google Chrome") ||ip.equalsIgnoreCase("GoogleChrome") ||ip.equalsIgnoreCase("Chrome") || ip.equalsIgnoreCase("Firefox") || ip.equalsIgnoreCase("Safari")) 
		{
			System.out.println("Awesome, We will launch the browser.");
		}
		else 
		{
			throw new InvalidBrowserException("this is InvalidBrowserException");// user defined exception
		}
	}

	public static void main(String[] args) throws InvalidBrowserException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the browser name  1.)Google Chrome, 2.)Firefox  3.)Safari");
		String input=sc.nextLine(); // user input
		try 
		{
			browserType(input);// calling method
		} 
		catch (InvalidBrowserException e) // caught user defined exception
		{
			System.out.println(e);
		}
		
	}

}
