//warmup exercise: link
//https://docs.google.com/document/d/1MnuTUMyaVcJwIpAWzPRJa2gVI12J0xjI5GD9gvvRS4Y/edit

import java.util.Scanner;
 
public class ClassNameHere {
   public static void main(String[] args) {
      System.out.println("Welcome to HeathScore");
      System.out.println("Please answer the following 3 questions.");
      
      Scanner stdin = new Scanner(System.in);
      // a base score will be 10
      int score = 10;  
      System.out.println("your starting score is " + score);
      
      
      System.out.println("What is your good (HDL) cholesterol number?");
      int chol = stdin.nextInt();
      if (chol > 60)
         score = score + 5;
      else if (chol >= 40)
         score = score + 1;
      else
         score = score - 1;
      System.out.println("your score is currently " + score);
      
      
      
      System.out.println("What is your fasting glucose level?");
      int glucose = stdin.nextInt();
      if (glucose < 80)
         score = score + 5;
      else if (glucose < 100)
         score = score + 1;
      else if (glucose < 125)
         score = score - 2;
      else
         score = score - 5;
      System.out.println("your score is currently " + score);
            
      System.out.println("Do you smoke? (enter 1 for yes and 2 for no)");
      int smoker = stdin.nextInt();
      if (smoker == 1)
         score = score - 10;
      else
         score = score + 1;
      
      System.out.println ("your final score is  " + score);
      
      if (score > 20)
         System.out.println("You are in great health!!");
      else if (score > 16)
         System.out.println("You are good health, but you can improve.");
      else if (score > 10)
         System.out.println("You need to make some changes");
      else
         System.out.println(" ---???--- ");
      
   }
}
