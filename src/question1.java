import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);		
		//Ask for the # of attempts
		System.out.print("Enter the number of passing attempts: ");
		Double passingAttempts = input.nextDouble();
		//Ask for # of completions
		System.out.print("Enter the number of completions: ");
		Double Completions = input.nextDouble();
		//Ask for # of passing yards
		System.out.print("Enter the numbner of passing yards: ");
		Double PassingYards = input.nextDouble();
		//Ask for the # of TD passes
		System.out.print("Enter the numbner of Touchdown Passes: ");
		Double TDPass = input.nextDouble();
		//Ask for # of interceptions
		System.out.print("Enter the numbner of Interceptions: ");
		Double Interceptions = input.nextDouble();
		//Calculate PasserRating FOrmula
		Double PasserRating;
		PasserRating = ((8.4*passingAttempts)+(330*TDPass)+(100*Completions)-(200*Interceptions)/passingAttempts);
		System.out.print("Your Quarterback's passer rating is: "+PasserRating);
		
	}

}
