package Array;
//Algorithm to find a sub array whose sum is X

public class Array14 {

	public static void main(String[] args) {
		
		int[] arr = {1,4,2,3,60,6,5,9,7};
		int x = 9;
		
		int j = 0, cur_sum = 0;
		
		for (int i=0;i<arr.length;i++) {
			while (cur_sum+arr[i] > x && j<=i) {
//				System.out.println(j);
				cur_sum -= arr[j];
				j += 1;
			}
			if (cur_sum+arr[i]==x) {
				System.out.println("indeces are : "+j+" - "+i);
			}
			cur_sum += arr[i];
		}		
	}
}
