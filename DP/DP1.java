package DP;
//Find the length of the longest sub sequence of a given sequence such that all elements of the sub sequence are sorted in increasing order.

public class DP1 {

	private static int getLIS(int[] arr,int[] hash) {
		
		if (arr.length==1) {
			return 1;
		}
		for (int i=0;i<hash.length;i++) {
			hash[i] = 1;
		}
		int max = 0;
		for (int i=1;i<arr.length;i++) {
			for (int j=0;j<i;j++) {
				if (arr[i]>arr[j])
					hash[i] = Math.max(hash[i],hash[j]+1);
				if (max<hash[i])
					max = hash[i];
			}
		}
		return max;
	}
	
	public static int getLIS(int[] arr) {
		int[] hash = new int[arr.length];
		
		return getLIS(arr,hash);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,22,9,33,21,50,41,60,80};
	
		System.out.println(getLIS(arr));
	}
}
