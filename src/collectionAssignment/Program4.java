package collectionAssignment;

import java.util.Map;
import java.util.TreeMap;

/*Write a Java Program to store values in Key Value Pair. The Collection should store Employee Id and Name.
i. The Employe Id should be alphanumeric , eg - TECH001
i. No Null Key should be allowed.
ii. The data should be stored in ascending order.
iii. Print the Data in the Below format - 
	Hello {Name} ({Emp_Id}),
		Welcome to Technogise.
	Regards,
	Team Technogise.
For example , Name is Martin, Employee Id is TECH2011, Then the data should be printed in below format.
Hello Martin (TECH2011),
		Welcome to Technogise.
	Regards,
	Team Technogise.
*/

public class Program4 
{
	public static void toPrint(TreeMap<String, String> pr) 
	{
		// for printing in given format
		
		for (Map.Entry<String, String> m : pr.entrySet())

		{
			String id = m.getKey();
			String name = m.getValue();
			String print = String.format("Hello %s (%s),\nWelcome to Technogise.\nRegards,\nTeam Technogise.", name,id);
			System.out.println();
			System.out.println(print);

		}

	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeMap<String, String> tr = new TreeMap<String, String>();
		// Data
		tr.put("TECH001", "emp1");
		tr.put("TECH002", "emp2");
		tr.put("TECH003", "emp3");
		tr.put("TECH004", "emp4");

		toPrint(tr);
	}

}
