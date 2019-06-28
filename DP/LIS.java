package DP;

public class LIS {

	private static int lis(int[] arr) {
		
		int[] hash = new int[arr.length];
		
		for (int i=0;i<arr.length;i++) {
			hash[i] = 1;
		}
		
		if(arr.length==1)
			return 1;
		int max = 0;
		for (int i=1;i<arr.length;i++) {
			for (int j=0;j<i;j++) {
				if (arr[i]>arr[j]) {
					hash[i] = Math.max(hash[i],hash[j]+1);
					if (max<hash[i])
						max = hash[i];
				}
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr = {190,22,9,33,21,50,41,60,8};
		System.out.println(lis(arr));
	}
}
