package Tree;
//Print out all of its roof to leaf paths in a given binary tree

public class BT6 {
	
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
	
	public BT6() {
		this.root = null;
	}
	
	private void printPathHelper(Node node,int[] path,int i) {
		
		if (node==null)
			return;
		
		path[i] = node.data;
		i += 1;
		
		if (isLeaf(node)) 
			printArray(path, i);
		else {
			printPathHelper(node.left, path, i);
			printPathHelper(node.right, path, i);
		}
	}
	
	private void printArray(int[] path, int i) {
		for (int j=0;j<i;j++) 
			System.out.print(path[j]);
		System.out.println();
	}

	private boolean isLeaf(Node node) {
		return node.left==null && node.right==null;
	}

	private void printPath() {
		int[] path = new int[100];
		
		printPathHelper(this.root,path,0);
	}
	
	public static void main(String[] args) {
		BT6 tree = new BT6();
		tree.root = tree.new Node(1,null,null);
		tree.root.left = tree.new Node(2,null,null);
		tree.root.right = tree.new Node(3,null,null);
		tree.root.left.left = tree.new Node(4,null,null);
		tree.root.left.right = tree.new Node(5,null,null);
		tree.root.right.left = tree.new Node(6,null,null);
		tree.root.right.right = tree.new Node(7,null,null);
		
		tree.printPath();
	}
}
