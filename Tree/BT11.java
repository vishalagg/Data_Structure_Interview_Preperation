package Tree;
//Find the Diameter of a BST

public class BT11 {
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
	
	public BT11() {
		this.root = null;
	}
	
	private int getDiameter(Node node) {
		return 0;
	}
	
	public int getDiameter() {
		return getDiameter(this.root);
	}
	
	public static void main(String[] args) {
		BT11 tree = new BT11();
		tree.root = tree.new Node(1,null,null);
		tree.root.left = tree.new Node(2,null,null);
		tree.root.right = tree.new Node(3,null,null);
		tree.root.left.left = tree.new Node(4,null,null);
		tree.root.left.right = tree.new Node(5,null,null);
		tree.root.right.left = tree.new Node(6,null,null);
		tree.root.right.right = tree.new Node(7,null,null);
		System.out.println(tree.getDiameter());
	}
}
