package Array;
//Find the number occuring odd number of times in a given array of size 'n'

public class Array3 {
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,3,1,2,2,6,5,6,4,5,6,4};
		
		int n = 0;
		
		for (int i:arr) {
			n ^= i;
		}
		System.out.println(n);
	}
}
