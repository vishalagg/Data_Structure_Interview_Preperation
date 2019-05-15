package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Apple {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>();
		List<Integer> helper = new ArrayList<Integer>();
		
		arr.add(11);
		arr.add(24);
		HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
		
		for (int i : arr) {
			map.put(i, false);
		}
		
		while(!isDone(map)) {
			
			for (int i=0;i<arr.size();i++) {
				if (map.get(arr.get(i))==false){
					for (int j=i+1;j<arr.size();j++) {
						int temp = arr.get(j)/arr.get(i);
						if (!map.containsKey(temp)) {
							helper.add(temp);
							map.put(temp, false);
						}
					}
				}
				map.put(arr.get(i), true);
				
				for (int entry:helper) {
					arr.add(entry);
				}
				helper = new ArrayList<Integer>();		
				Collections.sort(arr);
			}
		}
		System.out.println(arr.toString());
	}
	
	private static boolean isDone(HashMap<Integer, Boolean> map) {
		
		boolean flag = true;
		for (Boolean value : map.values()) {
			if (value==false){
				flag = false;
				break;
			}
		}
		return flag;
	}
}
