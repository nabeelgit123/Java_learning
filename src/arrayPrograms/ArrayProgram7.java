package arrayPrograms;

/*Using Normal 2d array*/
public class ArrayProgram7 {

	public static void convertToMultiDim(int array1[], int array2[], int array3[]) 
	{
		int arr4[][] = new int[3][4]; // 2d array for storing given  array
		
		// logic for storing the given arrays in 2d array
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 4; j++) 
			{
				if (i == 0) 
				{
					arr4[i][j] = array1[j];
				}
				if (i == 1) 
				{
					arr4[i][j] = array2[j];
				}
				if (i == 2) 
				{
					arr4[i][j] = array3[j];
				}
			}
		}
		
		System.out.println(" after converting the given arrays into one single multidimensional array ");
		System.out.println("arr4 = ");
		// printing the stored array in 2d array 
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 4; j++)
			{
				System.out.print(arr4[i][j]+" ");

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// given arrays to convert into single multidimensional array
		int arr1[] = { 3, 5, 7, 9 };
		int arr2[] = { 2, 4, 6, 8 };
		int arr3[] = { 0, 3, 6, 9 };
		
		convertToMultiDim(arr1, arr2, arr3);// method for converting  the given arrays into single multidimensional array  

	}

}
