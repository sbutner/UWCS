import java.util.Scanner;
public class LabA {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the length of the array");
		int arraySize = stdin.nextInt();
		int [] values = new int[arraySize];
		for ( int i = 0; i < arraySize; i++ ){
			System.out.print("Enter the value for element # " + i);
			values[i] = stdin.nextInt();
		}
		
		int max = 0;
		for ( int i = 0; i < values.length; i++ ){
			if (values[i] > max){
				max = values[i];
			}
		}
		System.out.println("The maximum value is " + max );
		
		System.out.println("enter a element to search for in the array");
		int target = stdin.nextInt();
		int index = 0;
		boolean found = false;
		
		while (found == false){
			if (values[index] == target){
				found = true;
			}else{
			index += 1;
			}
		}
		if (found){
			System.out.println(target + " is in the array.");
		}

	}

}
