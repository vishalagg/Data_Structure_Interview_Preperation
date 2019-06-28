package leetcode.DP;

import java.util.HashSet;
import java.util.Set;

public class WordBreak139 {

	public static void main(String[] args) {
		
		String s = "catsandog";
			
			Set<String> dict = new HashSet<String>();
			dict.add("cats");
			dict.add("dog");
			dict.add("sand");
			dict.add("and");
			dict.add("cat");
			
			boolean[] hash = new boolean[s.length()+1];
			hash[0] = true;
			System.out.println(wordBreak(s,dict,hash));
		}
		
		public static boolean wordBreak(String s, Set<String> dict,boolean[] hash) {
	        return helper(s, dict, 0,hash);
	}
	
	public static boolean helper(String s, Set<String> dict, int start,boolean[] hash){
	   if(start == s.length()) 
	       return true;
	
	   if(hash[start]) {
		   return true;
	   }
	   
	   for(String a: dict){
	       int len = a.length();
	       int end = start+len;
	
	       if(end > s.length()) 
	           continue;
	
	       if(s.substring(start, start+len).equals(a))
	           if(helper(s, dict, start+len,hash))
	        	   hash[end] = true;
	               return true;
	   }
	
	   return false;
	}
}
