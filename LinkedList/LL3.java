package LinkedList;
//Algorithm to find the intersection point of two linked lists

public class LL3 {


	Node head;
	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	LL3() {
		this.head = null;
	}
	
	public Node add(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
		return node;
	}
	
	public void display() {
		Node temp = head;
		 while (temp!=null) {
			 System.out.print(temp.data + " ");
			 temp = temp.next;
		 }
	}
	
	public static int getLength (LL3 list) {
		Node head = list.head;
		Node temp = head;
		int l = 0;
		while (temp!=null) {
			l += 1;
			temp = temp.next;
		}
		return l;
	}
	private static Node getIntersectionNodeHelper (LL3 list1,LL3 list2, int lenDiff) {
		Node head1 = list1.head;
		Node head2 = list2.head;
		
		while (lenDiff>0){
			head1 = head1.next;
			lenDiff -= 1;
		}
		
		while ((head1!=null && head2!=null)&&(head1.data!=head2.data)){
			head1 = head1.next;
			head2 = head2.next;
		}
		return head1;
	}
	
	public static Node getIntersectionNode(LL3 list1, LL3 list2) {
		int l1 = getLength(list1);
		int l2 = getLength(list2);
		
		Node node;
		if (l1>l2)
			node = getIntersectionNodeHelper(list1,list2,l1-l2);
		else
			node = getIntersectionNodeHelper(list2,list1,l2-l1);
		return node;
	}
	
	public static void main(String[] args) {
		
		LL3 list1 = new LL3();
		LL3 list2 = new LL3();
		
//		1->2->3->4->5->6
		list1.add(6);
		list1.add(5);
		list1.add(4);
		Node node = list1.add(3);
		list1.add(2);
		list1.add(1);	
		System.out.print("List 1 is : ");
		list1.display();
		System.out.println();
		
		Node node2 = list2.add(30);
		node2.next = node;
		System.out.print("List 2 is : ");
		list2.display();
		System.out.println();
		
		Node intersection = getIntersectionNode(list1,list2);
		System.out.println("Intersection Node is : "+intersection.data);
		
	}
}
