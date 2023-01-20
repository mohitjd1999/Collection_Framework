package queue_list;
import java.util.Queue;
import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		// It works on FIFO
 
		queue.offer(10);                     // adding
		queue.offer(20);        
		queue.offer(30);
		queue.offer(40); 
		
		System.out.println(queue);  
		
		System.out.println(queue.poll());    // removing the first(head) element
		
		System.out.println(queue);
		
		System.out.println(queue.peek());    // returns the head element
		
		System.out.println(queue);
	}

}
