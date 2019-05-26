package Tree;
//Find a lowest common ancestor of a given two nodes in a binary tree

public class BT8 {

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
	
	public BT8() {
		this.root = null;
	}
	
	private int getLCA (Node node, int i, int j) {
		
		if (node==null)
			return -1;
		
		if (node.data==i || node.data==j)
			return node.data;
		
		int left = getLCA(node.left, i, j);
		int right = getLCA(node.right, i, j);
		
		if (left!=-1 && right!=-1)
			return node.data;
		return left!=-1?left:right;
	}
	
	private int getLCA (int i, int j) {
		return getLCA(this.root, i, j);
	}

	public static void main (String[] args) {
		BT8 tree = new BT8();
		tree.root = tree.new Node(1,null,null);
		tree.root.left = tree.new Node(2,null,null);
		tree.root.right = tree.new Node(3,null,null);
		tree.root.left.left = tree.new Node(4,null,null);
		tree.root.left.right = tree.new Node(5,null,null);
		tree.root.right.left = tree.new Node(6,null,null);
		tree.root.right.right = tree.new Node(7,null,null);
		
		System.out.println(tree.getLCA(6,7));
	}

}
