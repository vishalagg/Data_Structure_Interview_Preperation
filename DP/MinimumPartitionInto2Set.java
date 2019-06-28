package DP;

public class MinimumPartitionInto2Set {

	static int c=0;
	private static int helper(int[] arr,int i,int currSum,int total) {
		
		c += 1;
		if(i==0) {
			return Math.abs((total-currSum)-currSum);
		}
		else {
			return Math.min(helper(arr,i-1,currSum+arr[i-1],total), helper(arr,i-1,currSum,total));
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,6,11,5};
		int total = 0; 
        for (int i = 0; i < arr.length; i++) 
            total += arr[i];
		System.out.println(helper(arr,arr.length,0,total)+"  "+c);
	}
}
