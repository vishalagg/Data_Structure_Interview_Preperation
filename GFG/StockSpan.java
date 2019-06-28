package GFG;

import java.util.Stack;

public class StockSpan {

	private static int[] getSpanUsingStack(int[] stocks,int[] span) {
		
		Stack<Integer> stack = new Stack<Integer>();
		span[0] = 1;
		stack.push(0);
		
		for (int i=1;i<stocks.length;i++) {
			
			while (!stack.isEmpty() && stocks[i]>stocks[stack.peek()]){
				stack.pop();
			}
			if (stack.isEmpty()) {
				span[i] = i+1;
			}else {
				span[i] = i-stack.peek();
			}
			stack.push(i);
		}
		
		return span;
	}
	
	private static int[] getSpanWithoutUsingStack(int[] stocks,int[] span) {
		
		return span;
	}
	
	public static void main(String[] args) {
		int[] stocks = {0,5,3,2,1,4,6};
		int[] span = new int[stocks.length];
		getSpanUsingStack(stocks,span);
		
		for (int s:span) {
			System.out.print(s+" ");
		}
	}
}
