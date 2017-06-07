import java.util.Scanner; 
public class NumberReader
{
  public static void main(String[] args)
  {
    Scanner stdin = new Scanner(System.in);
     System.out.print("1. English\n2. Espanol\n");
        int language_selection = stdin.nextInt();
    System.out.print("Enter an integer:");
     try {
        int number = stdin.nextInt();
   String output = maskInteger(number, language_selection);
        System.out.println(output);
     } finally {
        System.err.println("Enter an integer, please.");
     }
  }
   public static String maskInteger(int number, int language_selection){
      String maskedInteger = "Enter Integer";
      if (language_selection == 1)
         switch(number){
         case 0: maskedInteger = "Zero";break;
         case 1: maskedInteger = "One";break;
         case 2: maskedInteger = "Two";break;
         case 3: maskedInteger = "Three";break;
         case 4: maskedInteger = "Four";break;
         case 5: maskedInteger = "Five";break;
         default: maskedInteger = "I am not sure";break;
      }
      else if (language_selection == 2)
         switch(number){
         case 0: maskedInteger = "Cero";break;
         case 1: maskedInteger = "Uno";break;
         case 2: maskedInteger = "Dos";break;
         case 3: maskedInteger = "Tres";break;
         case 4: maskedInteger = "Cuatro";break;
         case 5: maskedInteger = "Cinco";break;
         default: maskedInteger = "No estoy seguro";break;
      }
      return maskedInteger;
   }
}

