package BinaryTreeTraversals;
//Tree Traversals (Inorder, Preorder and Postorder)

public class Tree1 {

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
	
	public Tree1() {
		this.root = null;
	}
	
	public void preOrder(Node node) {
		
		if (node!=null) {
			inorder(node.left);
			System.out.print(node.data + " ");
			inorder(node.right);
		}
	}
	
	public void preOrder() {
		preOrder(this.root);
	}

	public void inorder(Node node) {
		
		if (node!=null) {
			inorder(node.left);
			System.out.print(node.data + " ");
			inorder(node.right);
		}
	}

	public void inorder() {
		inorder(this.root);
	}
	
	public void postOrder() {
		postOrder(this.root);
	}
	
	public void postOrder(Node node) {
		
		if (node!=null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data + " ");
		}
	}
	

	public static void main(String[] args) {
		
		Tree1 tree = new Tree1();
		tree.root = tree.new Node(1);
		tree.root.left = tree.new Node(2);
		tree.root.right = tree.new Node(3);
		tree.root.left.left = tree.new Node(4);
		tree.root.left.right = tree.new Node(5);
		tree.root.right.left = tree.new Node(6);
		tree.root.right.right = tree.new Node(7);
		System.out.print("preOrder Traversal : ");
		tree.preOrder();

		System.out.println(); 
		System.out.print("InOrder Traversal : ");
		tree.inorder();
		
		System.out.println(); 
		System.out.print("postOrder Traversal : ");
		tree.postOrder();

	}
}
