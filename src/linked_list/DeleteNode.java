package linked_list;

import java.util.Scanner;

public class DeleteNode {
	
	public static Node<Integer> delete(Node<Integer> head, int pos) {

		Node <Integer> prev = head;

		if(head==null) {
			return head;
		}
		if(pos==0){
			head = prev.next;
		} else{
			// LinkedListNode <Integer> prev = head;
			int count=0;
			while(prev!=null && prev.next!=null){

				if(count==pos-1){
					prev.next = prev.next.next;
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
		
		head = delete(head, pos);
		
		print(head);

		
	}

}
