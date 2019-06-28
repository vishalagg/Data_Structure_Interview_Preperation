package leetcode.DP;

public class LongestPalindromicSubsequence {
	
	public static void main(String[] args) {
		
		String s = "abca";
		int[][] hash =new int[s.length()][s.length()];
		
		System.out.println(helper(s,0,s.length()-1,hash));
	}
	
	private static int helper(String s,int i,int j,int[][] hash) {
		if (i==j) {
			hash[i][j] = 1;
			return 1;
		}
		
		if (s.charAt(i)==s.charAt(j) && i+1==j){
			hash[i][j] = 2;
			return 2;
		}
		
		if (hash[i][j]!=0) {
			return hash[i][j];
		}
		
		if (s.charAt(i)==s.charAt(j)) {
			hash[i][j] = helper(s,i+1,j-1,hash) + 2;
//			return helper(s,i+1,j-1,hash) + 2;
		}else {
			hash[i][j] = Math.max(helper(s,i+1,j,hash), helper(s,i,j-1,hash));
//			return Math.max(helper(s,i+1,j,hash), helper(s,i,j-1,hash));
		}
		return hash[i][j];
	}
}
