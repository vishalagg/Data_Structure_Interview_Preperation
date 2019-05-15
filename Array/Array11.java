package Array;
//Find the index in an array such that the sum of elements at lower indices is equal to the sum of elements at higher indices.
// OR Equilibrium index

public class Array11 {

	public static void main(String[] args) {
		int[] arr = {1,4,0,5,3,1,6};
		
		int i = 0, j = arr.length-1;
		int left_sum = arr[0], right_sum = arr[arr.length-1];
		
		while (i<=j){
			if (left_sum<right_sum) {
				i += 1;
				left_sum += arr[i];
			}else {
				j -= 1;
				right_sum += arr[j];				
			}
			if (left_sum == right_sum && (i==j-1 || i==j)) {
				System.out.println(i+" "+j);
				break;
			}
		}
	}
}
