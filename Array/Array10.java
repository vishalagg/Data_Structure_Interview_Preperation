package Array;
//Algorithm to find duplicate elements in O(n) time and O(1) extra space, for a given array of size 'n'

public class Array10 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,3};
		
		for (int i=0;i<arr.length;i++) {
//			System.out.println(i +" "+arr[i]+" "+Math.abs(arr[i]));
			if (arr[Math.abs(arr[i])]<0) {
				System.out.println("Duplicate element is : "+Math.abs(arr[i]));
			}else {
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			}
		}
	}
}
