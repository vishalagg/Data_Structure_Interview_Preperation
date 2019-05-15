package Array;
//Find a majority element in an array of size 'n' (must occur > n/2 times)

public class Array2 {

	private static int getMajorityElement(int[] arr) {
		
		int maj_index = 0, count = 1;
		
		for (int i=1;i<arr.length;i++) {
			
			if (arr[i]==arr[maj_index])
				count += 1;
			else
				count -= 1;
			
			if (count < 0){
				count = 0;
				maj_index = i;
			}
		}
		return arr[maj_index];
	}
	
	private static boolean isMajorityNumber(int n,int[] arr) {
		
		int count = 0;
		for(int i : arr) {
			if (i==n)
				count += 1;
		}
		return count>(arr.length/2);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,3,11,2,3,3,2,3,3,2,3,30,3};
		int maj_number = getMajorityElement(arr);
		
		if (isMajorityNumber(maj_number,arr))
			System.out.println(maj_number);
		else
			System.out.println("No majority number");
	}
}
