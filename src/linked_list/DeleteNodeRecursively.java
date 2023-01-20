package linked_list;

import java.util.Scanner;

public class DeleteNodeRecursively {
	
	public static Node<Integer> deleteR(Node<Integer> head, int pos) {
		
		if(head.next == null && pos>0) {
			return head;
		}
		
		if(pos == 0) {
			head = head.next;
			return head;
		}else {
//			Node<Integer> smallerHead = insertR(head.next, pos-1);
//			head.next = smallerHead;
			
			head.next = deleteR(head.next, pos-1);
			return head;
		}
		
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
        
        int pos = sc.nextInt();
        
        head = deleteR(head, pos);
        
		printR(head);
	}

}
