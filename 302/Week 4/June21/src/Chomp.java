import java.util.Scanner;
import java.util.Random;
 
public class Chomp{
	// private Class variables ... visible to this class only
	private static final char FULL = 'X';
	private static final char EMPTY = '.';
	private static final char POISON = 'P';
	private static char [][] grid;
	private static int numRows;
	private static int numCols;
	private static Scanner stdin;
	private static Random randGen;
	private static boolean gameOver;
			
	public static void main(String[] args) {
		stdin = new Scanner(System.in);
		randGen = new Random();
		System.out.println("Welcome to Chomp!");
		System.out.print("how many rows? ");
		numRows = stdin.nextInt();
		System.out.print("how many columns? ");
		numCols = stdin.nextInt();
		grid = new char[numRows][numCols];
		gameOver = false;
		boolean humanwinner = false;
		fillGrid();
		printGrid();
		while (gameOver == false)
		{
			humansTurn();
			gameOver = checkGameOver();
			humanwinner = true;
			computersTurn();
			gameOver = checkGameOver();
			humanwinner = false;
		}
		System.out.println("the game is over!");
		if ( humanwinner ){
			System.out.println("You win!");
		} else {
			System.out.println("Better luck next time!");
		}
	}// end of main method
	
	// fill the grid with the initial values:  FULL, or POISON
	private static void fillGrid()
	{
		for ( int i=0; i < numRows; i++ ){
			for ( int j = 0; j < numCols; j++ ){
				grid[i][j] = FULL;
			}
		}
		grid[numRows - 1][0] = POISON;
 
	}
	
	// print out the contents of the grid in a grid-like pattern.
	private static void printGrid()
	{
		for ( int i = 0; i < numRows; i++ ){
			for ( int j = 0; j < numCols; j++ ){
				System.out.print(grid[i][j]);
			}
			System.out.println(' ');
		}
 
	}
	

 
	private static void chomp(int startRow, int startCol )
	{
		// change certain cells to the right and above 
		for ( int i = startRow; !(i < 0); i-- ){
			for ( int j = (numCols - 1); j > (startCol-1); j-- ){
				grid[i][j] = EMPTY;
			}
		}
		printGrid();
	}
	
private static void humansTurn()
	{
		System.out.println("It\'s your turn.");
		System.out.println("Enter a row" );
		int r = stdin.nextInt() - 1;
		stdin.nextLine();
		System.out.println("Enter a column");
		int c = stdin.nextInt() - 1;
		stdin.nextLine();
		chomp(r,c);	
		System.out.println("press any key to continue");
		stdin.nextLine();
	}
	
	// you need to add code to this method to make it follow the rules
	private static void computersTurn()
	{
		boolean valid = false;
		System.out.println("It\'s my turn.");
		while (valid == false){
			int r = randGen.nextInt(numRows);
			int c = randGen.nextInt(numCols);
			valid = checkValid(r,c);
			if (valid){
				System.out.println("I chose row " + (r + 1) + " and column " + (c + 1));
				chomp(r,c);	
			}
		}
		return;
		
	}
	
	private static boolean checkGameOver()
	{
		//TODO: refactor to more efficient than exponential
		int countFull = 0;
		for (int i = 0; i < numRows; i++){
			for (int j = 0; j < numCols; j++) {
				if ( grid[i][j] == FULL ){
					countFull += 1;
				}
			}
		}
		if ( countFull < 2 ) {
			return true;
		} 
		return false; 
	}
	
	private static boolean checkValid(int row, int col)
	{
		if ( row <= numRows && col <= numCols ){
			return ( (grid[row][col] == FULL));
			} else {
			return false;
		}
	}
}
 
