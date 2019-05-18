package Array;

import java.util.Arrays;

//Algorithm to find the number of triangles that can be formed with three different array elements as three sides of triangles, for a given unsorted array of n elements

public class Array16 {

	public static void main(String[] args) {
		
		int[] arr = {1,45,2,9,5,4,7,23};
		
		int triangle_count = 0;
		Arrays.sort(arr);
		
		for (int i=0;i<arr.length-2;i++) { 
            int k = i+2; 
            for (int j=i+1;j<arr.length;j++) { 
                
                while (k < arr.length && arr[i] + arr[j] > arr[k]) 
                    k += 1; 
                if(k>j) 
                	triangle_count += k - j - 1; 
            } 
        } 
		System.out.println(triangle_count);		
	}
}
