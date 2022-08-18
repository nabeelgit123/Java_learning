package patterns;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*  
1
212
32123
4321234
543212345

 */
		for(int i=1;i<=5;i++) {
			
			for(int j=i;j>=1;j--) // prints till 1
			{
				System.out.print(j);
			}
	       for(int k=2;k<=i;k++) //print from 2 increasing order
	       {
	    	   System.out.print(k);
	       }
		
		System.out.println();
		}
	}
	}

