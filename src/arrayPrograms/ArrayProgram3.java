package arrayPrograms;

/*Write a Java program to remove the duplicate numbers from an array */
public class ArrayProgram3
{
	public static void removeDupli(int arr[]) 
	{
		int l = arr.length;// getting array length
		
		for (int i = 0; i < l - 1; i++)
		{
			for (int j = i + 1; j < l; j++)
			{
				if (arr[i] == arr[j]) // checking if same element exists 
				{
					arr[j] = arr[l - 1]; // copying/replacing the last element in place of the duplicate
					l--;  // getting rid of last elements that are duplicate
				}
			}
		}
		
		System.out.println("\n Array after removing the duplicate elements");
		
		 //for printing array without duplicate elements
		for (int i = 0; i < l; i++)
		{
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = { 1, 2, 3, 3, 4, 5, 9, 5, 1 };

		System.out.println("Array before removing duplicate elements");
		for (int i = 0; i < array.length; i++)//Printing array with duplicate
		{
			System.out.print(array[i] + " ");
		}

		removeDupli(array); // method to remove duplicate elements
	}

}
