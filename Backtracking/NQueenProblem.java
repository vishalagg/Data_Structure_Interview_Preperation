package Backtracking;

public class NQueenProblem {

	public static int size = 5;

	private static boolean canPlace(int[][] board, int row, int col) {
		
		for (int i=0;i<=row;i++) {
			if (board[i][col]==1)
				return false;
		}
		
		for (int i=row,j=col;i>=0&&j>=0;i--,j--) {
			if (board[i][j]==1)
				return false;
		}

		for (int i=row,j=col;i>=0&&j<size;i--,j++) {
			if (board[i][j]==1)
				return false;
		}
		return true;
	}
	
	public static void display(int[][] board){
		
		for (int i=0;i<size;i++) {
			for (int j=0;j<size;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("*******************************");
	}
	
	public static boolean helperNQ(int[][] board,int row) {
		if (row>=size){
			display(board);
			return true;
		}		
		
		boolean response = false;
		for (int i=0;i<size;i++) {
			
			if (canPlace(board,row,i)) {
				board[row][i] = 1;
				response = helperNQ(board,row+1) || response;
				board[row][i] = 0;
			}
		}
		return response;
	}
	

	public static void NQAns(int[][] board) {
		System.out.println(helperNQ(board,0));
	}
	
	public static void main(String[] args) {	
//		int[][] board = new int[size][size];
		int board[][] = {{0, 0, 0, 0,0}, 
	            {0, 0, 0, 0,0}, 
	            {0, 0, 0, 0,0}, 
	            {0, 0, 0, 0,0},
	            {0, 0, 0, 0,0}
	        }; 
		NQAns(board);
	}
}
