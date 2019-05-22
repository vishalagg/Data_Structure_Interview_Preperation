package Tree;

public class BT1 {

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
	
	public BT1() {
		this.root = null;
	}
	
	public void inorder(Node node) {
		if (node!=null) {
			inorder(node.left);
			System.out.print(node.data + "  ");
			inorder(node.right);
		}
	}
	
	private class Queue {
		int front;
		int rear;
		Node[] queue;
		int size;
		
		Queue(int size) {
			this.front = 0;
			this.rear = 0;
			this.size = size;
			this.queue = new Node[size];
		}
		
		public void enque(Node data) {
			this.rear = (this.rear+1)%this.size;
			if(front==rear) {
//				System.out.print("Queue is full");
				if(rear==0) {
					rear = this.size-1;
				}else{
					rear = rear-1;
				}
				return;
			}
			this.queue[rear] = data;
		}
		
		public Node deque() {
			if(front==rear) {
//				System.out.println("Underflow");
				return null;
			}else {
				front = (front+1)%this.size;
				return this.queue[front];
			}
		}
	}
	
	public void levelOrder() {
		if(this.root!=null) {
			 Queue queue = new Queue(10);
			 levelOrder(this.root,queue);
		}
	}

	private void levelOrder(Node node, Queue queue) {
		if(node!=null) {
			System.out.print(node.data+"  ");
			if(node.left!=null)
				queue.enque(node.left);
			if(node.right!=null)
				queue.enque(node.right);
			Node nextNode = queue.deque();
			if(nextNode!=null) {
				levelOrder(nextNode, queue);
			}
		}	
	}

	public static void main(String[] args) {
		BT1 tree = new BT1();
		tree.root = tree.new Node(1,null,null);
		tree.root.left = tree.new Node(2,null,null);
		tree.root.right = tree.new Node(3,null,null);
		tree.root.left.left = tree.new Node(4,null,null);
		tree.root.left.right = tree.new Node(5,null,null);
		tree.root.right.left = tree.new Node(6,null,null);
		tree.root.right.right = tree.new Node(7,null,null);
		System.out.print("Inoreder Traversal : ");
		tree.inorder(tree.root);
		System.out.println();
		System.out.print("level order : ");
		tree.levelOrder();
	}
	
}
