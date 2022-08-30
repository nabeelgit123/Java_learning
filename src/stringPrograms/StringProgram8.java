package stringPrograms;

/*Q8 Write a program which will concat 2 strings and print the output. (Do not use inbuilt methods)
Eg : Str 1 = Rahul , Str2 = Dravid
Output = RahulDravid
*/

public class StringProgram8 {

	public static void concat(String str1cp, String str2cp) 
	{
		int length1 = str1cp.length();

		int length2 = str2cp.length();

		char arr[] = new char[length1 + length2];

		for (int i = 0; i < length1; i++)// concatenating 1st String to arr
		{
			arr[i] = str1cp.charAt(i);
		}

		int index = 0; // for arr2 indexing
		for (int j = length1; j < arr.length; j++) // concatenating 2nd String to array3
		{

			arr[j] = str2cp.charAt(index);
			index++; // incrementing index for arr2
		}

		System.out.print(arr);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Rahul";
		String str2 = "Dravid";
		concat(str1, str2);

	}

}
