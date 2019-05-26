package Tree;

import java.util.Stack;

//Level order traversal in spiral form

public class BT9 {
	private class Node {
		int data;
		Node left;
		Node right;
		
		Node(int data,Node left,Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	
	Node root;
	
	public BT9() {
		this.root = null;
	}

	private void levelOrderSpiralForm(Node node, Stack<Node> stack1, Stack<Node> stack2) {
		
		if (node==null)
			return;
		
		stack1.push(node);		
		while (!stack1.isEmpty() || !stack2.isEmpty()) {
			
			while (!stack1.isEmpty()) {
				Node temp = stack1.pop();
				System.out.print(temp.data+" ");
				if (temp.right!=null)
					stack2.push(temp.right);
				if (temp.left!=null)
					stack2.push(temp.left);
			}
			System.out.println();

			while (!stack2.isEmpty()) {
				Node temp = stack2.pop();
				System.out.print(temp.data+" ");
				if (temp.left!=null)
					stack1.push(temp.left);
				if (temp.right!=null)
					stack1.push(temp.right);
			}
			System.out.println();
		}
	}
	
	private void levelOrderSpiralForm () {
		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();
		levelOrderSpiralForm(this.root, stack1, stack2);
	}
	

	public static void main(String[] args) {
		BT9 tree = new BT9();
		tree.root = tree.new Node(1,null,null);
		tree.root.left = tree.new Node(2,null,null);
		tree.root.right = tree.new Node(3,null,null);
		tree.root.left.left = tree.new Node(4,null,null);
		tree.root.left.right = tree.new Node(5,null,null);
		tree.root.right.left = tree.new Node(6,null,null);
		tree.root.right.right = tree.new Node(7,null,null);
		tree.levelOrderSpiralForm();
	}
}
