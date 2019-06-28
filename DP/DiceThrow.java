package DP;
//Given n dice each with m faces, numbered from 1 to m, find the number of ways to get sum X. X is the summation of values on each face when all the dice are thrown.

public class DiceThrow {

	private static int count = 0;
	private static void helper(int m,int n,int x) {
		
		if(n==0 && x==0) {
			count +=1;
			return;
		}
		if (n==0) {
			return;
		}
		for (int i=1;i<=m && x>=i && n>=1;i++){
			helper(m,n-1,x-i);			
		}
	}
	
	public static void main(String[] args) {
		
		int m = 4;
		int n = 2;
		int x = 5;
		
		int[][] hash = new int[n][x];
		helper(m,n,x);
//		int c = helper2(m,n,x,hash);
		System.out.println(count);
	}
}
