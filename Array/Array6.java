package Array;
//Algorithm to segregate 0's and 1's in an array

public class Array6 {

	public static void main(String[] args) {
		
		int[] arr = {1,0,0,1,1,0,1,1,0,0,0,1,0};
		
		int count_zero = 0;
		
		for (int i:arr)
			if (i==0)
				count_zero += 1;
				
		for (int i=0;i<arr.length;i++) {
			
			if (count_zero>0){
				arr[i] = 0;
				count_zero -= 1;
			}
			else
				arr[i] = 1;
		}
		
		for (int a:arr){
			System.out.print(a+" ");
		}
	}
}
