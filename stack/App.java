package stack;

public class App {

	public static void main(String[] args) {
		
		Stack stack = new Stack(10);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println(stack.pop());
		
		stack.push(50);
		
		System.out.println(stack);
	}
}
