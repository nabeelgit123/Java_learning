package assessment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*Write a Java Program - 15 Marks 
 * a. To accept the array length from the user and then accept the integer array elements from the user. (2 marks) 
 * b . Print the original array received from the user. (2 Mark) 
 * b. Reverse the array without using any library methods. (3 Mark) 
 * c. Print the Sum of all the elements in the array. (2 Mark) 
 * d. Print the Max element from the array. (3 Marks)
 * e. Remove the duplicates from the array and Print the unique values. (You can convert the array into any suitable Collection if needed.) (3 Marks)*/




public class Program4
{
public static int[] takeInput(int length) 
{
	Scanner sc=new Scanner(System.in);
	int array[]=new int[length];
	for(int i=0;i<length;i++) 
	{
		System.out.println("enter element "+i); 
		int value=sc.nextInt(); // user input integer
		array[i]=value;
		
		
	}
	for(int j=0;j<length;j++) //printing original array
	{
		
		System.out.print(array[j]+" ");
		
	}
	
	return(array);


}

public static void doReverse(int ar[]) 
{
	int reverse[]=ar;
	int length=reverse.length;
	System.out.print("\n reverse=");
	
	for(int i=length-1;i>=0;i--) //printing array in reverse
		
	{
		System.out.print(reverse[i]+" ");
	}


}


public static void doSum(int arr[]) 
{
	int sumar[]=arr;
	int sum=0;
	int length=sumar.length;
	 
	for(int i=0;i<length;i++) 
	{
		
		sum=sum+sumar[i];
	}
	System.out.println("\nsum of array elements = "+sum);


}

public static void findMax(int arrmax[]) 
{
	int max[]=arrmax;
	int length=max.length;
	
	Arrays.sort(max);
	
	System.out.println("the max element = "+max[length-1]);
	


}

public static void removeDuplicate(int dupar[]) 
{
	
int dupli[]=dupar;

HashSet<Object> hs= new HashSet<Object>();
for(Object i:dupli) 
{
	
hs.add(i);

}


System.out.println("without duplicate element ="+hs);



}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many elements you want to enter in array");
		int len=sc.nextInt();
		int arayinput[]=takeInput(len);
		
		doReverse(arayinput);
		doSum(arayinput);
		
		findMax(arayinput);
		
		removeDuplicate(arayinput);
		
		
	}

}
