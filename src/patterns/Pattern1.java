package patterns;

public class Pattern1 {
	/*
	  1
	  23
	  456
	  78910
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=1;
		for(int i=1;i<=4;i++) // outer loop
		{
			for(int j=1;j<=i;j++) // inner loop
			{
				System.out.print(counter);
				counter++;
			}
			System.out.println(); // for new line 
		}
	}

}

