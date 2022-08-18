package patterns;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* pattern 6
1
**
4*6
*8910

 */		
		int counter=1;
		
		int flag;
		for(int i=1;i<5;i++) // outer loop
		{
			for(int j=1;j<=i;j++) // inner loop
			{ flag=0;
				for( int k=1;k<=counter;k++)
				{
					if(counter%k==0) 
					{
					flag++;
					}
					}
					 if(flag==2 ) 
					{
						System.out.print("*");
						counter++;
					}
					 else 
					 {
						 System.out.print(counter);
						 counter++;
					 }
				
			}System.out.println();
			
			}
		}
	}
