package GFG;
//Build Lowest Number by Removing n digits from a given number

public class LowestNumber {

	private static String result = "";
	
	public static void buildLowestNumber(String s, int n) {
		if (n==0){
			result += s;
			return;
		}
		if(n>=s.length()){
			return;
		}
		int minIndex = 0;
		for(int i=1;i<=n;i++){
			if(s.charAt(i)<s.charAt(minIndex))
				minIndex = i;	
		}
		result += s.charAt(minIndex);
		buildLowestNumber(s.substring(minIndex+1,s.length()), n-minIndex);
	}
	
	public static void main(String[] args) {
		int n = 5;
		String s = "765028321";
		buildLowestNumber(s, n);
		System.out.println("Result : "+result);
	}
}
