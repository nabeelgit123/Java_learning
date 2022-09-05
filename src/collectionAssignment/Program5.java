package collectionAssignment;

import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*Write a Java Program which will contain Character as the Key and List of Product Names as values.
Example : 
‘A’ → Apple, Airpods, Antenna , Aeroplane
‘B’ → Bat, Banana, Bi-cycle, Boat, Bear, Beer.
‘C’ → Cycle, Car, Cat, Cake, Cap

i. Take a Character  input from the user  and then print the List of values for the specified Character.
ii. If the user has entered a character for which we do not have any entry, the display a message → “No Records Found.”
*/

public class Program5 
{
	public static LinkedList<String>  printProduct(TreeMap<Character, LinkedList<String>> tm, char ip)
	{

		if (tm.containsKey(ip)) 
		{
			for (Map.Entry<Character, LinkedList<String>> me : tm.entrySet()) 
			{
				if (me.getKey().equals(ip)) 
				{
					
					return(me.getValue());
				}

			}
		} 
		else

		{
			
			 System.out.println("No Records Found.");
			
		}
		return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Character, LinkedList<String>> tr = new TreeMap<Character, LinkedList<String>>();

		LinkedList<String> l1 = new LinkedList<String>();// list of products for character A
		l1.add("Apple");
		l1.add("Airpods");
		l1.add("Antenna");
		l1.add("Aeroplane");

		LinkedList<String> l2 = new LinkedList<String>();// list of products for character A
		l2.add("Bat");
		l2.add("Banana");
		l2.add(" Bi-cycle");
		l2.add("Boat");
		l2.add("Bear");
		l2.add("Beer");

		LinkedList<String> l3 = new LinkedList<String>();// list of products for character A
		l3.add("Cycle");
		l3.add("Car");
		l3.add("Cat");
		l3.add("Cake");
		l3.add("Cap");

		tr.put('A', l1);
		tr.put('B', l2);
		tr.put('C', l3);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character in capitals/uppercase only  to print list of  associated vlaues(products) for it");
		char ch = sc.next().charAt(0);
		LinkedList <String> specifiedCharList=new LinkedList<String>();
		
		specifiedCharList=printProduct(tr, ch);
		System.out.println(specifiedCharList);
		
		
	}

}
