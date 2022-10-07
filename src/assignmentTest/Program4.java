package assignmentTest;

import java.util.Scanner;

public class Program4 {

	public static int[]  arrin() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many elements you want to enter in the array");
	int	len=sc.nextInt();
	int arr[]=new int[len];
	for(int i=0;i<len;i++) 
	{
		System.out.println("enter the element "+i);
		int ele=sc.nextInt();
		arr[i]=ele;
	}
		return arr;
		
		}

	public static boolean prime(int ar) 
	{
		int counter = 0;
		//int count = 0;
		for(int i=1;i<=ar;i++) {
		if(ar%i==0) 
		{
			counter++;
		}
		}
		if(counter==2) 
		{
			
			return true;
		}
		return false;
		
		
	}
	
	public static void countPrime(int[] ar)
	{
		//int counter = 0;
		int count=0;
		for(int i=0;i<ar.length;i++) 
		{
			int num = ar[i];
			if(prime(num)) 
			{
				count++;
			}
		}
		System.out.println("count of prime numbers = "+count);
		
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]=arrin();
		countPrime(ar);
		
		

	}

}
