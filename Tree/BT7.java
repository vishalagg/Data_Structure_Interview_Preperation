package Tree;
//Find a lowest common ancestor of a given two nodes in a a binary search tree

public class BT7 {
	
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
	
	public BT7() {
		this.root = null;
	}
	
	public int getLCAOfBST(int a, int b) {
		int t1 = a>b? a:b;
		int t2 = a>b?b:a;
		return getLCAOfBSTHelper(t2, t1, this.root);
	}

	private int getLCAOfBSTHelper(int a, int b, Node node) {
		if (node==null) 
			return -1;
		if (a < node.data && b <node.data)
			return getLCAOfBSTHelper(a, b, node.left);
		else if(a > node.data && b > node.data)
			return getLCAOfBSTHelper(a, b, node.right);
		return node.data;
	}

	public static void main(String[] args) {
		BT7 tree = new BT7();
		tree.root = tree.new Node(100,null,null);
		tree.root.left = tree.new Node(50,null,null);
		tree.root.right = tree.new Node(200,null,null);
		tree.root.left.left = tree.new Node(40,null,null);
		tree.root.left.right = tree.new Node(70,null,null);
		tree.root.right.left = tree.new Node(150,null,null);
		tree.root.right.right = tree.new Node(300,null,null);
		tree.root.right.right.left = tree.new Node(250,null,null);
		
		System.out.println(tree.getLCAOfBST(50,250));
	}
}
