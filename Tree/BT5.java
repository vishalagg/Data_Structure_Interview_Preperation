package Tree;
//Determine if the given two trees are identical or not

public class BT5 {

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
	
	public BT5() {
		this.root = null;
	}
	
	public static boolean isIdentical (Node node1, Node node2) {
		if (node1==null && node2==null)
			return true;
		if (node1 != null && node2 != null) {
			if (node1.data==node2.data){
				return isIdentical(node1.left, node2.left) && isIdentical(node1.right, node2.right);
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		BT5 tree = new BT5();
		tree.root = tree.new Node(1,null,null);
		tree.root.left = tree.new Node(2,null,null);
		tree.root.right = tree.new Node(3,null,null);
		tree.root.left.left = tree.new Node(4,null,null);
		tree.root.left.right = tree.new Node(5,null,null);
		tree.root.right.left = tree.new Node(6,null,null);
		tree.root.right.right = tree.new Node(7,null,null);
		
		BT5 tree2 = new BT5();
		tree2.root = tree2.new Node(1,null,null);
		tree2.root.left = tree2.new Node(2,null,null);
		tree2.root.right = tree2.new Node(3,null,null);
		tree2.root.left.left = tree2.new Node(4,null,null);
		tree2.root.left.right = tree2.new Node(5,null,null);
		tree2.root.right.left = tree2.new Node(6,null,null);
		tree2.root.right.right = tree2.new Node(7,null,null);
		
		System.out.println(isIdentical(tree.root, tree2.root));
	}
}
