package linked_list;

import java.util.Scanner;

public class PrintRecursively {
	
	public static void printR(Node<Integer> head) {
		
		if(head == null) {
			return;
		}
		printR(head.next);
		System.out.print(head.data + " ");
		
	}
	
//	public static void print(Node<Integer> head) {
//		Node<Integer>prev = head;
//		
//		while(prev!=null) {
//			System.out.print(prev.data + " ");
//			prev = prev.next;
//		}
//		
//		System.out.println();
//	}

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
		
        Node<Integer> head = takeInput();
        
		printR(head);
	}

}
