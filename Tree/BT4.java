package Tree;

//Check if a given binary tree is sum tree or not

public class BT4 {

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
	
	public BT4() {
		this.root = null;
	}
	
	private boolean isLeaf(Node node) {
		return (node.left==null && node.right==null);
	}
	
	public boolean isSumTree(Node node) {
		
		if ( isLeaf(node) || node==null) {
			return true;
		}
		
		int leftSum, rightSum;
		
		if(isSumTree(node.left) && isSumTree(node.right)){
			leftSum = node.left==null?0:(isLeaf(node.left)?node.left.data:2*node.left.data);
			rightSum = node.right==null?0:(isLeaf(node.right)?node.right.data:2*node.right.data);
			
			return node.data == leftSum+rightSum;
		}
		return false;
	}
	
	public boolean isSumTree(){
		return isSumTree(this.root);
	}
	
	public static void main(String[] args) {
		BT4 tree = new BT4();
		tree.root = tree.new Node(1,null,null);
		tree.root.left = tree.new Node(2,null,null);
		tree.root.right = tree.new Node(3,null,null);
		tree.root.left.left = tree.new Node(4,null,null);
		tree.root.left.right = tree.new Node(5,null,null);
		tree.root.right.left = tree.new Node(6,null,null);
		tree.root.right.right = tree.new Node(7,null,null);
		System.out.println("isSumTree tree1 : "+tree.isSumTree());
		
		BT4 tree2 = new BT4();
		
		tree2.root = tree2.new Node(20,null,null);
		tree2.root.left = tree2.new Node(8,null,null);
		tree2.root.right = tree2.new Node(2,null,null);
		tree2.root.left.left = tree2.new Node(6,null,null);
		tree2.root.left.right = tree2.new Node(2,null,null);
		tree2.root.right.left = tree2.new Node(1,null,null);
		tree2.root.right.right = tree2.new Node(1,null,null);
		System.out.println("isSumTree tree2 : "+tree2.isSumTree());
	}
}
