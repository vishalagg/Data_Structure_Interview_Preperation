package Array;
//Algorithm to merge an array of size 'n' into another array of size 'm+n'.

public class Array8 {

	public static void main(String[] args) {
		
		int[] arr1 = {1,3,-1,4,-1,-1,5};
		int[] arr2 = {2,6,7};
		
		int m = arr1.length - arr2.length;
		int n = arr2.length;
		
		int j = arr1.length-1;
		
		for (int i=arr1.length-1;i>=0;i--) {
			if (arr1[i]!=-1){
				int temp = arr1[i];
				arr1[i] = arr1[j];
				arr1[j] = temp;
				j -= 1;
			}
		}
		
		int p = m-1 , q = 0 , k = -1;
		boolean flag = false;
		for (int i=0;i<m+n;i++) {
			if (p>=m+n || q>=n){
				flag = true;
				k = i;
				break;
			}
			if (arr1[p]<arr2[q]){
				arr1[i] = arr1[p];
				p += 1;
			}else {
				arr1[i] = arr2[q];
				q += 1;
			}
		}
		
		if (flag) {
			if (p>=m+n) {
				while (k<m+n) {
					arr1[k] = arr2[q];
					q += 1;
					k += 1;
				}
			}else {
				while (k<m+n) {
					arr1[k] = arr1[p];
					p += 1;
					k += 1;
				}
			}
		}
		
		for (int a:arr1){
			System.out.print(a+" ");
		}
	}
}
