package DP;

public class CoinChangeProblem {
	
	public static int countWays(int[] s,int n) {
		int[] counts = new int[n+1];
		counts[0] = 1;
		for(int amount: s){
			for (int i=amount;i<=n;i++) {
				counts[i] += counts[i-amount];
			}			
		}		
		return counts[n];
	}

	public static void main(String[] args) {
		int n = 10;
		int[] s = {2,5,3,6};
		System.out.println(countWays(s,n));
	}
}
