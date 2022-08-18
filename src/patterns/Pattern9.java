package patterns;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/* patttern 9 
1
222
33333
4444444
555555555

 */
for(int i=1;i<=5;i++) 
{
	int pattern=2*i-1;
	for(int j=1;j<=pattern;j++) 
	{
		System.out.print(i);
	}
	System.out.println();
}
	}

}
