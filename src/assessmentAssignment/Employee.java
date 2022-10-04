package assessment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Employee {
	static String company = "TECHNOGISE";

	/**
	 This method takes number of employee we want to enter details of, and takes all the details of the employee
	 Method stores the details in a tree map and returns the tree map
	 */
	public static TreeMap<Integer, LinkedList<Object>> input() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many emp records you want to enter");
		int records = sc.nextInt();
		TreeMap<Integer, LinkedList<Object>> tm = new TreeMap<Integer, LinkedList<Object>>();//for storing details 
		//taking details of employee
		for (int i = 1; i <= records; i++)
		{
			LinkedList<Object> ll = new LinkedList<Object>();
			System.out.println("enter details for empid " + i);
			ll.add(i);

			System.out.println("enter Name of emp ");
			String name = sc.next();
			ll.add(name);

			System.out.println("enter department of emp");
			String dep = sc.next().toUpperCase();

			ll.add(dep);

			System.out.println("enter salary of emp");
			int salary = sc.nextInt();
			ll.add(salary);
			ll.add(company);

			tm.put(i, ll);

		}
		return (tm);

	}

	/**
	 This method takes the department name for which we want employee details and returns the name
	  
	 */
	public static String takDep() {
		//takes the department name from user
		Scanner ip = new Scanner(System.in);
		System.out.println("enter department you want details of");
		String specificdep = ip.next().toUpperCase();
		return (specificdep);
	}
/**

This method prints the details of the empolyee we want in the specified format
 */
	public static void print(String input, TreeMap<Integer, LinkedList<Object>> tm) 
	{

		String str = String.format("Here are the details of employee in department %s as you wanted ", input);
		System.out.println(str);
		System.out.println("ID   Name  Department  Salary  Company");
		System.out.println("-----------------------------------------------------------");

		for (Map.Entry<Integer, LinkedList<Object>> me : tm.entrySet()) //for printing the details of specified department
		{

			if (me.getValue().contains(input)) {
				Iterator itr = me.getValue().iterator();
				while (itr.hasNext()) {
					System.out.print(itr.next() + "\t");
				}
				System.out.println();

			}

		}

		LinkedList<Object> norec = new LinkedList<Object>();

		for (Map.Entry<Integer, LinkedList<Object>> me : tm.entrySet()) //storing all the departments in linkedList
		{
			Object[] arr = me.getValue().toArray();
			norec.add(arr[2]);

		}

		if (!norec.contains(input)) //check if the specified department is in the LinkedList or not
		{
			String print = String.format("No Records found for Department {dep_%s}", input);
			System.out.println(print);

		}

	}

	public static void main(String[] args) {

		TreeMap<Integer, LinkedList<Object>> treemap = input();

		String depart = takDep();

		print(depart, treemap);

	}

}