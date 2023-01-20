package linked_list;

import java.util.Scanner;

public class RemoveDuplicateNodes {
	
	public static Node<Integer> removeduplicate(Node<Integer> head) {

		Node <Integer> prev = head;

		if(head==null) {
			return head;
		}
		
		while(prev.next!=null) {
			if(prev.data.equals(prev.next.data)) {
				prev.next = prev.next.next;
			}else {
				prev = prev.next;
			}
		}

		return head;
	}

	
	public static void print(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
	
	public static Node<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		Node<Integer> head = null, tail = null;	
		
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			
			if(head == null) {
				head = currentNode;
				tail = currentNode;
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
		
		head = removeduplicate(head);
		
		print(head);

		
	}

}
