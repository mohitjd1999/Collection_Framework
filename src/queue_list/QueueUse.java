package queue_list;

public class QueueUse {

	public static void main(String[] args) throws QueueEmptyException {
//		QueueUsingArray queue = new QueueUsingArray(3);
		
		QueueUsingLL<Integer> queue = new QueueUsingLL<Integer>();
		
		int arr[] = {10, 20, 30, 40, 50};
		
		for(int element: arr) {
				queue.enqueue(element);
		}
		
		while(!queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				
			}
		}
		
		
		queue.enqueue(60);
		queue.enqueue(70);
		System.out.println(queue.front());        // 60, 70
		System.out.println(queue.size());         // 2
		
		

	}

}
