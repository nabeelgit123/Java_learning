package patterns;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*  
pattern 
##
***
####
*****
 */
		
for(int i=1;i<=5;i++) //outer loop 
{
if(i%2==0) 
{
	for(int j=1;j<=i;j++) 
	{
		System.out.print("#");
		}
	}
else
{
	for(int j=1;j<=i;j++) // outer loop
	{
		System.out.print("*");
		}
}
	System.out.println();
	}
	}
	}


