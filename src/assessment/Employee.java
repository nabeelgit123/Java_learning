package assessment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public  class Employee 
{
	static String company="TECHNOGISE";
	
	public static  void input(String input) 
	{
		
		Scanner sc=new Scanner (System.in);
		System.out.println("enter how many emp records you want to enter");
		int records=sc.nextInt();
		TreeMap<Integer ,LinkedList<Object>> tm=new TreeMap<Integer,LinkedList<Object>>();
		for(int i=1;i<=records;i++) 
		{
			LinkedList<Object> ll=new LinkedList<Object>();
			System.out.println("enter details for empid "+i);
			ll.add(i);
			
			System.out.println("enter Name of emp ");
			String name=sc.next();
			ll.add(name);
			
			System.out.println("enter department of emp");
			String dep=sc.next();
			ll.add(dep);
			
			System.out.println("enter salary of emp");
			int salary=sc.nextInt();
			ll.add(salary);
			ll.add(company);
			
			tm.put(i,ll);
			
			
		}
		
		//System.out.println(tm);
		
		System.out.println("ID  Name  Department  Salary  Company");
		System.out.println("-----------------------------------------------------------");
		
		for(Map.Entry<Integer, LinkedList<Object>> me: tm.entrySet()) 
		{
			if(me.getValue().contains(input))
			{
				
			
			
				Iterator itr=me.getValue().iterator();
				while(itr.hasNext()) 
				{
					System.out.print(itr.next()+"\t");
				}
				System.out.println();
			
			
			}
		}
		
		
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("enter department you want details of");
		String specificdep=ip.next();
		
		
		
		input(specificdep);

	}

}
