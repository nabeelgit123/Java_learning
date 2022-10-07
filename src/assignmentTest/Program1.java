package assignmentTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Program1
{
	public static TreeMap<String, LinkedList<String>> input() 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Please enter how many records you want to enter" );
		int len=sc.nextInt();
		TreeMap<String,LinkedList<String>> tm=new TreeMap<String,LinkedList<String>>();
		LinkedList <String > lln=new LinkedList<String>();
		for(int i=1;i<=len;i++) 
		{
			
			String p=String.format("Please enter the Country Name for %d Player ",i);
			System.out.println(p);
			String country=sc.next().toUpperCase();
			
		
				
				if (tm.containsKey(country))

				{

					String pr=String.format(" Please enter the Player %d Name.",i);
					System.out.println(pr);
					String name=sc.next().toUpperCase();
					
					
					LinkedList<String> existing = tm.get(country);
					existing.add(name);
					tm.put(country, existing);

				} 
				
				else {

					String pr=String.format(" Please enter the Player %d Name.",i);
					System.out.println(pr);
					String name=sc.next().toUpperCase();
					lln.add(name);
					LinkedList<String> firsttime = new LinkedList<String>();
					firsttime.add(name);
					tm.put(country, firsttime);
				}

			}
			System.out.println(tm);
			return tm;
		}
	
public static  void specificplayers (TreeMap<String, LinkedList<String>> data) 
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter countrty name to see their players");
	String specific = sc.next().toUpperCase();
	for(Map.Entry<String, LinkedList<String>> m:data.entrySet()) 
	{
		if(m.getKey().contains(specific)) 
		{
			
			String print=String.format("the players for %s are ",specific );
			System.out.println(print);
			Iterator itr=m.getValue().iterator();
			while(itr.hasNext()) 
			{
				System.out.println(itr.next());
			}
			
		}
	}
	LinkedList <String > ll=new LinkedList<String>();
	for(Entry<String, LinkedList<String>> map:data.entrySet()) 
	{
		
		ll.add(map.getKey());
		
	}
	if(!ll.contains(specific)) 
	{
		String toprint=String.format("No Records Found for {%s}",specific);
		System.out.println(toprint);
	}
	
	
	}

public static void initial(TreeMap<String, LinkedList<String>> data) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter strating letter of the player");
	String start = sc.next();
	for(Entry<String, LinkedList<String>> m: data.entrySet()) 
	{
		Iterator itr=m.getValue().iterator();
		while(itr.hasNext()) 
		{
		String str=itr.next().toString();
		if(str.startsWith(start)) 
		{
			System.out.println(str);
		}
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, LinkedList<String>> data = input();
		specificplayers(data);
		initial(data);
	}

}
