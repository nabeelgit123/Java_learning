package arrayPrograms;

public class ArrayProgram9
{
	public static void doTanspose(int array[][])
	{
		int transpose[][] = new int[3][2];// for storing transpose array 
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 2; j++) 
			{
				transpose[i][j] = array[j][i];
			}
		}

		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				System.out.print(transpose[i][j] + " ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// given array to do transpose
		int arr1[][] = { { 2, 4, 8 }, { 3, 6, 9 } };
		
		doTanspose(arr1); // method to do transpose
	}

}
