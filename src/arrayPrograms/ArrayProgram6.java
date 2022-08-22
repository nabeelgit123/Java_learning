package arrayPrograms;

public class ArrayProgram6 {
	public static void sortConcat(int arr1[], int arr2[])
	{
		int array3[] = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++)// concatenating 1st array to  array3
		{
			array3[i] = arr1[i];
		}

		int index = 0; // for arr2 indexing
		for (int j = arr1.length; j < array3.length; j++) // concatenating 2nd array to array3
		{

			array3[j] = arr2[index];
			index++; // incrementing index for arr2
		}

		System.out.println("before sorting  concatenated array");

		for (int k = 0; k < array3.length; k++) // for printing concatenated array
		{

			System.out.print(array3[k] + " ");

		}

		System.out.println("\n after sorting concatenated array");
		System.out.println("array3 = "); // array3 stores the concatenated and sorted array 
		int temp = 0;
		
		// logic for sorting Array
		for (int i = 0; i < array3.length; i++)
		{		
			for (int j = i + 1; j < array3.length; j++)
			{
				if (array3[i] > array3[j]) 
				{
					temp = array3[i];
					array3[i] = array3[j];
					array3[j] = temp;
				}
			}

		}

		for (int i = 0; i < array3.length; i++) //for printing the sorted array
		{
			System.out.print(array3[i] + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// given arrays to concatenate and sort 
		int array1[] = { 3, 5, 1, 0, 4 };
		int array2[] = { 7, 9, 8, 6, 2 };
		
		
		sortConcat(array1, array2); // method to concatenate the 2 arrays and sort them

	}

}
