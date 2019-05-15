package Array;
//Algorithm to reverse an array

public class Array4 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		
		int i = 0, j = arr.length-1;
		
		while (i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i += 1;
			j -= 1;
		}
		
		for (int a:arr){
			System.out.print(a+" ");
		}
	}
}
