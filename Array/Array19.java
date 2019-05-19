package Array;
//Algorithm to find the contiguous sub-array with maximum sum, for a given array of postive and negative numbers.
// KADANE's Algo

public class Array19 {

	public static void main(String[] args) {
		
		int[] arr = {1,-3,2,3,-1,4,-12,5,1,-1};
		
		int max_sum = 0, max_sum_end_here = 0;
		
		for (int i =0;i<arr.length;i++) {
			if (max_sum_end_here+arr[i] < 0)
				max_sum_end_here = 0;
			else {
				max_sum_end_here += arr[i];
			}
			if (max_sum_end_here > max_sum)
				max_sum = max_sum_end_here;
		}
		System.out.println(max_sum);
	}
}
