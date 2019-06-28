package DP;

import java.util.Arrays;

public class LCS {

	public static int[][] hash;
	public static int lcs(String s1, String s2, int m, int n, int[][] hash) {
		
		if (m<0 || n<0) {
			return 0;
		}
		if (hash[m][n] != -1) {
			return hash[m][n];
		}
		if (s1.charAt(m) == s2.charAt(n)) {
			hash[m][n] = 1 + lcs(s1, s2, m-1, n-1,hash);
			System.out.println( s1.charAt(m) + " " + s2.charAt(n));
			return hash[m][n];
		}
		hash[m][n] = Math.max(lcs(s1,s2,m-1,n,hash), lcs(s1,s2,m,n-1,hash));
		return hash[m][n];
	}
	
	public static void main(String[] args) {
	
		String s1 = "ABCDGH";
		String s2 = "AEDFHR";
		
		hash = new int[s1.length()][s2.length()];
		
		for (int[] row: hash)
		    Arrays.fill(row, -1);
		
		System.out.println(lcs(s1, s2, s1.length()-1, s2.length()-1,hash));
		for(int[] row: hash) {
			for(int value: row) {
				System.out.print(value+ " ");
			}
			System.out.println();
		}
	}
}
