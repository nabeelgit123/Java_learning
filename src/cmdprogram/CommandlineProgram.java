package cmdprogram;

/*Write a Java Program to accept 3 arguments from the user as command line arguments.
1st Param should be Name {eg - Nabeel}
2nd Param should be Age {eg - 15}
3rd Param should be Country {eg - Australia}

If the country is not India then display below message - 
OOPS!!! Nabeel , Aadhar card can only be applied for Indian Citizen.
Regards,
UDID team

If country is India,  and age is greater than 70 then display below message
OOPS!!! Nabeel , Aadhar card can only be applied for citizens upto age of 70.
Regards,
UDID team

If country is India,  and age is less than 70 then display below message
CONGRATULATIONS!!! Nabeel , Your Request for an Aadhar card has been accepted.
Regards,
UDID team

*/


public class CommandlineProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String country = args[0]; // storing country name from command line
		int age = Integer.parseInt(args[1]); // storing age from command line (from string to int)
		String name = args[2]; // storing name from command line
		String countrydup = "India"; // for comparison
		

		
			
			if (country.equals(countrydup))
			{
				if (age > 70) 
				
				{
					System.out.println(
							" OOPS!!!"+name +" , Aadhar card can only be applied for citizens upto age of 70.\n Regards,\n UDID team");
				}

				if (age <= 70)

				{
					System.out.println(
							"CONGRATULATIONS!!!"+name+ " , Your Request for an Aadhar card has been accepted.\n Regards,\n UDID team");
				}

			}
			else
			{
				System.out.println(
						"OOPS!!!"+name+" , Aadhar card can only be applied for Indian Citizen.\n Regards,\n UDID team");

			}
		}
	}


