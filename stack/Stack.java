package stack;

import java.util.Arrays;

public class Stack {
	int top;
	int size;
	int[] stack;
	
	Stack(int size) {
		this.size = size;
		this.top = -1;
		stack = new int[size];
	}
	
	public void push(int node) {
		if(top>=(size-1)) {
			System.out.println("Stack is full");
			return;
		}
		this.top += 1;
		this.stack[top] = node;
	}
	
	@Override
	public String toString() {
		return "Stack [stack=" + Arrays.toString(stack) + "]";
	}

	public int pop() {
		if(top==-1){
			System.out.println("underflow");
			return -1;
		}
		int item = this.stack[this.top];
		top -= 1;
		return item;
	}
}
