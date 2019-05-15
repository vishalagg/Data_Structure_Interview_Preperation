package Array;
//Algorithm to rotate array of size 'n' by 'd' element

public class Array5 {
	
	private static void reverseArray(int[] arr, int i, int j) {
		while (i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i += 1;
			j -= 1;
		}
	}
	
	private static void rotateArray(int[] arr, int d) {
		reverseArray(arr,0,d-1);
		reverseArray(arr,d,arr.length-1);
		reverseArray(arr,0,arr.length-1);	
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int d = 2;
		
		rotateArray(arr,d);
		
		for (int a:arr){
			System.out.print(a+" ");
		}
	}
}
