package LinkedList;

public class LinkedListImpl {

	private class Node {
		int data;
		Node next;
		
		Node(int data,Node next){
			this.data = data;
			this.next = next;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public LinkedListImpl() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public void addFirst(int data) {
		Node node = new Node(data,this.head);
		this.head = node;
		if (this.isEmpty()){
			this.tail = node;
		}
		this.size++;
	}
	
	public void addLast(int data)  {
		Node node = new Node(data,null);
		if (this.isEmpty()){
			this.head = node;
		}else {
			this.tail.next = node;
		}
		this.tail = node;
		this.size++;
	}
	
	private Node getNodeAt(int index) throws Exception {
		if (index >= this.size || index < 0) {
			throw new Exception("Invalid Index");
		}
		Node currNode = this.head;
		for (int counter=0;counter<index;counter++) {
			currNode = currNode.next;
		}
		return currNode;
	}
	
	public void addAt(int index,int data)throws Exception {
		if (index>size || index<0) {
			throw new Exception("Invalid Index");
		}
		if (index==0) {
			addFirst(data);
		} else if(index==this.size) {
			addLast(data);
		} else {
			Node temp = this.getNodeAt(index - 1);
			Node node = new Node(data, temp.next);
			temp.next = node;
			this.size++;
		}
	}
	
	public void display() {
		if (this.isEmpty()){
			System.out.println("List is Empty");
		}else {
			Node temp = this.head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}
	
	public int getFirst() throws Exception{
		if(this.isEmpty()) {
			throw new Exception("List is Empty");	
		}
		return this.head.data;		
	}
	
	public int getLast() throws Exception{
		if(this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		return this.tail.data;
	}
	
	public int getAt(int index) throws Exception{
		if(this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		if (index <0 || index >= size) {
			throw new Exception("Invalid index");
		}
		return this.getNodeAt(index).data;
	}
	
	public void removeFirst()throws Exception{
		if(this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}
		this.size--;
	}
	
	public void removeLast() throws Exception{
		if(this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node temp = getNodeAt(this.size() - 2);
			temp.next = null;
			this.tail = temp;
		}
		this.size--;
	}
	
	public void removeAt(int index) throws Exception{
		if(this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		if (index <0 || index >= size) {
			throw new Exception("Invalid index");
		}
		if (index == 0) {
			this.removeFirst();
		} else if (index == this.size - 1) {
			this.removeLast();
		} else {
			Node temp = getNodeAt(index - 1);
			temp.next = temp.next.next;
			this.size--;
		}
	}
}
