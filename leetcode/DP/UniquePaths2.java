package leetcode.DP;

import java.util.Scanner;

public class UniquePaths2 {
	
	private static int count = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = 3;//sc.nextInt();
		int[][] grid = new int[size][size];
//		grid = {{0,0,0},{0,1,0},{0,0,0}};
		
		for (int i=0;i<size;i++) {
			for (int j=0;j<size;j++) {
				if(i==1 && j==1) {
					grid[i][j] = 1;
				}else{
					grid[i][j] = 0;
				}
			}
		}
		for (int i=0;i<size;i++) {
			for (int j=0;j<size;j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
		countPaths(grid,size,0,0);
		System.out.println(count);
	}
	
	private static boolean countPaths(int[][] grid,int size,int i, int j) {
		
		if(i>=size || j>= size) {
			return false;
		}
		
		if(i==size-1 && j==size-1) {
			count+=1;
			return true;
		}
		
		if(grid[i][j]==1) {
			return false;
		}else{			
			boolean moveRight = countPaths(grid,size,i+1,j);
			boolean moveDown = countPaths(grid,size,i,j+1);

			return moveRight || moveDown;
		}
		
	}
}
