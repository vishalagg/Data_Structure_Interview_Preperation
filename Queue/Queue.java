package Queue;

import java.util.Arrays;

public class Queue {
	int front;
	int rear;
	int[] queue;
	int size;
	
	@Override
	public String toString() {
		return "Queue [queue=" + Arrays.toString(queue) + "]";
	}

	Queue(int size) {
		this.front = 0;
		this.rear = 0;
		this.size = size;
		this.queue = new int[size];
	}
	
	public void enque(int data) {
		this.rear = (this.rear+1)%this.size;
		if(front==rear) {
			System.out.print("Queue is full");
			if(rear==0) {
				rear = this.size-1;
			}else{
				rear = rear-1;
			}
			return;
		}
		this.queue[rear] = data;
	}
	
	public int deque() {
		if(front==rear) {
			System.out.println("Underflow");
			return (Integer) null;
		}else {
			front = (front+1)%this.size;
			return this.queue[front];
		}
	}
}
