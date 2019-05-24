package Queue;

public class App {

	public static void main(String[] args) {
		
		Queue queue = new Queue(10);
		
		queue.enque(10);
		queue.enque(20);
		queue.enque(30);
		queue.enque(40);
		queue.enque(50);
		
		System.out.println(queue);
//		System.out.println(queue.deque());
		System.out.println(queue.deque());
		queue.enque(100);
		queue.enque(200);
		queue.enque(300);
		queue.enque(400);
//		queue.enque(500);
//		queue.enque(600);
		
		System.out.println(queue);
	}
}
