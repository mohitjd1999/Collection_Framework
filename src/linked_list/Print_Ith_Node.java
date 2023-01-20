package linked_list;

import java.util.Scanner;

public class Print_Ith_Node {
	
	public static void print(Node<Integer> head, int i) {
		Node<Integer> temp = head;
		int count = 0;
        while(temp!=null){
            if(count == i){
                System.out.println(temp.data);
            }
            count++;
            temp = temp.next;
        }
		
	}
	
//	public static void print(Node<Integer> head){
//        while(head != null){
//            System.out.print(head.data + " ");
//            head = head.next;
//        }
//        System.out.println();
//    }
	
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
		int i = sc.nextInt();
		
		print(head, i);

		
	}

}
