package fileHandling;

/*Write a Java Program to read the content of a file and use it in the program as mentioned below - 
There will be a file in which there will be names of fruits and you need to read these fruit names and store it in an array. If the fruit name is duplicate, then don’t add it in the array.
Once adding the elements in the array is done, print the array elements.

For example the file will have below content - 
Apple,Mango,Banana,Papaya,Water Mellon,Jack Fruit, Berries, Orange, Apple, Papaya, Cucumber, Mush Mellon.
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Program3 {
	public static void removeDuplicate(String loc) 
	{
		try {
		FileReader fr = new FileReader(loc);

		int i;
		char c;
		String s = "";
		while ((i = fr.read()) != -1) // reading the file
		{
			System.out.print((char) i);
			c = (char) i;
			s = s + String.valueOf(c); // conversion for storing in string array

		}

		s = s.replaceAll(" ", "");// removing spaces
		String arr[] = s.split(","); // Splitting with the help of comma and storing in string array
		System.out.println("\n" + s);
		int l = arr.length;
		System.out.println(l);

		Arrays.sort(arr); // Sorting the string array

		// logic for removing duplicate elements
		for (int k = 0; k < l - 1; k++) {
			for (int j = k + 1; j < l; j++) {
				if (arr[k].equalsIgnoreCase(arr[j])) {
					arr[j] = arr[l - 1];
					l--;
				}
			}
		}

		for (int q = 0; q < l; q++) // printing the String array without duplicate elements
		{
			System.out.print(arr[q] + ",");

		}
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location = "C:\\test2\\fruitsname.txt";
		removeDuplicate(location);

	}

}
