package DP;

public class WaysToCoverADistance {
	
	private static int count = 0;
	private static int totalWays(int n,int i,int[] hash){
		
//		if (i==n){
//			count+=1;
//			return;
//		}
//		if(i>n)
//			return;
//		totalWays(n,i+1);
//		totalWays(n,i+2);
//		totalWays(n,i+3);
		
		hash[0] = 1;
		hash[1] = 1;
		hash[2] = 2;
		
		for (int idx=3; idx<=n; idx++) 
            hash[idx] = hash[idx-1] + hash[idx-2] + hash[idx-3];
		
		return hash[n];
	}

	public static void main(String[] args) {
		
		int n = 4;
		int[] hash = new int[n+1];
//		totalWays(n,0,hash);
		System.out.println(totalWays(n,0,hash));
	}
}
