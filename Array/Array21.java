package Array;

import java.util.Arrays;

//Algorithm to find the next greater number formed after permuting the digits of given number

public class Array21 {
	
	private static void printNextGreaterNumber(int[] arr) {
		
		int i = arr.length-1, k, min_from_right;
		
		for (;i>0;i--)
			if (arr[i]>arr[i-1])
				break;
		
		if (i!=0) {
			k = arr[i - 1];
			min_from_right = i; 
            for (int j = i + 1; j < arr.length; j++) 
                if (arr[j] > k && arr[j] < arr[min_from_right])
                	min_from_right = j; 
//            System.out.println(min_from_right);
            int temp = arr[i-1];
            arr[i-1] = arr[min_from_right];
            arr[min_from_right] = temp;
            
            Arrays.sort(arr, i, arr.length); 
            
            for (int a:arr)
            	System.out.print(a);
		} else {
			System.out.println("No greater number");
		}
		
	}

	public static void main(String[] args) {
		
		int[] arr = {1,6,2,7,3,8,4,2}; //16273803
		printNextGreaterNumber(arr);
	}
}
