package Heap;

import java.util.Arrays;

/**
 * @author vishalaggarwal01
 * MaxHeap
 */
public class Heap {

	private Integer[] heap;
	private int currentPosition = -1;
	
	public Heap(int size) {
		this.heap = new Integer[size];
	}
	
	public void insert(int data) {
		if (isFull()) {
			System.out.println("Heap is full");
			return;
		}
		this.heap[++currentPosition] = data;
		fixUp(currentPosition);
	}

	private void fixUp(int index) {
		int parentIndex = (index-1)/2 ;
		
		while(parentIndex>=0 && this.heap[parentIndex]<this.heap[index]) {
			int temp = this.heap[parentIndex];
			this.heap[parentIndex] = this.heap[index];
			this.heap[index] = temp;
			
			index = parentIndex;
			parentIndex = (index-1)/2 ;
		}
	}

	private boolean isFull() {
		return ((this.currentPosition+1) == this.heap.length);
	}
	
	public int getMax() {
		int result = this.heap[0];
		
		this.heap[0] = this.heap[this.currentPosition--];
		this.heap[currentPosition+1] = null;
		fixDown(0, -1);
		return result;
	}

	public void heapsort() {
		for(int i=0;i<=this.currentPosition;++i) {
			int temp = this.heap[0];
			System.out.print(temp + " ");
			this.heap[0] = this.heap[this.currentPosition-i];
			heap[this.currentPosition-i] = temp;
			fixDown(0, this.currentPosition-i-1);
		}
	}
	
	private void fixDown(int index, int upto) {
		if(upto < 0) upto = this.currentPosition ;
		
		while(index <= upto) {
			
			int leftChild = 2*index + 1;
			int rightChild = 2*index + 2;
			
			if(leftChild <= upto) {
				int childToSwap;
				
				if(rightChild > upto) {
					childToSwap = leftChild;
				}else {
					childToSwap = this.heap[leftChild]>this.heap[rightChild]?leftChild:rightChild;
				}
				
				if(this.heap[index] < this.heap[childToSwap]) {
					int temp = this.heap[childToSwap];
					this.heap[childToSwap] = this.heap[index];
					this.heap[index] = temp;					
				}else {
					break;
				}
				index = childToSwap;
			}else {
				break;
			}
		}
	}

	@Override
	public String toString() {
		return "Heap [heap=" + Arrays.toString(heap) + ", currentPosition="
				+ currentPosition + "]";
	}
}
