import src.GameState;

public class TestGame {

	public static void main(String[] args) {
		testPrintBlocks();
		testSetTile();
		testPlaceBlockEmpty();
		testPlaceBlockPartFull();
		testMergeDown();
		testMergeUp();
		testMergeLeft();
		testMergeRight();
		testSlideUp();
		testSlideDown();
		testSlideLeft();
		testSlideRight();
		checkGetBoard();
		checkUpdateBoard();
		checkLookUp();
		checkLookDown();
		checkLookRight();
		checkLookLeft();
		return;
	}
	
	public static void testPrintBlocks(){
		GameState testBoard = new GameState(4);
		testBoard.placeBlock();
		testBoard.placeBlock();
		testBoard.placeBlock();
		testBoard.placeBlock();
		testBoard.printBoard();
		System.out.println("");
		return;
	}
	
	
	public static int testPlaceBlockEmpty(){
		GameState testBoard = new GameState(4);
		testBoard.placeBlock();
		
		GameState blankBoard = new GameState(4);
		
		if (!checkBoard(testBoard.getBoard(), blankBoard.getBoard()))
		{
			System.out.println("Place block empty: passed");
			return 1;
		}
		else
		{
			System.out.println("Place block empty: failed");
			return 0;
		}
	}
	
	public static int testPlaceBlockPartFull(){
		GameState testBoard = new GameState(4);
		testBoard.setTile(0,0,2);
		testBoard.setTile(1,0,2);
		testBoard.placeBlock();
		
		GameState partialBoard = new GameState(4);
		partialBoard.setTile(0,0,2);
		partialBoard.setTile(1,0,2);
		
		if (!checkBoard(testBoard.getBoard(), partialBoard.getBoard()))
		{
			System.out.println("Place block - partial: passed");
			return 1;
		}
		else
		{
			System.out.println("Place block - partial: failed");
			return 0;
		}
	}
	
	
	public static int testMergeDown(){
		GameState testBoard = new GameState(4);
		testBoard.setTile(2,0,2);
		testBoard.setTile(3,0,2);
		testBoard.mergeDown();

		int[][] validBoard = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{4,0,0,0}};
		if (checkBoard(testBoard.getBoard(), validBoard))
		{
			System.out.println("Merge down: passed");
			return 1;
		} 
		
		else
		
