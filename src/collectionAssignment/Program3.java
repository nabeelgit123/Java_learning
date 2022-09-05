package collectionAssignment;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
Write a Java Program to store PANCARD Numbers of Employees. 
i. Choose the right Collection to be used (ArrayList, LinkedList, Set)
ii. Make sure the Data is stored in the order they are inserted.
ii. Print the data.
*/

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> s = new LinkedHashSet<String>(); // using LinkedList that maintains insertion order

		// pan card numbers
		s.add("Ab1132347");
		s.add("Cd1387654");
		s.add("Ef1209876");

		Iterator itr = s.iterator();

		while (itr.hasNext()) // printing the data (pan card numbers)

		{
			System.out.println(itr.next());
		}
	}

}
