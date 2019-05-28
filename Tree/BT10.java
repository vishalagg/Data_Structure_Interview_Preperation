package Tree;
//Convert an arbitrary binary tree to a tree that holds children sum property (You are not allowed to subtract from any node or node value must not decrease).

public class BT10 {

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
	
	public BT10() {
		this.root = null;
	}
	
	private void fixTreeToHoldChildSumProperty (Node node) {
		
		if (node==null)
			return;
		if (node.left==null && node.right==null) 
			return;
		
		fixTreeToHoldChildSumProperty(node.left);
		fixTreeToHoldChildSumProperty(node.right);
		
		int left = 0, right = 0;
		if (node.left!=null)
			left = node.left.data;
		if (node.right!=null)
			right = node.right.data;
		
		if (left+right-node.data >= 0) 
			node.data = left+right;
		else
			fixDown(node,node.data-left+right);
	}

	private void fixDown(Node node,int i) {
		
		if (node.left!=null){
			node.left.data += i;
			fixDown(node.left,i);
		}
		else if (node.right!=null){
			node.right.data += i;
			fixDown(node.right,i);
		}
	}
	
	public void inorder(Node node) {
		if (node!=null) {
			inorder(node.left);
			System.out.print(node.data + "  ");
			inorder(node.right);
		}
	}

	public static void main(String[] args) {
		BT10 tree = new BT10();
		tree.root = tree.new Node(1,null,null);
		tree.root.left = tree.new Node(2,null,null);
		tree.root.right = tree.new Node(3,null,null);
		tree.root.left.left = tree.new Node(4,null,null);
		tree.root.left.right = tree.new Node(5,null,null);
		tree.root.right.left = tree.new Node(6,null,null);
		tree.root.right.right = tree.new Node(7,null,null);
		System.out.println("before : ");
		tree.inorder(tree.root);
		System.out.println();
		tree.fixTreeToHoldChildSumProperty(tree.root);
		System.out.println("After : ");
		tree.inorder(tree.root);
	}
}
