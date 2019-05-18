package Array;
//Algorithm to find the smallest integer value that can't be represented as sum of any subset of a given sorted array.

public class Array17 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,6,76,87};
		int min_num = 1;
		for (int i=0;i<arr.length;i++){
			if (arr[i]>min_num)
				break;
			else
				min_num += arr[i];
		}
		System.out.println(min_num);
	}
}
