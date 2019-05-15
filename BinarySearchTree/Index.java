package BinarySearchTree;

public class Index {

	public static void main(String[] args){
		
		BST bst = new BST();
		
		bst.insert(5);
		bst.insert(3);
		bst.insert(1);
		bst.insert(4);
		bst.insert(7);
		bst.insert(6);
		bst.insert(9);
		
		bst.inOrderTraversal();
		System.out.println();
		System.out.println(bst.getMaxValue());
		bst.addGreaterValueAtEveryNode();
//		bst.delete(9);
		bst.inOrderTraversal();
	}
	
}
