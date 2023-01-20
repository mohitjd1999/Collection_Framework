package linked_list;

import java.util.Scanner;

public class FindNode {
	
	public static int findNode(Node<Integer> head, int n) {

		Node <Integer> prev = head;

		int count =0;
        while(prev!=null){
          if(prev.data == n){
             return count;
          }
              
          count++;
          prev = prev.next;
        }
      
        if(prev==null){
         count = -1;
        }      
        
        return count;
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
		int n = sc.nextInt();
		
		System.out.println(findNode(head, n));
		
//		print(head);

		
	}

}
