package queue_list;

import java.util.ArrayDeque;

public class Array_Deque {

	public static void main(String[] args) {
		ArrayDeque <Integer> adq = new ArrayDeque<>();
		
		adq.offer(10);
		adq.offerFirst(20);
		adq.offerLast(30);
		adq.offer(40);
		
		System.out.println(adq);
		
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		System.out.println("poll " + adq.poll());
		System.out.println(adq);
		System.out.println("pollFirst " + adq.pollFirst());
		System.out.println(adq);
		System.out.println("pollLast " + adq.pollLast());
		System.out.println(adq);
	}

}
