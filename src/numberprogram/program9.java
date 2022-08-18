package numberprogram;

/*Write a program to Print the Second Even Armstrong Number in the range of 100-10000.
 The method should return the value and print it in main().
*/

public class program9 {
	static int secondEvenArmstrongFound;

	public static int giveSecondEvenArmstrongNumber(int givenStartNumber, int givenEndNumber)

	{

		int count = 0;
		int returnSecondArmstrong = 0;
		for (int i = givenStartNumber; i <= givenEndNumber; i++)

		{

			int length = 0;
			int tempForLength = i;
			int tempForCube = i;
			while (tempForLength > 0) {
				length++;
				tempForLength = tempForLength / 10;
			}
			int getSingleDigit = 0;
			int sum = 0;
			while (tempForCube > 0) {
				int storeMulti = 1;
				getSingleDigit = tempForCube % 10;
				for (int j = 1; j <= length; j++) {
					storeMulti = storeMulti * getSingleDigit;
				}
				sum = sum + storeMulti;
				tempForCube = tempForCube / 10;
			}
			if (sum == i) {
				System.out.println("armstrong number is" + sum);
				if (sum % 2 == 0) {

					count++;

					if (count == 2) {

						returnSecondArmstrong = sum;
					}
				}
			}
		}
		return (returnSecondArmstrong);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startOfRange = 100;
		int endOfRange = 10000;
		
		System.out.println("the second even armstrong is here :" + giveSecondEvenArmstrongNumber(startOfRange, endOfRange));
//System.out.println(giveSecondEvenArmstrongNumber(startOfRange,endOfRange));

	}

}
