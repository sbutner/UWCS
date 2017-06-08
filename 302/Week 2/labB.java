import java.util.Scanner;

public class ClassNameHere {
   public static void main(String[] args) {
	Scanner stdin = new Scanner(System.in);
	System.out.println("enter a message");
	String message = stdin.nextLine();
    System.out.println("upper case: " + message.toUpperCase());
	System.out.println("first character: " + message.charAt(0));
	System.out.println("length: " + message.length()); 
	System.out.println("contains an e" + message.contains("e"));
	System.out.print("in code point form: ");
	System.out.print("This bytes:" + message.getBytes());
	int idx = 0;
	while (idx < message.length()){
		System.out.print(message.charAt(idx));
		idx += 1;
	}
	System.out.println("hashed: " + message.hashCode());
	System.out.println("index of e: " + message.indexOf("e"));
	System.out.println("enter an index ");
	int index = stdin.nextInt();
	System.out.println("char at " + index + ": " + message.charAt(index));
	System.out.println("substring(1,4) prints out: " + message.substring(1,4));
	System.out.println("Enter a second message: ");
	String otherMessage = stdin.nextLine();
	System.out.println("compare to: " + message.compareTo(otherMessage));
	System.out.println("equals " + message.equals(otherMessage));
   }
}