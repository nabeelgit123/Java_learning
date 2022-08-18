package numberprogram;
// Write a program to print  first 20 Fibonacci Series

public class program1 {
	public static void fibonacciSeries(int parameterPassed) {
		int firstNumber = 0, secondNumber = 1, nextNumber = 0;
		System.out.println(secondNumber);
		for (int i = 1; i <= parameterPassed; i++) 
		{
			nextNumber = firstNumber + secondNumber;
			System.out.println(nextNumber);
			firstNumber = secondNumber; 
			secondNumber = nextNumber;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("fibonacci Series first 20 are as follows");
		fibonacciSeries(20);
	}

}
