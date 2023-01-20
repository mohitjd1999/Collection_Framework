package linked_list;

import java.util.Scanner;

public class MidPoint {
	
	public static Node<Integer>midPoint(Node<Integer> head) {
		
		if(head == null) {
			return head;
		}
		
		Node<Integer> slow = head, fast = head;
		
		while(fast.next != null && fast.next.next != null) {
	    	slow = slow.next;
	    	fast = fast.next.next;
	    } 	       
	    return slow;
		
	}
	
	public static void printR(Node<Integer> head) {
		
		if(head == null) {
			return;
		}
		
		System.out.print(head.data + " ");
		printR(head.next);
	}
	

	public static Node<Integer>takeInput(){
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		Node<Integer>head=null, tail=null;
		
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			
			if(head == null) {
				head=currentNode;
				tail=currentNode;
			}else {
				tail.next = currentNode;
				tail = currentNode;
			}
			
			data = sc.nextInt();
			
		}
		
		return head;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        Node<Integer> head = takeInput();
        
        head = midPoint(head);
        
        System.out.println(head.data);
        
//		printR(head);
	}

}
