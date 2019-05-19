package Array;
//Algorithm to find the common element in given three sorted arrays

public class Array18 {

	public static void main(String[] args) {
		
		int[] arr1 = {10,15,17,100,323};
		int[] arr2 = {2,8,9,10,12,13,14,15,16,17,34,323};
		int[] arr3 = {15,17,101,123,323};
		
		int i=0, j=0, k=0;
		
		while (i<arr1.length && j<arr2.length && k<arr3.length)
			if (arr1[i]==arr2[j] && arr2[j]==arr3[k]){
				System.out.println(arr1[i]);
				i += 1;
				j += 1;
				k += 1;
			}
			else if (arr1[i]<arr2[j])
				i += 1;
			else if (arr2[j]<arr3[k])
				j += 1;
			else
				k += 1;
	}
}
