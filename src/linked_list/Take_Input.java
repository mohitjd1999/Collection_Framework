package linked_list;

import java.util.Scanner;

public class Take_Input {
	
	public static void print(Node<Integer> head) {
		
		Node<Integer> temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		
//		while(head!=null) {
//			System.out.println(head.data + " ");
//			head = head.next;
//		}
		
	}
	
	public static Node<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		Node<Integer> head = null, tail = null;
		
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			
			if(head == null) {
				// Make this node as head node and tail node
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
		int i = sc.nextInt();
		
		Node<Integer> head = takeInput();
		print(head);

		
	}

}
