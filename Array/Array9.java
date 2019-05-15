package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//Algorithm to find two repeating numbers in a given array

public class Array9 {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,4,5,3};
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for (int i:arr) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		
		for (Entry<Integer, Integer> i:map.entrySet()) {
			if (i.getValue()>1) {
				System.out.println(i.getKey());
			}
		}
	}
}
