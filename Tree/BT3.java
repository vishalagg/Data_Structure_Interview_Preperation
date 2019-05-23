package Tree;

//Convert a binary tree into its mirror tree

public class BT3 {
	
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
	
	public BT3() {
		this.root = null;
	}
	
	public void inorder(Node node) {
		if (node!=null) {
			inorder(node.left);
			System.out.print(node.data + "  ");
			inorder(node.right);
		}
	}
	
	public void inorder() {
		inorder(this.root);
	}
	
	private void convertToMirrorTree (Node node) {
		
		if (node==null) 
			return;
		
		convertToMirrorTree(node.left);
		convertToMirrorTree(node.right);
		
		Node temp = node.left;
		node.left = node.right;
		node.right = temp;
	}
	
	public void convertToMirrorTree() {
		convertToMirrorTree(this.root);
	}
	
	public static void main(String[] args) {
		BT3 tree = new BT3();
		tree.root = tree.new Node(1,null,null);
		tree.root.left = tree.new Node(2,null,null);
		tree.root.right = tree.new Node(3,null,null);
		tree.root.left.left = tree.new Node(4,null,null);
		tree.root.left.right = tree.new Node(5,null,null);
		tree.root.right.left = tree.new Node(6,null,null);
		tree.root.right.right = tree.new Node(7,null,null);
		
		tree.inorder();
		System.out.println();
		tree.convertToMirrorTree();
		tree.inorder();
	}
}
