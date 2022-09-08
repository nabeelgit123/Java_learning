package collectionAssignment;

import java.util.Collections;
import java.util.LinkedList;

/*Write a Java Program to create a List, which will store Student names. Insert at least 10 names.
i. Print the student name which is present at the 3rd index.
ii. Insert a new student name at the 7th index.
iii. Remove the student name at the 4th index.
iv. Sort the List in Descending order and print the final list.
*/
public class Program2
{
	public static void doOperations(LinkedList<String> ll) 
	{

		System.out.println("the original list = \n" + ll); // original list

		System.out.println("the student at the index 3 = " + ll.get(3)); // getting the student name at index 3

		ll.add(7, "new Student"); // adding new student at index 7

		System.out.println("the student removed  from index 4 =" + ll.remove(4)); // removing the student at index 4

		Collections.sort(ll, Collections.reverseOrder()); // sorting in descending order
		System.out.println("the desecnding order" + ll);

		System.out.println("The final list after all operations = \n" + ll); // list after all operation

	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedList<String> lkl = new LinkedList<String>();
		lkl.add("zak");
		lkl.add("sham");
		lkl.add("pratik");
		lkl.add("andy");
		lkl.add("sam");
		lkl.add("sunny");
		lkl.add("mandy");
		lkl.add("mady");
		lkl.add("varun");
		lkl.add("sandy");

		doOperations(lkl);
	}

}
