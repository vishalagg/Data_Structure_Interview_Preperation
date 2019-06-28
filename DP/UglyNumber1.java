package DP;

public class UglyNumber1 {

	private static int maxDivide(int a, int b) {
	
		while(a%b==0)
			a = a/b;
		return a;
	}
	
	private static boolean isUgly(int n) {
		int number;
		number = maxDivide(n, 2);
//		System.out.println(number);
		number = maxDivide(number, 3);
//		System.out.println(number);
		number = maxDivide(number, 5);
//		System.out.println(number);
		
		return (number==1)?true:false;
		
	}
	
	public static void main(String[] args) {
		
		int n = 14;
		
		System.out.println(isUgly(n));
		
	}
}
