package linked_list;

import java.util.Scanner;

public class InsertNode {
	
	public static Node<Integer> insert(Node<Integer> head, int pos, int data) {
		Node<Integer> newNode = new Node<Integer>(data);
	
		if(pos == 0) {
			newNode.next = head;
			head = newNode;

		}else {
			
			Node<Integer> prev = head;
			int count = 0;
			while(prev!=null){
	            if(count == pos-1){   	
	            	newNode.next = prev.next;
	                prev.next = newNode;  
	            }
	            count++;
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
		int pos = sc.nextInt();
		int data = sc.nextInt();
		
		head = insert(head, pos, data);
		
		print(head);

		
	}

}
