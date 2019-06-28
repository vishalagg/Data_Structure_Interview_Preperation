package leetcode.DP;

import java.util.Scanner;

public class MinimumPathSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = 3;//sc.nextInt();
		int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
		
		for (int i=0;i<size;i++) {
			for (int j=0;j<size;j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
		int[][] hash = new int[size][size];
		System.out.println(getMinSum(grid, 0, 0, size,hash));
	}
	
	private static int getMinSum(int[][] grid,int i,int j,int size,int[][] hash) {
		
		if(i>=size || j>=size) {
			return Integer.MAX_VALUE;
		}

		if(hash[i][j]!=0) {
			return hash[i][j];
		}
		
		if(i==size-1 && j==size-1) {
			return grid[i][j];
		}
//		
//		int rsum = Integer.MAX_VALUE;
//		int dsum = Integer.MAX_VALUE;
//		if(i<size && j<size) {
			int rsum = getMinSum(grid,i+1,j,size,hash);
			int dsum = getMinSum(grid,i,j+1,size,hash);			
//		}
		
		hash[i][j] = grid[i][j] + Math.min(rsum, dsum);
		return hash[i][j];
	}
}
