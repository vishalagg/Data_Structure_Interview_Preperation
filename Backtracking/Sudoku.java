package Backtracking;

public class Sudoku {
	
	public static void display(int[][] grid) {
		for (int i=0;i<grid.length;i++) {
			for (int j=0;j<grid.length;j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}		
	}
	
	public static boolean canPlace(int[][] grid,int row,int col,int num) {
		
		for (int i=0;i<grid.length;i++)
			if (grid[row][i]==num) 
				return false;
			
		for (int i=0;i<grid.length;i++)
			if (grid[i][col]==num) 
				return false;
		
		int sqrt = (int) Math.sqrt(grid.length);
		int boxRowStartIndex = (row - row%sqrt);
		int boxColStartIndex = (col - col%sqrt);
		
		for (int i=boxRowStartIndex;i<boxRowStartIndex+sqrt;i++) 
			for (int j=boxColStartIndex;j<boxColStartIndex+sqrt;j++)
				if (grid[i][j]==num)
					return false;
		
		return true;
	}
	
	public static boolean solve(int[][] grid) {

		boolean isFulllyCompleted = true;
		int row=-1,col=-1;
		for (int i=0;i<grid.length;i++) {
			for (int j=0;j<grid.length;j++) {
				if (grid[i][j] == 0) {
					isFulllyCompleted = false;
					row = i;
					col = j;
				}
			}
		}
		if (isFulllyCompleted)
			return true;
		
		for(int n=1;n<=grid.length;n++) {
			if (canPlace(grid,row,col,n)) {
				grid[row][col] = n;
				
				if(solve(grid))
					return true;
				
				grid[row][col] = 0;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int N = 9;
		int[][] grid = {{3, 0, 6, 5, 0, 8, 4, 0, 0}, 
                {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
                {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
                {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
                {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
                {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
                {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
                {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};
		if(solve(grid))
			display(grid);
		else
			System.out.println("There is no solution exist");
	}
}
