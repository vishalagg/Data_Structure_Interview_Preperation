package LinkedList;
//Algorithm to find the nth node from end of the linked list


public class LL1 {
	
	Node head;
	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	LL1() {
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
	
	public int getKthElementFromLast(int k) {
		int ans;
		if (head!=null) {
			Node temp = head;
			Node temp2 = head;
			while (k>0) {
				k -= 1;
				temp = temp.next;
			}
			
			while (temp!=null) {
				temp = temp.next;
				temp2 = temp2.next;				
			}
			ans = temp2.data;
		} else {
			ans = -1;
		}
		
		return ans;
	}

	public static void main(String[] args) {
		
		LL1 list = new LL1();
		
//		1->2->3->4->5->6
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);		
		list.display();
		System.out.println();
		int k = 2; //find kth element from last
		System.out.println(k + " element from last is : "+list.getKthElementFromLast(k));
	}
}
