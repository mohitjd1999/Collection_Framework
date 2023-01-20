package queue_list;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.offer(10);
		pq.offer(30);
		pq.offer(40);
		
		
		System.out.println(pq);      // It prints min value
		
		System.out.println(pq.poll()); // It removes head value(first)
		
		System.out.println(pq);
		
		System.out.println(pq.peek());  // It prints head value
		
		System.out.println(pq);
		
		
		System.out.println();
		
       PriorityQueue<Integer> PQ = new PriorityQueue<>(Comparator.reverseOrder());
		
		PQ.offer(10);
		PQ.offer(30);
		PQ.offer(40);
		
		
		System.out.println(PQ);      // It prints max value initially
		
		System.out.println(PQ.poll()); // It removes head value(first)
		
		System.out.println(PQ);
		
		System.out.println(PQ.peek());  // It prints head value
		
		System.out.println(PQ);
	}

}
