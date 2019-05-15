package BinaryTreeTraversals;

import BinaryTreeTraversals.Tree2.Node;
//Inorder Tree Traversal without recursion and without stack!

public class Tree3 {
	
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
	
	public Tree3() {
		this.root = null;
	}
	
	public void inorderWithoutRecursionAndStack() {
		
		if (this.root==null)
			return;
		
		Node current = this.root;
		Node prev = this.root;
		
		while (current!=null) {
			if(current.left==null) {
				System.out.print(current.data+" ");
				current = current.right;
			} else {
				
				prev = current.left;
				while (prev.right!=null &&  prev.right!=current) {
					prev = prev.right;
				}
				if (prev.right==null) {
					prev.right = current;
					current = current.left;
				} else {
					prev.right = null;
					System.out.print(current.data + " ");
					current = current.right;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Tree3 tree = new Tree3();
		tree.root = tree.new Node(1);
		tree.root.left = tree.new Node(2);
		tree.root.right = tree.new Node(3);
		tree.root.left.left = tree.new Node(4);
		tree.root.left.right = tree.new Node(5);
		tree.root.right.left = tree.new Node(6);
		tree.root.right.right = tree.new Node(7);
		System.out.print("InOrder Traversal : ");
		tree.inorderWithoutRecursionAndStack();

	}
}
