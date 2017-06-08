#June 7, Lab A, Types and Loops
#https://docs.google.com/document/d/1eV7uT7YjQfPOpRBZxyHldur0zDGfQXnIAYfmSAnL_Gk/edit
import java.util.Scanner; 
public class NumberReader
{
  public static void main(String[] args)
  {

	//hooray for being safe with registers	
		int intHeight = 0;
		int intWeight = 0;
		double metricWeight = 0.0;
		double metricHeight = 0.0;
		double userBMI = 0.0;
		boolean isNormal = true;
		char c = null;
		int tmp = 1;
	//init scanner	
		Scanner stdin = new Scanner(System.in);
	//-ask the user their height in inches, as an integer
		System.out.print("Please enter your height in inches:");
		intHeight = stdin.nextInt();
	//-convert it to a variable of type double, by looking up the correct conversion
		metricHeight = intHeight * .025; //metric conversion factor .025 (in:m);
	//- ask the user to enter their weight in pounds
		System.out.print("Please enter your weight in pounds:");
		intWeight = stdin.nextInt();
	//-convert it to a variable of type double, by looking up the correct conversion
		metricWeight = intWeight * .45;//metric conversion factor .45 (lbs:kg);
	//-calculate BMI = weight / height^2 (metric units)
		userBMI = metricWeight / (metricHeight * metricHeight);
	//- create a variable of type boolean called isNormal.  Use an if/else statements to set the value of isNormal to either true or false (remember, no quotes)
		if (userBMI > 25 || userBMI < 19)
			isNormal = false;
	//-ask the user to enter in a character, and store it in the variable c
		System.out.println(“enter a character”);
		c = stdin.next().charAt(0);
	//Use a while loop to print out that many of the character, all on the same line. 
		while (tmp < userBMI)
		{
			System.out.print(c);
			tmp += 1;
		}
	return;
  }
}