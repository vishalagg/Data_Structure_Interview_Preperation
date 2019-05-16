package Array;

import java.util.Arrays;
//Algorithm to find the triplet whose sum is X

public class Array13 {
	
	private static void printTripletsWithSumK(int[] arr, int k) {
		
		int p;
		int m, n;
//				{1,2,3,4,5,7,9}
		for (int i=0;i<arr.length;i++) {
			p = k-arr[i];
//			System.out.println(p);
			m = i+1;
			n = arr.length-1;
			while (m<arr.length && n>m) {
//				System.out.println(arr[m]+" "+arr[n]);
				if (arr[m]+arr[n]==p){
					System.out.println("Triplet found : "+arr[i]+" "+arr[m]+" "+arr[n]);
					m += 1;
					n -= 1;
				}
				if (arr[m]+arr[n]>p) {
					n -= 1;
				}
				if (arr[m]+arr[n]<p) {
					m += 1;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,4,2,5,3,9,7};
		int k = 9;
		
		Arrays.sort(arr);
		printTripletsWithSumK(arr,k);
	}
}
