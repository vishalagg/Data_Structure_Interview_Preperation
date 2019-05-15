package Array;

import java.util.HashSet;
import java.util.Set;

//Find a pair in an array of size 'n', whose sum is X

public class Array1 {

	public static void main(String[] args) {
		
		int[] arr = {1,4,2,5,3};
		int x = 6;
		
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i:arr) {
			if (set.contains(Math.abs(x-i))) {
				System.out.println("Pair found, here it is : "+i+" and "+(x-i));
			}
			set.add(i);
		}
	}
}
