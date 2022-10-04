package assessment;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Program3

{
	/**
	 * this method creates and store the given string into the txt file in the
	 * location as mentioned
	 */
	public static void storeFile(String str, String loc) {

		// stores the string given by user in a txt file
		try {
			String toprint = str;
			FileWriter fw = new FileWriter(loc);
			fw.write(toprint);
			fw.close();
		} catch (Exception e) {

			System.out.println(e);
		}

	}

	/**
	 * this method counts the number of words in a txt file at specified location
	 */
	public static String[] countWords(String str, String loc) {
		try {
			FileReader fr = new FileReader(loc);

			int i;
			char c;
			String s = "";
			while ((i = fr.read()) != -1) // reading file
			{
				System.out.print((char) i);
				c = (char) i;
				s = s + String.valueOf(c);
			}
			fr.close();

			String arr[] = s.split(" "); // split to get words individually
			int words = arr.length;
			System.out.println("\nthere are " + words + " words  in the pragaraph");
			return (arr);

		} catch (Exception e) {

			System.out.println(e);
		}
		return null;

	}

	/**
	 * this method removes duplicate and prints the unique values on new line
	 */
	public static void removeDupl(String ar[]) {
		String dup[] = ar;

		LinkedHashSet<String> hs = new LinkedHashSet<String>();// maintains insertion order
		// HashSet <string> hs =new HashSet<String>();
//for(int z=0;z<dup.length;z++) //adding to LinkedHashSet
//{
//	String str=dup[z];
//	hs.add(str);
//	
//}
//System.out.println(hs);
		for (String i : dup) // adding to HashSet
		{
			hs.add(i);
		}

		System.out.println("after removing duplicate elements and printing each element on new line");
		for (String i : hs) // displaying the LinkedHashSet
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String location = "C:\\test2\\program3.txt";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a paragaraph");
		String print = sc.nextLine();
		System.out.println("after converting to uppercase");
		String s = print.toUpperCase(); // converts to upper case

		storeFile(s, location);
		String array[] = countWords(s, location);
		removeDupl(array);
	}

}
