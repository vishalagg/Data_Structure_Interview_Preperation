package LinkedList;
//Algorithm to detect loop in linked list

public class LL5 {
	Node head;
	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	LL5() {
		this.head = null;
	}

	public Node add(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
		return node;
	}
	
	private String containsLoopOrNot(LL5 list) {
		Node sp = this.head, fp = this.head.next.next;
		String ans = "";
		boolean flag = false;
		while (sp!=null) {
			if (sp==fp) {
				ans += "there is a loop";
				flag = true;
				break;
			}
			sp = sp.next;
			fp = (fp!=null && fp.next!=null)?fp.next.next:null;
		}
		if (!flag)
			ans += "Does Not contains loop";
		return ans;
	}

	public static void main(String[] args) {
		LL5 list = new LL5();

//		1->2->3->4->5->6--->---back to 3
		Node node1 = list.add(6);
		list.add(5);
		list.add(4);
		Node node2 = list.add(3);
		list.add(2);
		list.add(1);
		node1.next = node2;
		
		System.out.println(list.containsLoopOrNot(list));
	}

}
