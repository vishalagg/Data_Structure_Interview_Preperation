package Array;
//Given an array of integers, sort the array into a wave like array and return it. (arrange the element into a sequence such that a1>=a2<=a3>=a4<=a5----etc.)

public class Array20 {

	public static void main(String[] args) {
		
		int[] arr = {2,5,1,3,6,7,12,10,8};
		
		for (int i=0;i<arr.length-1;i++) {
			
			if (i%2==0) {
				if (arr[i]<arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			} else {
				if (arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}				
			}
		}
		for (int a : arr) {
			System.out.print(a+" ");
		}
	}
}
