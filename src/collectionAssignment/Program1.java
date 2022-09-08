package collectionAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/*Write a Java Program to create a List which will store 4 wheeler manufacturing brand names.
i. Print only the Brand Names Starting with “M”
ii. Sort the List in Ascending Order.
iii. Display the No. of times each Brand is present in the list.

*/
public class Program1 
{

	public static void brandNames() 
	{

		ArrayList<String> ar = new ArrayList<String>();
		// Brand Names
		ar.add("BMW");
		ar.add("AUDI");
		ar.add("MERCEDES");
		ar.add("HONDA");
		ar.add("BMW");
		

		System.out.println("Original list of brand names" + ar);// Original List

		// prints only brands from m
		for (String str : ar)
		{
			if (str.startsWith("M") || str.startsWith("m")) 
			{
				System.out.println("The brand name starting with M=" + str);
			}
		}

		Collections.sort(ar); // Sorts in ascending order

		System.out.println("In Ascending " + ar); // Displaying the list in ascending order

		// for getting number of times element present in the list

		Map<String, Integer> m = new TreeMap<String, Integer>();

		for (String s : ar) 
		{
			String temp = s;

			if (m.containsKey(temp)) 
			{
				int counter = m.get(temp); // returns the value (temp is string ) of key

				counter ++;
				m.put(temp, counter);

			}

			else 
			{

				m.put(temp, 1);

			}

		}
		System.out.println(m);

	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		brandNames(); // calling the method

	}

}
