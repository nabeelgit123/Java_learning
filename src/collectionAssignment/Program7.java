package collectionAssignment;
/* Q7
 */
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program7
{
	
/***
this method makes a linkedList of type String to store inputs from user 
till he enters Done. And returns the LinkedList

 ***/
public static LinkedList<String> takeStringInput()

{
	//logic to get inputs from user till enters done
	LinkedList<String> ll = new LinkedList<String>();

	Scanner sc = new Scanner(System.in);
	System.out.println("Please Enter As many items you want by pressing Enter key and once completed Type Done.");
	
	while(true) 
	{
		String ip = sc.next();
		if(ip.equals("Done")) 
		{
			System.out.println("you entered 'Done' ");
			break;
			
		}
		else
		{
		ll.add(ip);
		}
	}
	return(ll);
	
	}


/***
 Takes the First Character from the input LinkedList and makes it as key and store the elements of linkedList as value 
 associated with the key in  TreeMap
 */
public static TreeMap<Character, LinkedList<String>> firstCharWiseMatchingString(LinkedList<String> storeips) 
{
	
	
//logic to take first character as key and store the elements that starts with that character in values
	TreeMap<Character, LinkedList<String>> tm = new TreeMap<Character, LinkedList<String>>();

	for (String s : storeips) 
	{

		String na = s;
		char first = na.charAt(0);

		if (tm.containsKey(first))

		{

			LinkedList<String> existing = tm.get(first);
			existing.add(na);
			tm.put(first, existing);

		} 
		else
		{
			LinkedList<String> fornew = new LinkedList<String>();
			fornew.add(na);
			tm.put(first, fornew);
		}

	}
	System.out.println(tm);
	for(Map.Entry<Character, LinkedList<String> > traverse:tm.entrySet()) 
	{
		
		System.out.println(traverse.getKey()+"-->"+traverse.getValue());
		
		
	}
	return(tm);

}

/***
 Takes TreeMap as parameter  and returns the key that has maximum values
 */
public static String findMaxTreeMapValues(TreeMap<Character, LinkedList<String>> storedMap) 
{
	//logic to get  Character which has the most number of items.
	TreeMap<Character, LinkedList<String>> storedMatchingChar = new TreeMap<Character, LinkedList<String>>();
	
	storedMatchingChar=storedMap;



	TreeMap<Character, Integer> maxfinder = new TreeMap<>();//map that has length 

	for (Map.Entry<Character, LinkedList<String>> me : storedMatchingChar.entrySet()) 
	{
		LinkedList<String> temp = me.getValue();
		System.out.println(temp);
		char tempch = me.getKey();
		
		int length = temp.size();
		
		maxfinder.put(tempch, length);

	}
	
	int keyForMaxValue = Collections.max(maxfinder.values());

	for (Map.Entry<Character, Integer> mapp : maxfinder.entrySet()) 
	{
		if (mapp.getValue().equals(keyForMaxValue)) 
		{
			String print = String.format("the Character with maximum product is '%c' it has %d products",
					mapp.getKey(), keyForMaxValue);
			
			System.out.println(print);
		}
	}
	return null;
	

}


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// Step 1 takes String input by calling takeStringInput method and storing the value in stsoreCallip
		
		LinkedList<String> stsoreCallip=new LinkedList<String>();
		stsoreCallip= takeStringInput();
		
		/*
		 Step 2 take the output of takeStringInput stored in stsoreCallip and is given to
		 firstCharWiseMatchingString method for mapping the starting Character to all 
		 the products that starts with that character  
		*/
		
		TreeMap<Character, LinkedList<String>> storeMap = new TreeMap<Character, LinkedList<String>>();
		storeMap=firstCharWiseMatchingString(stsoreCallip) ;
		
		
		/*
		  Step 3 the output of firstCharWiseMatchingString method is stored in storeMap and is given
		  to findMaxTreeMapValues method to find the Character which has the most number of items (values).
		*/
		findMaxTreeMapValues(storeMap) ;
		
	}
}
