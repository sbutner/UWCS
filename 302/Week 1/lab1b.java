import java.util.Scanner; 
public class HealthScore
{
  public static void main(String[] args)
  {
    Scanner stdin = new Scanner(System.in);
    System.out.print("Welcome to HealthScore!\nAnswer four simple questions and get\na grade for your health.");
	int total_score = 0;
	int score_1 = askBoolean("Do you wake up feeling tired?");
	int score_2 = askBoolean("Are you winded after walking up a flight of stairs?");
	int score_3 = askBoolean("Is your waist wider than your shoulders?");
	int score_4 = askBoolean("Do you agonize over why there are things instead of not things?");
	total_score = 4 - score_1 + score_2 + score_3 + score_4;
	String healthReport = "Answer your questions";
	switch(total_score){
		case 4: healthReport = "You're in fabulous health."; break;
		case 3: healthReport = "You're in OK health."; break;
		case 2: healthReport = "You're in kinda crummy health."; break;
		case 1: healthReport = "You're in terrible health."; break;
		case 0: healthReport = "You should turn this around"; break;
	}
	System.out.print(healthReport);
  }
   public static int askBoolean(String question){
	Scanner stdin = new Scanner(System.in);
	System.out.println("\nType 1 for yes, 2 for no.");
	System.out.print(question);
	int answerRaw = stdin.nextInt();
	int answerValue = answerRaw - 1;
	return answerValue;
   }
  
}

