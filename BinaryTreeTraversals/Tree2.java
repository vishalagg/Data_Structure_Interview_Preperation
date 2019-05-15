package BinaryTreeTraversals;
//Inorder Tree Traversal without Recursion

import java.util.Stack;

public class Tree2 {

	class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	private Node root;
	
	public Tree2() {
		this.root = null;
	}
	
	public void inorderWithoutRecursion() {
				
		Stack<Node> stack = new Stack<Node>();
		
		Node current = this.root;
		
		while (!stack.isEmpty() || current!=null) {
			
			while (current != null) {
				stack.push(current);
				current = current.left;
			}
			current = stack.pop();
			System.out.print(current.data + " ");
			current = current.right;
		}
	}
	
	public static void main(String[] args) {
		
		Tree2 tree = new Tree2();
		tree.root = tree.new Node(1);
		tree.root.left = tree.new Node(2);
		tree.root.right = tree.new Node(3);
		tree.root.left.left = tree.new Node(4);
		tree.root.left.right = tree.new Node(5);
		tree.root.right.left = tree.new Node(6);
		tree.root.right.right = tree.new Node(7);
		System.out.print("InOrder Traversal : ");
		tree.inorderWithoutRecursion();

	}
}
