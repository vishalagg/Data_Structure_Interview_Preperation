package Array;
//Algorithm to find the maximum difference of j - i such that a[j] > a[i], for a given an array of 'n' elements.

public class Array12 {
	
	private static int getMaXDiff(int[] arr) {
		
		int[] leftMinimum = new int[arr.length];
		int[] rightMaximum = new int[arr.length];
		
		leftMinimum[0] = arr[0];
		rightMaximum[rightMaximum.length-1] = arr[arr.length-1];
		
		for (int i=1;i<arr.length;i++) {
			if (arr[i]<leftMinimum[i-1])
				leftMinimum[i] = arr[i];
			else 
				leftMinimum[i] = leftMinimum[i-1];
		}
		
		for(int i=arr.length-2;i>=0;i--) {
			if (arr[i]>rightMaximum[i+1])
				rightMaximum[i] = arr[i];
			else
				rightMaximum[i] = rightMaximum[i+1];
		}
		
		int i = 0, j = 0;
		int maxDiff = 0; 
        while (j < arr.length-1 && i < arr.length-1) {
            if (leftMinimum[i] < rightMaximum[j]) {
                maxDiff = Math.max(maxDiff, j - i); 
                j = j + 1; 
            }else 
                i = i + 1; 
        } 
		System.out.println(i + " " + j);
		return maxDiff;
	}

	public static void main(String[] args) {
		int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
//		int[] arr = {4,3,2,1};
		
		System.out.println(getMaXDiff(arr));
	}
}
