package LinkedList;
//Algorithm to find the middle node in a linked list

public class LL2 {

	Node head;
	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	LL2() {
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
	
	private int getMiddleNodeData() {
		Node slowPtr = this.head, fastPtr = this.head;
		
		if (this.head==null)
			return -1;
		
		while (fastPtr!=null && fastPtr.next!=null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
		}
		return slowPtr.data;
	}
	
	public static void main(String[] args) {
		LL2 list = new LL2();
		
//		1->2->3->4->5
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);		
		list.display();
		System.out.println();
		
		System.out.println("Middle element is :" +list.getMiddleNodeData());
	}
}
