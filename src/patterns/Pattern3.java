package patterns;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*   
55555
4444
333
22
1*/
		for(int i=5;i>=1;i--) //outer loop
		{
			for(int j=1;j<=i;j++) // inner loop
			{
				System.out.print(i);
			}
			System.out.println(); // for new line
		}
	}

}
