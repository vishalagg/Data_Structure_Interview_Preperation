package Queue;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Deque;
import java.util.Iterator;

public class LRU {
	
	private static Deque<Integer> queue;
	private static Set<Integer> map;
	private static int capacity;
	
	public LRU(int capacity) {
		this.queue = new LinkedList<Integer>();
		this.map = new HashSet<Integer>();
		this.capacity = capacity;
	}
	
	public void refer(int n) {
		
		if (!this.map.contains(n)) {
			if (this.queue.size()==this.capacity) {
				int removedElement = this.queue.removeLast();
				this.map.remove(removedElement);
			}
		} else {
			int index = 0, i = 0;
			Iterator<Integer> itr = this.queue.iterator();
			while(itr.hasNext()) {
				if (itr.next()==n){
					index = i;
					break;
				}
				i += 1;
			}
			queue.remove(n);
		}
		queue.push(n);
		map.add(n);
	}
	
	public void display() {
		Iterator<Integer> itr = this.queue.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
	}
	
	public static void main(String[] args) {
		LRU cache = new LRU(3);
		
		cache.refer(1);
		cache.refer(2);
		cache.refer(3);
		cache.refer(4);
		cache.refer(5);
		cache.refer(1);
		cache.refer(2);
		cache.refer(6);
		
		cache.display();
	}
}
