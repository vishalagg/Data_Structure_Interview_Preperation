package Array;

import java.util.HashMap;
import java.util.Map;

//Algorithm to find the largest sub array with equal number of 0's and 1's

public class Array15 {

	private static int getLargestSubArraySizeWithEqual1And0(int[] arr) {
		
		int count_one = 0, count_zero = 0, max_size = 0;
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for (int i=0;i<arr.length;i++) {
			
			if (arr[i]==0)
				count_zero += 1;
			else
				count_one += 1;
			
			if (map.containsKey(count_zero-count_one))
				max_size = Math.max(max_size, (i - map.get(count_zero-count_one)));
			else
				map.put(count_zero-count_one, i);	
		}
		return max_size;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {0,0,0,0,1,0,0,1,0,0,0,0,1,0};
		System.out.println(getLargestSubArraySizeWithEqual1And0(arr));
	}
}
