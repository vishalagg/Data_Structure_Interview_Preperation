package Tree;
//Implement inorder traversal without stack and recursion(Morris Traversal)

public class BT2 {

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
	
	public BT2() {
		this.root = null;
	}
	
	private Node getPredecessorOrCurrentNode(Node node) {
		
		Node pred = node.left;
		while (pred.right!=null && pred.right!=node) {
			pred = pred.right;
		}
		return pred;
	}
	
	private void inorederWithoutStackAndRecursion() {
		Node node= this.root;
		
		while (node!=null) {
			if (node.left==null) {
				System.out.print(node.data+" ");
				node = node.right;
			} else {
				Node pred = getPredecessorOrCurrentNode(node);
				
				if (pred.right==null) {
					pred.right = node;
					node = node.left;
				} else {
					pred.right = null;
					System.out.print(node.data+" ");
					node = node.right;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		BT2 tree = new BT2();
		tree.root = tree.new Node(1,null,null);
		tree.root.left = tree.new Node(2,null,null);
		tree.root.right = tree.new Node(3,null,null);
		tree.root.left.left = tree.new Node(4,null,null);
		tree.root.left.right = tree.new Node(5,null,null);
		tree.root.right.left = tree.new Node(6,null,null);
		tree.root.right.right = tree.new Node(7,null,null);
		tree.inorederWithoutStackAndRecursion();
	}
}
