package LinkedList;
//Reversal of linked list(Using Recursion)

public class LL4 {

	Node head;
	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	LL4() {
		this.head = null;
	}

	public void add(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	
	public void display() {
		Node temp = head;
		 while (temp!=null) {
			 System.out.print(temp.data + " ");
			 temp = temp.next;
		 }
	}
	
	private void reversalUsingRecursion(Node node,Node prevPtr) {
		
		if (node==null){
			this.head = prevPtr;
			return;
		}
//		System.out.println("node : "+node.data+" prev: "+prevPtr.data);
		reversalUsingRecursion(node.next,prevPtr.next);
		
		
		node.next = prevPtr;
		prevPtr.next = null;
		
	}

	public void reversalUsingRecursion (LL4 list) {
		list.reversalUsingRecursion(list.head.next, list.head);
	}
	
	public static void main(String[] args) {
		LL4 list = new LL4();
		
//		1->2->3->4->5->6
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);	
		list.display();
		System.out.println();
		list.reversalUsingRecursion(list);
		list.display();
		System.out.println();
		
	}
}
