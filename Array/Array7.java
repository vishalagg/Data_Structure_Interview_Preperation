package Array;
//Find the maximum difference between two elements such that larger element appears after the smaller element

public class Array7 {

	public static void main(String[] args) {
		
		int[] arr = {100,1,2,4,10};
		
		if (arr.length<2){
			System.out.println("0");
			return;
		}
		int min_element = arr[0], max_difference = arr[1]-arr[0];
		
		for(int i = 1; i < arr.length; i++) 
	     {      
	       if (arr[i] - min_element > max_difference)                              
	       max_difference = arr[i] - min_element; 
	         
	       if (arr[i] < min_element) 
	       min_element = arr[i];                      
	     } 
		System.out.println(min_element+"  "+max_difference);
		
	}
}
