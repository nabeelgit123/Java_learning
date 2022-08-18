package numberprogram;

//Write a program to Print the Prime Numbers from 1-100.

public class program3 {

	public static void primeNumbers(int startRange,int endRange) 
	{
		
		for (int i=startRange;i<=endRange;i++) 
		{int flag=0;
			for(int j=1;j<=i;j++) 
			{
				if(i%j==0) 
				{
				   flag++;	
					
				}
			}
			if(flag==2)
			{
				System.out.println(i);
			}
			
			
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenStartRange=1;
		int givenEndRange=100;
	    System.out.println("prime numbers from 1-100");
		primeNumbers(givenStartRange,givenEndRange);
	}

}
