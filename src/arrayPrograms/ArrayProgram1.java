package arrayPrograms;

/*Write a Java program to print the average of all the items in the array. */

public class ArrayProgram1 
{
	public static void getAverage(int arr[]) 
	{

		int sum = 0;// variable for storing the sum of array elements

		double average; // variable for storing average of elements of array

		for (int i = 0; i < arr.length; i++)// loop getting the elements in array for sum

		{
			sum += arr[i]; // adding the elements of array
		}
		average = sum / arr.length; // calculating average 

		System.out.println("average =" + average);

	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int array[] = { 1, 2, 3, 4, 5 };

		getAverage(array);//  method to calculate average
	}

}
