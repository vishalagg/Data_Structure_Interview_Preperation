package leetcode.DP;

public class TrianngleMinPathSum {
	
	public static void main(String[] args) {
		
		int height = 4;//sc.nextInt();
//		int width = 4;
		int[][] grid = {{2},{3,4},{6,5,1},{4,1,8,3}};
		
		int[][] hash = new int[height][height];
		System.out.println(getMinSum(grid, 0, 0, height, hash));
	}
	
	private static int getMinSum(int[][] grid,int i,int j,int height,int[][] hash) {
		if(j>i || i>=height){
			return 0;
		}
		
		if (hash[i][j]!=0) {
			return hash[i][j];
		}
		
		if (i==height-1){
			return grid[i][j];
		}
		int leftSum = getMinSum(grid,i+1,j,height,hash);
		int rightSum = getMinSum(grid,i+1,j+1,height,hash);
		
		hash[i][j] = grid[i][j] + Math.min(leftSum, rightSum);
		return hash[i][j];
	}
}
