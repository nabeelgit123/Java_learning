package patterns;

public class Pattern2 {
/*  
1
22
333
4444
55555

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) // outer loop
		{
			for(int j=1;j<=i;j++) // inner loop
			{
				System.out.print(i);
			}
			System.out.println(); // for new line
		}
	}

}
