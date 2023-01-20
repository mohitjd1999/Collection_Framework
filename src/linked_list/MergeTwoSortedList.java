package linked_list;

import java.util.Scanner;

public class MergeTwoSortedList {
	
	public static Node<Integer>mergeTwoSort(Node<Integer> head1, Node<Integer> head2) {
		
		if(head1 == null ){
			return head2;
		}
		
		if(head2 == null) {
			return head1;
		}
		
		Node<Integer> t1=head1, t2=head2, head=null, tail=null;
		
		
		if(t1.data <= t2.data) {
			head = t1;
			tail = t1;
			t1 = t1.next;
		}else {
			head = t2;
			tail = t2;
			t2 = t2.next;
		}
		
		while(t1 != null && t2 != null) {
			if(t1.data <= t2.data) {
				tail.next = t1;
				tail = t1;
				t1 = t1.next;
			}else {
				tail.next = t2;
				tail = t2;
				t2 = t2.next;
			}
		}
		
		// If one list is over(null)
		
		if(t1 != null) {
			tail.next = t1;
		}else {
			tail.next = t2;			
		}
		
		
		return head;
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
		
        Node<Integer> head1 = takeInput();
        
        Node<Integer> head2 = takeInput();
        
        Node<Integer> head = mergeTwoSort(head1, head2);
      
		printR(head);
	}

}
