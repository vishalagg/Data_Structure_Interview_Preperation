package DP;

import java.util.Scanner;

public class Test {
	private static int max_coin;
	private static int helper(int x, int y, boolean isBlasted, int coins, int[][] grid) {
		
		if(x<0 || y<0 || x>5 || y>4) {
			if(coins > max_coin)
				max_coin = coins;
				return coins;
		}
		
//		If bomb has not been used
		if (!isBlasted) {
			
			for (int i=1;i<6;i++) {
				for (int j=0;j<5;j++){
					if(x-i>=0)
						if(grid[x-i][j]==2)
							grid[x-i][j] = 0;					
				}
			}
			
			int left = helper(x-1,y-1,true,coins,grid);
			int inPlace = helper(x-1,y,true,coins,grid);
			int right = helper(x-1,y+1,true,coins,grid);
			
			coins += Math.max(left,Math.max(inPlace,right));
			if(max_coin < coins) 
				max_coin = coins;
		}
//		helper(x-1,y-1)
		
		return 0;
	}

	public static void main(String[] args) {
		int m = 5;
		Scanner sc = new Scanner(System.in);
		int[][] grid = new int[100][6];
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
				grid[i][j] = sc.nextInt();
		
		boolean isBlasted = false;
		int i = helper(n-1,1,isBlasted,0,grid);
		int j = helper(n-1,2,isBlasted,0,grid);
		int k = helper(n-1,3,isBlasted,0,grid);
		System.out.println(Math.max(i,Math.max(j,k)));
	}

}