		{
			System.out.println("Merge down: failed");
			return 0;
		}		
	}
	
	public static int testMergeUp(){
		GameState testBoard = new GameState(4);
		testBoard.setTile(0,0,2);
		testBoard.setTile(1,0,2);
		testBoard.mergeUp();

		int[][] validBoard = {{4,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		if (checkBoard(testBoard.getBoard(), validBoard))
		{
			System.out.println("Merge up: passed");
			return 1;
		} 
		
		else
		
		{
			System.out.println("Merge up: failed");
			return 0;
		}		
	}
	
	public static int testMergeLeft(){
		GameState testBoard = new GameState(4);
		testBoard.setTile(0,0,2);
		testBoard.setTile(0,1,2);
		testBoard.mergeLeft();

		int[][] validBoard = {{4,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		if (checkBoard(testBoard.getBoard(), validBoard))
		{
			System.out.println("Merge left: passed");
			return 1;
		} 
		
		else
		
		{
			System.out.println("Merge left: failed");
			return 0;
		}		
	}
	public static int testMergeRight(){
		GameState testBoard = new GameState(4);
		testBoard.setTile(0,2,2);
		testBoard.setTile(0,3,2);
		testBoard.mergeRight();

		int[][] validBoard = {{0,0,0,4},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		if (checkBoard(testBoard.getBoard(), validBoard))
		{
			System.out.println("Merge right: passed");
			return 1;
		} 
		
		else
		
		{
			System.out.println("Merge right: failed");
			return 0;
		}		
	}
	public static int testSlideUp(){
		GameState testBoard = new GameState(4);
		testBoard.setTile(2,0,2);
		testBoard.setTile(3,0,2);
		testBoard.setTile(1,1,2);
		testBoard.setTile(2,1,2);
		testBoard.slideUp();

		int[][] validBoard = {{2,2,0,0},{2,2,0,0},{0,0,0,0},{0,0,0,0}};
		if (checkBoard(testBoard.getBoard(), validBoard))
		{
			System.out.println("Slide up: passed");
			return 1;
		} 
		
		else
		
		{
			System.out.println("Slide up: failed");
			return 0;
		}		
	}
	
	public static int testSlideDown(){
		GameState testBoard = new GameState(4);
		testBoard.setTile(0,0,2);
		testBoard.setTile(1,0,2);
		testBoard.slideDown();

		int[][] validBoard = {{0,0,0,0},{0,0,0,0},{2,0,0,0},{2,0,0,0}};
		if (checkBoard(testBoard.getBoard(), validBoard))
		{
			System.out.println("Slide down: passed");
			return 1;
		} 
		
		else
		
		{
			System.out.println("Slide down: failed");
			return 0;
		}		
	}
	public static int testSlideLeft(){
		GameState testBoard = new GameState(4);
		testBoard.setTile(0,3,2);
		testBoard.setTile(1,3,2);
		testBoard.slideLeft();
		

		
		int[][] validBoard = {{2,0,0,0},{2,0,0,0},{0,0,0,0},{0,0,0,0}};
		if (checkBoard(testBoard.getBoard(), validBoard))
		{
			System.out.println("Slide left: passed");
			return 1;
		} 
		
		else
		
		{
			System.out.println("Slide left: failed");
			return 0;
		}		
	}
	
	public static int testSlideRight(){
		GameState testBoard = new GameState(4);
		testBoard.setTile(0,0,2);
		testBoard.setTile(1,0,2);
		testBoard.slideRight();

		
		int[][] validBoard = {{0,0,0,2},{0,0,0,2},{0,0,0,0},{0,0,0,0}};
		if (checkBoard(testBoard.getBoard(), validBoard))
		{
			System.out.println("Slide right: passed");
			return 1;
		} 
		
		else
		
		{
			System.out.println("Slide right: failed");
			return 0;
		}		
	}
	public static int testSetTile(){
		GameState testBoard = new GameState(4);
		testBoard.setTile(0,0,2);
		if (testBoard.board[0][0] == 2) 
		{
			System.out.println("Set tile: passed");
			return 1;
		} 
		else
		{
			System.out.println("Set tile: failed");
			return 0;
		}
	}
	
	public static int checkUpdateBoard(){
		GameState testBoard = new GameState(4);
		testBoard.setTile(0,0,2);
		testBoard.setTile(1,0,2);
		int[][] outputBoard = {{4,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		testBoard.updateBoard(outputBoard);
		if (checkBoard(testBoard.getBoard(), outputBoard))
		{
			System.out.println("Update Board: passed");
			return 1;
		} 
		else
		{
			System.out.println("Update Board: failed");
			return 0;
		}
		}
	
	public static int checkGetBoard(){
		GameState testBoard = new GameState(4);
		testBoard.setTile(0,0,2);
		testBoard.setTile(1,0,2);
		
		int[][] comparisonBoard = testBoard.getBoard();
		
		if (checkBoard(comparisonBoard, testBoard.board))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public static boolean checkBoard(int[][] a, int[][] b){
		boolean same = true;
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[0].length; j++)
			{
				if (a[i][j] != b[i][j])
				{
					same = false;
					break;
				} 
			}
		}
		return same;
	}
	
	public static int checkLookUp(){
		GameState testBoard = new GameState(4);
		testBoard.setTile(0, 0, 2);
		testBoard.setTile(3, 1, 5);
		
		if(testBoard.canMoveUp(testBoard.board, 0, 0) == false && testBoard.canMoveUp(testBoard.board,3,1) == true)
		{
			System.out.println("Look Up: passed");
			return 1;
		}
		else
		{
			System.out.println("Look Up: failed");
			return 0;
		}
	}
	
	public static int checkLookDown(){
		GameState testBoard = new GameState(4);
		testBoard.setTile(0, 0, 2);
		testBoard.setTile(3, 1, 5);
		
		if(testBoard.canMoveDown(testBoard.board, 0, 0) == true && testBoard.canMoveDown(testBoard.board,3,1) == false)
		{
			System.out.println("Look Down: passed");
			return 1;
		}
		else
		{
			System.out.println("Look Down: failed");
			return 0;
		}
	}
	
	public static int checkLookRight(){
		GameState testBoard = new GameState(4);
		testBoard.setTile(0, 0, 2);
		testBoard.setTile(3, 3, 5);
		
		if(testBoard.canMoveRight(testBoard.board, 0, 0) == true && testBoard.canMoveRight(testBoard.board,3,3) == false)
		{
			System.out.println("Look Right: passed");
			return 1;
		}
		else
		{
			System.out.println("Look Right: failed");
			return 0;
		}
	}
	
	public static int checkLookLeft(){
		GameState testBoard = new GameState(4);
		testBoard.setTile(0, 0, 2);
		testBoard.setTile(3, 3, 5);
		
		if(testBoard.canMoveLeft(testBoard.board, 0, 0) == false && testBoard.canMoveLeft(testBoard.board,3,3) == true)
		{
			System.out.println("Look Left: passed");
			return 1;
		}
		else
		{
			System.out.println("Look Left: failed");
			return 0;
		}
	}
	

}
