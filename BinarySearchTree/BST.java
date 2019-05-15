package BinarySearchTree;

public class BST {

	private Node root;
	
	public void insert(int data) {
		if(this.root == null) {
			this.root = new Node(data);
		} else {
			insertNode(data,this.root);
		}
	}

	private void insertNode(int data, Node node) {
		if (node.getData() > data) {
			if (node.getLeftChild()==null) {
				node.setLeftChild(new Node(data));
			} else {
				insertNode(data,node.getLeftChild());
			}
		} else {
			if (node.getRightChild()==null) {
				node.setRightChild(new Node(data));
			} else {
				insertNode(data,node.getRightChild());
			}	
		}
	}
	
	public int getMaxValue() {
		if (this.root==null) {
			return -1;
		}
		return getMaxValue(this.root);
	}
	
	private int getMaxValue(Node node) {
		if (node.getRightChild()==null) {
			return node.getData();
		}else {
			return getMaxValue(node.getRightChild());
		}
	}
	
	public int getMinValue() {
		if (this.root==null) {
			return -1;
		}
		return getMinValue(this.root);
	}
	
	private int getMinValue(Node node) {
		if (node.getLeftChild()==null) {
			return node.getData();
		}else {
			return getMinValue(node.getLeftChild());
		}
	}
	
	public void inOrderTraversal() {
		if (this.root == null){
			return;
		}else {
			inOrderTraversal(this.root);
		}
	}
	
	private void inOrderTraversal(Node node) {
		if (node.getLeftChild()!=null) {
			inOrderTraversal(node.getLeftChild());
		}
		System.out.print(node.getData() + " -> ");
		if (node.getRightChild()!=null) {
			inOrderTraversal(node.getRightChild());
		}
	}
	
	public void delete(int data) {
		if (this.root==null){
			return;
		}
		deleteNode(data,this.root);
	}
	
	private void deleteNode(int data,Node node) {
		
		if (node == null) 
			return;
		
		if (node.getData() < data) {
			deleteNode(data,node.getLeftChild());
		}else if(node.getData() > data) {
			deleteNode(data,node.getRightChild());
		}else {
			if(node.getLeftChild() == null && node.getRightChild() == null ) {
				node = null;
			}
		}
	}
	
	public void addGreaterValueAtEveryNode() {
		if (root==null)
			return;
		addGreaterValueAtEveryNode(this.root);
	}
	
	private int addGreaterValueAtEveryNode(Node node) {
		
		if (node==null) {
			return 0;
		}
		addGreaterValueAtEveryNode(node.getLeftChild());
		int newData = node.getData() + addGreaterValueAtEveryNode(node.getRightChild());
		node.setData(newData);
		return newData;
	}
}
