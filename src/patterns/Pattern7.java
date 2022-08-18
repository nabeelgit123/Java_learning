package patterns;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*  pattern no 7
 1
22
333
4444
55555
4444
333
22
1

*/
		for(int i=1;i<=5;i++) //outer loop increasing order
		{
			for(int j=1;j<=i;j++) // inner loop increasing order
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--) // inner loop decreasing order
		{
			for(int j=1;j<=i;j++) // outer loop decreasing order
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
}
