package Heap;

public class App {

	public static void main(String[] args) {
		Heap heap = new Heap(10);
		
		heap.insert(20);
		heap.insert(40);
		heap.insert(30);
		heap.insert(50);
		heap.insert(110);
		heap.insert(100);
		heap.insert(8);
		
		System.out.println(heap);
//		System.out.println(heap.getMax());
//		System.out.println(heap.getMax());
//		System.out.println(heap.getMax());
//		System.out.println(heap.getMax());
//		System.out.println(heap.getMax());
//		System.out.println(heap.getMax());
//		System.out.println(heap.getMax());
		heap.heapsort();
		System.out.println();
		System.out.println(heap);
	}
}
