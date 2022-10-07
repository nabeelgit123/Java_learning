package assignmentTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


class NoProductFound extends Exception //for user defined exception 
{
	NoProductFound(String msg)
	{
		System.out.println(msg);
	}
	
	
 }

public class Program3 {

	
public static ArrayList<String> input() 
{
	Scanner sc= new Scanner(System.in);
	ArrayList<String> al=new ArrayList<String>();
	while (true) 
	{
		System.out.println("enter product name");
		String ip = sc.next();
		if (ip.equalsIgnoreCase("Done")) {
			System.out.println("you entered 'Done' ");
			break;

		} 
		else
		{
			al.add(ip);
		}
	}
	return al;
}

public static TreeMap<Character, ArrayList<String>> sortdec(ArrayList<String> list) 
{
	Collections.sort(list, Collections.reverseOrder());
	System.out.println("list in reverse order"+list);
	//Object[] arr = list.toArray();
	TreeMap<Character,ArrayList<String>> tm=new TreeMap<Character,ArrayList<String>>();
	for (String inlist : list) {

		String newstr = inlist;
		char firstch = newstr.charAt(0);

		if (tm.containsKey(firstch))

		{

			ArrayList<String> existing = tm.get(firstch);
			existing.add(newstr);
			tm.put(firstch, existing);

		} else {
			ArrayList<String> fornew = new ArrayList<String>();
			fornew.add(newstr);
			tm.put(firstch, fornew);
		}

	}
	System.out.println(tm);
	return tm;

}
private static void initial(TreeMap<Character, ArrayList<String>> storemap)
{
	try {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the starting alphabet you want products of");
	char ch=sc.next().charAt(0);
	
	System.out.println("Product list startring from "+ch);
	
	for(Entry<Character, ArrayList<String>>  m:storemap.entrySet()) 
	{
	int	counter=1;
		
		if(m.getKey().equals(ch)) 
		{
			Iterator itr=m.getValue().iterator();
			while(itr.hasNext()) 
		{
				
				System.out.println(counter+"."+itr.next());
				counter++;
		}
		}
		
		
	}
	
	LinkedList<Character> ll=new LinkedList<Character>();
	
	for(Entry<Character, ArrayList<String>>  m:storemap.entrySet()) 
	{
		ll.add(m.getKey());
		
		if(!ll.contains(ch)) 
		{
			String print=String.format("There are no products starting with {%c}", ch);
			throw new NoProductFound(print);
		}
		
	}
	}
	catch(NoProductFound e) 
	{
		System.out.println(e);
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = input();
		TreeMap<Character, ArrayList<String>> storemap = sortdec(list);
		initial(storemap);
		
	}

}
