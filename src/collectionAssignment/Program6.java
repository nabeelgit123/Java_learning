package collectionAssignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*Write a Java Program which will store List of Lists.
i. The First List will have names of Fruits. (Strings)
ii. The Second List will have Phone Numbers. (Integers)
iii. The Third List will store alphabets. (Char)
Store all these list in a Single List and then Print the values of the Lists in below Manner - 
The List of Strings are - {values}
The List of Integers are - {values}
The List of Characters are - {values}
*/
public class Program6 
{
	

	public static void printTypeValues(ArrayList<ArrayList> superList) 
	{
		
		//list to store the data from the super list that are of type string
		LinkedList listOfStrings = new LinkedList<String>();
		//list to store the data from the super list that are of type long(Integers)
		LinkedList listOfLong = new LinkedList<String>();
		//list to store the data from the super list that are of type Characters
		LinkedList listOfCharacters = new LinkedList<String>();
		

		for (ArrayList al : superList) 
		{
			
			//for traversing lists inside the superList
			Iterator innerItr = al.iterator();
			while (innerItr.hasNext()) 
			{
				Object temp = innerItr.next();
				if (temp instanceof String)//checking the data is of string type 
				{

					listOfStrings.add(temp);

				}
				if (temp instanceof Long) //checking the data is of Long type 
				{

					listOfLong.add(temp);

				}
				if (temp instanceof Character)//checking the data is of Character type 
				{

					listOfCharacters.add(temp);

				}

			}
		}
		System.out.println("The List of Strings are -" + listOfStrings);
		System.out.println("The List of Integers are -" + listOfLong);
		System.out.println("The List of Characters are -" + listOfCharacters);

	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		

		ArrayList<ArrayList> superList = new ArrayList<ArrayList>();

		// List of fruits (String)
		ArrayList<String> fruitlist = new ArrayList<String>();
		fruitlist.add("apple");
		fruitlist.add("orange");
		fruitlist.add("grapes");

		// List of phone number (Integer)
		ArrayList<Long> phonenolist = new ArrayList<Long>();
		phonenolist.add((long) 9860066988L);
		phonenolist.add((long) 9234567890L);
		phonenolist.add((long) 9298865432L);

		// List of alphabet (Character)
		ArrayList<Character> alphabetslist = new ArrayList<Character>();
		alphabetslist.add('a');
		alphabetslist.add('b');
		alphabetslist.add('c');

		// Adding all the lists to the superList 
		superList.add(fruitlist);
		superList.add(phonenolist);
		superList.add(alphabetslist);

		//calling the method to print the required list with their types 
		printTypeValues(superList); 
	
		
	}

}
